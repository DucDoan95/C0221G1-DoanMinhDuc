package com.example.libary_management.controller;

import com.example.libary_management.exception.NotFoundException;
import com.example.libary_management.exception.QuantityException;
import com.example.libary_management.model.entity.Book;
import com.example.libary_management.model.entity.BorrowBook;
import com.example.libary_management.model.service.IBookService;
import com.example.libary_management.model.service.IBorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/borrow")
public class BorrowBookController {
    @Autowired
    IBookService iBookService;
    @Autowired
    IBorrowBookService iBorrowBookService;

    @GetMapping(value = "/{id}/borrow-form")
    public String borrowForm(@PathVariable Integer id, Model model) {
        Book book = iBookService.findByID(id);
        model.addAttribute("bookList",book);
        return "/view";
    }

    @GetMapping(value = "/{id}/borrow")
    public String borrowBook(@PathVariable Integer id, Model model) throws QuantityException {
        Book book = iBookService.findByID(id);
        Integer quantity = book.getQuantity();
        if (quantity == 0) {
            throw  new QuantityException();
        }
        book.setQuantity(quantity-1);
        iBookService.save(book);
        int code = (int) Math.floor((Math.random()*89999)+10000);
        String borrowCode = String.valueOf(code);
        BorrowBook borrowBook = new BorrowBook();
        borrowBook.setBorrowCode(borrowCode);
        borrowBook.setBook(book);
        System.out.println(borrowBook.toString());
        iBorrowBookService.save(borrowBook);
        model.addAttribute("borrowCode",borrowCode);
        return "borrow_finally";
    }

    @ExceptionHandler(QuantityException.class)
    public String showQuantityExceptionPage(){
        return "error_quantity";
    }

    @GetMapping(value = "/{id}/return-form")
    public String returnForm(@PathVariable Integer id, Model model) {
        Book book = iBookService.findByID(id);
        model.addAttribute("bookList",book);
        return "/return_book";
    }

    @GetMapping(value = "/return_book_by_code")
    public String returnBook(@RequestParam(name = "search") String search,Model model) throws NotFoundException {
        BorrowBook borrowBook = iBorrowBookService.findByCode(search);
        if(borrowBook==null){
            throw new NotFoundException();
        }
        Book book = borrowBook.getBook();
        Integer quantity = book.getQuantity();
        book.setQuantity(quantity+1);
        iBookService.save(book);
        iBorrowBookService.delete(borrowBook.getBorrowId());
        model.addAttribute("msg","Return successfully. Welcome back");
        return "return_book";
    }

    @ExceptionHandler(NotFoundException.class)
    public String showNotFoundExceptionPage(){
        return "error_not_found.html";
    }
}
