package com.example.blog_update.model.service;

import com.example.blog_update.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findByAll(Pageable pageable);
    Blog findById(Integer id);
    void save(Blog blog);
    void remove(Integer id);
    Page<Blog> findByTitle(String title, Pageable pageable);
    Page<Blog> findByCategory(String nameCategory,Pageable pageable);
}
