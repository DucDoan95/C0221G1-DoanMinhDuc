package com.example.blog_update.model.repository;

import com.example.blog_update.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

   @Query(value="select * from blog join category on category.id = blog.id_category where category.name like :nameCategory",nativeQuery=true)
   Page<Blog> findAllByCategory_Name(@Param("nameCategory") String nameCategory , Pageable pageable);
    @Query(value="select * from blog order by date_write",nativeQuery=true)
    List<Blog> findAll();
}
