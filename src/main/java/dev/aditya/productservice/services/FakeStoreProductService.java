package dev.aditya.productservice.services;

import dev.aditya.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements ProductService{

    @Override
    public Product getProductById(Long id) {
        return new Product();
    }
}
