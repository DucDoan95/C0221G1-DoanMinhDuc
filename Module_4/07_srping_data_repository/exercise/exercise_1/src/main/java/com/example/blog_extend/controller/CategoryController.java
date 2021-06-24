package com.example.blog_extend.controller;

import com.example.blog_extend.model.entity.Blog;
import com.example.blog_extend.model.entity.Category;
import com.example.blog_extend.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
@RequestMapping(value = ("/category"))
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = "/create")
    public String showCreateForm( Model model){
        model.addAttribute("category",new Category());
        return "/category/create";
    }

    @PostMapping(value = "/create")
    public String saveBlog(@ModelAttribute Category category, Model model , RedirectAttributes redirectAttributes){
        iCategoryService.save(category);
        redirectAttributes.addFlashAttribute("message", "Category created successfully");
        return "redirect:/blog/list";
    }
}
