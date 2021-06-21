package com.exercise.repository;

import com.exercise.model.entity.Comment;

import java.util.List;

public interface ICommentService {
    void save(Comment comment);
    List<Comment> findAll();
    Comment findById(int id);
    void like(int id);
}
