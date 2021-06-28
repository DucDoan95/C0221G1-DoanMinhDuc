package com.example.libary_management.model.service;


import com.example.libary_management.model.entity.BorrowBook;

public interface IBorrowBookService {
    void save(BorrowBook borrowBook);
    BorrowBook findByID(Integer id);
    void delete(Integer id);
    BorrowBook findByCode(String code);
}
