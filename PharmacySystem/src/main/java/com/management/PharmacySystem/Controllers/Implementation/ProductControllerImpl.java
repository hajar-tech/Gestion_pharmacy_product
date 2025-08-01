package com.management.PharmacySystem.Controllers.Implementation;

import com.management.PharmacySystem.Controllers.ProductController;
import com.management.PharmacySystem.entities.Product;
import com.management.PharmacySystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/products")
@RestController

public class ProductControllerImpl implements ProductController {
    //injecter le service (la liason entre service et cntroller)
    // 💡 Injection par constructeur (meilleure pratique)

    private final ProductService productService;

    @Autowired
    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public String addProduct(Product product) {
        return productService.addProduct(product);
    }

    @Override
    public Product retrieveProduct(long id) {
        return productService.getProductById(id);
    }

    @Override
    public List<Product> retrieveAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    public String deleteProduct(long id) {
        return productService.deleteProduct(id);
    }

    @Override
    public Product updateProduct(long id , Product product) {
        return productService.updateProduct(id, product) ;
    }
}
