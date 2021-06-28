package com.example.libary_management.model.repository;


import com.example.libary_management.model.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends PagingAndSortingRepository<Book,Integer> {
    Page<Book> findAllByNameContaining(String name, Pageable pageable);
}
