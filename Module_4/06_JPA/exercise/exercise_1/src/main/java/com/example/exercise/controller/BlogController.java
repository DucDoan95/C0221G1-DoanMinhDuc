package com.example.exercise.controller;

import com.example.exercise.model.entity.Blog;
import com.example.exercise.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = {"","/blog"})
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @GetMapping(value = "/list")
    public String showListBlog(Model model){
        List<Blog> blogList = iBlogService.findByAll();
        model.addAttribute("blogList",blogList);
        return "list";
    }

    @GetMapping(value = "/edit")
    public String showEditForm(@RequestParam Integer id, Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Update blog information successfully!");
        return "redirect:/blog/list";
    }

    @GetMapping(value = "/create")
    public String showCreateForm( Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    @PostMapping(value = "/create")
    public String saveBlog(@ModelAttribute Blog blog,Model model ,RedirectAttributes redirectAttributes){
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Blog created successfully");
        return "redirect:/blog/list";
    }

    @GetMapping(value = "/delete")
    public String showDeleteForm(@RequestParam Integer id, Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "delete";
    }
    @PostMapping(value = "/delete")
    public String deleteBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("message", "Delete blog  successfully!");
        return "redirect:/blog/list";
    }


    @GetMapping(value = "/view")
    public String showViewForm(@RequestParam Integer id, Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "view";
    }

}
