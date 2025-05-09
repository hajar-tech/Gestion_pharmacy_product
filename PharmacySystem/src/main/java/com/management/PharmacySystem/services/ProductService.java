package com.management.PharmacySystem.services;

import com.management.PharmacySystem.entities.Product;

import java.util.List;

public interface ProductService {
    String addProduct(Product product);
    Product updateProduct( long id, Product product);
    String deleteProduct(long id);
    List<Product> getAllProducts();
    Product getProductById(long id);
}
