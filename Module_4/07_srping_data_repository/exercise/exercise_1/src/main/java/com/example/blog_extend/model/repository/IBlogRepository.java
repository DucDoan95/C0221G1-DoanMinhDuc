package com.example.blog_extend.model.repository;

import com.example.blog_extend.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
}
