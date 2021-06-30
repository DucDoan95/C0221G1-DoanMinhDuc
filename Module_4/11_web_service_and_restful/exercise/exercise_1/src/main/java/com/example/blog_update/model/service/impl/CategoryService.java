package com.example.blog_update.model.service.impl;

import com.example.blog_update.model.entity.Category;
import com.example.blog_update.model.repository.ICategoryRepository;
import com.example.blog_update.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public Page<Category> findByAll(Pageable pageable) {
        return iCategoryRepository.findAll(pageable);
    }

    @Override
    public Category save(Category category) {
        return iCategoryRepository.save(category);
    }
}
