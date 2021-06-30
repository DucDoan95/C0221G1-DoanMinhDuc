package com.example.blog_update.model.service;

import com.example.blog_update.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    Page<Category> findByAll(Pageable pageable);
    Category save(Category category);
}
