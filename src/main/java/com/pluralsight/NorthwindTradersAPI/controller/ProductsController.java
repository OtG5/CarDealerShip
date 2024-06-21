package com.pluralsight.NorthwindTradersAPI.controller;

import com.pluralsight.NorthwindTradersAPI.model.Product;
import com.pluralsight.NorthwindTradersAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping(path="/", method= RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @RequestMapping(path="/products", method=RequestMethod.GET)
    public String products() {
        return productService.getAllProducts();
    }

    @RequestMapping(path="/products", method=RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) {
        return product;
    }
