package com.management.PharmacySystem.services.Implementation;

import com.management.PharmacySystem.entities.Product;
import com.management.PharmacySystem.repositories.ProductRepository;
import com.management.PharmacySystem.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//injection des dependence
//@AllArgsConstructor



public class ProductServiceImpl implements ProductService {

   //la relation entre la couche repository et la couche service
   private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

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
