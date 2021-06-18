package com.exercise.controller;

import com.exercise.model.bean.Product;
import com.exercise.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping(value = "")
    public String index(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping(value = "/create-form")
    public String createForm(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        iProductService.create(product);
        redirectAttributes.addFlashAttribute("success", "Create successfully");
        return "redirect:/product";
    }

    @GetMapping(value = "/{id}/edit-form")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findByID(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.edit(product.getId(), product);
        redirectAttributes.addFlashAttribute("success", "Edit successfully");
        return "redirect:/product";
    }

//    @GetMapping(value = "/{id}/delete-form")
//    public String deleteForm(@PathVariable int id, Model model) {
//        model.addAttribute("product", iProductService.findByID(id));
//        return "/delete";
//    }

    @PostMapping(value = "/delete")
    public String delete(@RequestParam int idProduct, RedirectAttributes redirectAttributes) {
        iProductService.delete(idProduct);
        redirectAttributes.addFlashAttribute("success", "Delete successfully");
        return "redirect:/product";
    }

    @GetMapping(value = "/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findByID(id));
        return "/view";
    }

    @PostMapping(value = "/search")
    public String search(@RequestParam String search, Model model){
        List<Product> productList = iProductService.findByName(search);
        model.addAttribute("products", productList);
        return "/index";
    }
}
