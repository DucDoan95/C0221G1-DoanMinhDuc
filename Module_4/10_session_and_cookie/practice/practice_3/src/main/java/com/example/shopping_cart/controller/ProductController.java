package com.example.shopping_cart.controller;

import com.example.shopping_cart.model.entity.Cart;
import com.example.shopping_cart.model.entity.Product;
import com.example.shopping_cart.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;


@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action, RedirectAttributes redirectAttributes) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("add")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        if (action.equals("get")) {
            cart.getProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        if (action.equals("remove")){
            cart.removeProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        redirectAttributes.addFlashAttribute("msg","Đã thêm "+productOptional.get().getName()+" vào giỏ hàng");
        return "redirect:/shop";
    }
    @GetMapping(value = "/{id}/view-form")
    public String borrowForm(@PathVariable Long id, Model model) {
        Product product = productService.findById(id).orElse(null);
        model.addAttribute("productList",product);
        return "/view";
    }

}
