package com.example.exercise.model.service;

import com.example.exercise.model.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findByAll();
    Blog findById(Integer id);
    void save(Blog blog);
    void remove(Integer id);

}
