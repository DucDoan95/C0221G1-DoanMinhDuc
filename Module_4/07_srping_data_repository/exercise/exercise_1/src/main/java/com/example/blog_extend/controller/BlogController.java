package com.example.blog_extend.controller;

import com.example.blog_extend.model.entity.Blog;
import com.example.blog_extend.model.service.IBlogService;
import com.example.blog_extend.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping(value = {"","/blog"})
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;
    @GetMapping(value = "/list")
    public String showList(@RequestParam(name = "search") Optional<String> search , @PageableDefault(size = 5) Pageable page, Model model){
        Page<Blog> blogs ;
        if(search.isPresent()){
            blogs = iBlogService.findByTitle(search.get(), page);
            model.addAttribute("search", search.get());
        } else{
            blogs = iBlogService.findByAll(page);
        }
        model.addAttribute("categoryList",iCategoryService.findByAll());
        model.addAttribute("blogList", blogs);
        return "/blog/list";
    }

    @GetMapping(value = "/edit")
    public String showEditForm(@RequestParam Integer id, Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        model.addAttribute("categoryList",iCategoryService.findByAll());
        return "/blog/edit";
    }

    @PostMapping(value = "/edit")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Update blog information successfully!");
        return "redirect:/blog/list";
    }

    @GetMapping(value = "/create")
    public String showCreateForm( Model model){
        model.addAttribute("categoryList",iCategoryService.findByAll());
        model.addAttribute("blog",new Blog());
        return "/blog/create";
    }

    @PostMapping(value = "/create")
    public String saveBlog(@ModelAttribute Blog blog,Model model ,RedirectAttributes redirectAttributes){
        blog.setDateWrite(new Date());
        iBlogService.save(blog);
        model.addAttribute("categoryList",iCategoryService.findByAll());
        redirectAttributes.addFlashAttribute("message", "Blog created successfully");
        return "redirect:/blog/list";
    }

    @GetMapping(value = "/delete")
    public String showDeleteForm(@RequestParam Integer id, Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "/blog/delete";
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
        return "/blog/view";
    }

    @GetMapping(value = "/searchCategory")
    public String searchCategory(@RequestParam Integer id,@PageableDefault(size = 2) Pageable pageable, Model model){
        Page<Blog> blog = iBlogService.findByCategory(id,pageable);
        model.addAttribute("blogList",blog);
        model.addAttribute("categoryList",iCategoryService.findByAll());
        return "/blog/list";
    }

}
