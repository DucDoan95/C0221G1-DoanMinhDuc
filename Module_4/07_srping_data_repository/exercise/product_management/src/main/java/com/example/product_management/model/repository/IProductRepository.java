package com.example.product_management.model.repository;

import com.example.product_management.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
    Page<Product> findAllByNameContaining(String name, Pageable pageable);
}
