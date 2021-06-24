package com.example.blog_extend.model.service.impl;

import com.example.blog_extend.model.entity.Category;
import com.example.blog_extend.model.repository.ICategoryRepository;
import com.example.blog_extend.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findByAll() {
        return (List<Category>) iCategoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return iCategoryRepository.save(category);
    }
}
