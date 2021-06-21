package com.exercise.repository.impl;

import com.exercise.model.entity.Comment;
import com.exercise.repository.BaseRepository;
import com.exercise.repository.ICommentService;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class CommentRepository implements ICommentService {
    @Override
    public void save(Comment comment) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(comment);
        entityTransaction.commit();
    }

    @Override
    public List<Comment> findAll() {
        return BaseRepository.entityManager.createQuery(
                "select c from Comment c",Comment.class).getResultList();
    }

    @Override
    public Comment findById(int id) {
        return BaseRepository.entityManager.find(Comment.class,id);
    }

    @Override
    public void like(int id) {
        Comment comment = findById(id);
        comment.setLikes(comment.getLikes()+1);
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(comment);
        entityTransaction.commit();
    }


}
