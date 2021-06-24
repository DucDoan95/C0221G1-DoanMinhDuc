package com.example.blog_extend.model.repository;

import com.example.blog_extend.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
    Page<Blog> findAllByCategory_Id(Integer idCategory, Pageable pageable);
    @Query(value="select * from blog order by date_write",nativeQuery=true)
    Page<Blog> findAll(Pageable pageable);
}
