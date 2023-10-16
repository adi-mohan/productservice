package dev.aditya.productservice.controllers;

import dev.aditya.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    // @Autowired
    // Field injection (not recommended)
    private ProductService productService;

    // constructor injection (preferred)
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // @Autowired
    // setter injection (not recommended)
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public void getAllProducts() {

    }

    // localhost:8080/products/123
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return "Here is product id: " + id;
    }
    @DeleteMapping("{id}")
    public void deleteProductById() {

    }
    @PostMapping
    public void createProduct() {

    }
    @PutMapping("{id}")
    public void updateProductById() {

    }
}
