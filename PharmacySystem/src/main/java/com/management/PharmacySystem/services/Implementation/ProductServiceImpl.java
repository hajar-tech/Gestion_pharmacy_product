package com.management.PharmacySystem.services.Implementation;

import com.management.PharmacySystem.entities.Product;
import com.management.PharmacySystem.repositories.ProductRepository;
import com.management.PharmacySystem.services.ProductService;
import jakarta.annotation.Priority;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
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
    public String deleteProduct(long id) {

        productRepository.deleteById(id);
        return ("Product deleted successfully !") ;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {

        return productRepository.findById(id).orElse(null);
    }
    @Override
    public Product updateProduct(long id, Product productDetails) {
       return productRepository.save(productDetails);
//        Product product = productRepository.findById(id).orElseThrow();
//        product.setProductName(product.getProductName());
//        product.setProductDescription(product.getProductDescription());
//        product.setProductPrice(product.getProductPrice());
//        product.setProductQuantity(product.getProductQuantity());
//        return productRepository.save(product);
    }
}


