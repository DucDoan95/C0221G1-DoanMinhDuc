package com.example.blog_update.controller;

import com.example.blog_update.model.entity.Blog;
import com.example.blog_update.model.entity.Category;
import com.example.blog_update.model.service.IBlogService;
import com.example.blog_update.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@Controller
@CrossOrigin
@RequestMapping(value = {"", "/blog"})
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = "/list/")
    public ResponseEntity<Page<Blog>> getListBlog(@RequestParam int page, @RequestParam Optional<String> search) {
        String tittle = "";
        if (search.isPresent()) {
            tittle = search.get();
        }
        Page<Blog> blogList = iBlogService.findByTitle(tittle, PageRequest.of(page , 2));
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }


    @GetMapping(value = "/category/{name}")
    public ResponseEntity<Page<Blog>> getBlogByCategory(@PathVariable String name, @RequestParam Integer page) {
        Page<Blog> blogList = iBlogService.findByCategory(name, PageRequest.of(page , 2));
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping(value = "/view/{id}")
    public ResponseEntity<Blog> getListBlog(@PathVariable Integer id) {
        Blog blog = iBlogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
