package com.example.libary_management.model.service.impl;

import com.example.libary_management.model.entity.Book;
import com.example.libary_management.model.repository.IBookRepository;
import com.example.libary_management.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository iBookRepository;
    @Override
    public Page<Book> findAll(Pageable pageable) {
        return iBookRepository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
        iBookRepository.save(book);
    }


    @Override
    public void delete(Integer id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public Book findByID(Integer id) {
        return iBookRepository.findById(id).orElse(null);
    }


    @Override
    public Page<Book> findByName(String name, Pageable pageable) {
        return iBookRepository.findAllByNameContaining(name,pageable);
    }
}
