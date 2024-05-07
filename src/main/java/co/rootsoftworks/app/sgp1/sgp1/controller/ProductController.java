package co.rootsoftworks.app.sgp1.sgp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.rootsoftworks.app.sgp1.sgp1.entity.Product;
import co.rootsoftworks.app.sgp1.sgp1.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String list(){
        List<Product> products = productService.findAll();
        return "";
    }

}
