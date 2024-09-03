package org.example.controllers;

import org.example.model.product;
import org.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/products")
    public  String viewProducts(Model model){
        var products = productService.findAll();
        model.addAttribute("products",products);

        return "products.html";
    }

    @RequestMapping(value = "/products",method = RequestMethod.POST )
    public String addProduct(
            //@RequestParam String name,
            //@RequestParam double price,
            product p,
            Model model){
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

}
