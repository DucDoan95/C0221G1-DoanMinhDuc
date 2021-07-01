package com.example.blog_update.controller;

import com.example.blog_update.model.entity.Blog;
import com.example.blog_update.model.entity.Category;
import com.example.blog_update.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

@RestController
@Controller
@RequestMapping(value = ("/category"))
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = "/list/{page}")
    public ResponseEntity<Page<Category>> showListCategory(@PathVariable Integer page){
        Page<Category> categoryList = iCategoryService.findByAll(PageRequest.of(page,3));

        if(categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }
}
