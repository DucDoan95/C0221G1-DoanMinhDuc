package com.example.libary_management.model.repository;

import com.example.libary_management.model.entity.BorrowBook;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowBookRepository extends PagingAndSortingRepository<BorrowBook,Integer> {
    BorrowBook findBorrowBookByBorrowCode(String code);
}
