package com.example.libary_management.model.service;

import com.example.libary_management.model.entity.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {
    Page<Book> findAll(Pageable pageable);
    void save(Book book);
    Book findByID(Integer id);
    void delete(Integer id);
    Page<Book> findByName(String name, Pageable pageable);

}
