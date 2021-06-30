package com.example.blog_update.model.service.impl;

import com.example.blog_update.model.entity.Blog;
import com.example.blog_update.model.repository.IBlogRepository;
import com.example.blog_update.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;
    @Override
    public Page<Blog> findByAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
         iBlogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findByTitle(String title ,Pageable pageable) {
        return iBlogRepository.findAllByTitleContaining(title,pageable);
    }

    @Override
    public Page<Blog> findByCategory(String nameCategory,Pageable pageable) {
        return iBlogRepository.findAllByCategory_Name("%"+nameCategory+"%",pageable);
    }
}
