package com.management.PharmacySystem.services.Implementation;

import com.management.PharmacySystem.entities.Product;
import com.management.PharmacySystem.repositories.ProductRepository;
import com.management.PharmacySystem.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
//injection des dependence
@AllArgsConstructor
@NoArgsConstructor

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository  ;//la relation entre la couche repository et la couche service

    @Override
    public String addProduct(Product product) {
        productRepository.save(product);
        return ("Product added successfully !");
    }

    @Override
    public String updateProduct(Product product) {
        return "";
    }

    @Override
    public String deleteProduct(long id) {
        return "";
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {

        return productRepository.findById(id).orElse(null);
    }
}
