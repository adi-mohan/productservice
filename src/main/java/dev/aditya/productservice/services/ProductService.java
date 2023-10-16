package dev.aditya.productservice.services;

import dev.aditya.productservice.models.Product;

public interface ProductService {

    Product getProductById(Long id);
}
