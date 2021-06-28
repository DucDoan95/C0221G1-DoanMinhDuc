package com.example.libary_management.model.service.impl;

import com.example.libary_management.model.entity.BorrowBook;
import com.example.libary_management.model.repository.IBorrowBookRepository;

import com.example.libary_management.model.service.IBorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowBookService implements IBorrowBookService {
    @Autowired
    IBorrowBookRepository iBorrowBookRepository;
    @Override
    public void save(BorrowBook borrowBook) {
        iBorrowBookRepository.save(borrowBook);
    }

    @Override
    public BorrowBook findByID(Integer id) {
        return iBorrowBookRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        iBorrowBookRepository.deleteById(id);
    }

    @Override
    public BorrowBook findByCode(String code) {
        return iBorrowBookRepository.findBorrowBookByBorrowCode(code);
    }
}
