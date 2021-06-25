package com.example.product_management.controller;

import com.example.product_management.model.entity.Product;
import com.example.product_management.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    IProductService iProductService;
@GetMapping(value = "")
    public String showList(@RequestParam(name = "search") Optional<String> search , @PageableDefault(size = 5) Pageable page, Model model){
        Page<Product> products ;
        if(search.isPresent()){
            products = iProductService.findByName(search.get(), page);
            model.addAttribute("search", search.get());
        } else{
            products = iProductService.findAll(page);
        }
        model.addAttribute("products", products);
        return "/index";
    }

    @GetMapping(value = "/create-form")
    public String createForm(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.create(product);
        redirectAttributes.addFlashAttribute("success", "Create successfully");
        return "redirect:/product/";
    }

    @GetMapping(value = "/{id}/edit-form")
    public String editForm(@PathVariable Integer id, Model model) {
        Product product = iProductService.findByID(id);
        model.addAttribute("product",product);
        return "/edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.create(product);
        redirectAttributes.addFlashAttribute("success", "Edit successfully");
        return "redirect:/product/";
    }

    @GetMapping(value = "/{id}/delete-form")
    public String deleteForm(@PathVariable Integer id, Model model) {
        Product product = iProductService.findByID(id);
        model.addAttribute("product",product);
        return "/delete";
    }
    @PostMapping(value = "/delete")
    public String delete(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.delete(product.getId());
        redirectAttributes.addFlashAttribute("success", "Delete successfully");
        return "redirect:/product/";
    }

    @GetMapping(value = "/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("product", iProductService.findByID(id));
        return "/view";
    }
}
