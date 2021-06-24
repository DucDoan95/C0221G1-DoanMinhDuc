package com.example.blog_extend.model.service;

import com.example.blog_extend.model.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findByAll();
    Category save(Category category);
}
