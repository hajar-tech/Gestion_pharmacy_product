package com.management.PharmacySystem.Controllers.Implementation;

import com.management.PharmacySystem.Controllers.ProductController;
import com.management.PharmacySystem.entities.Product;
import com.management.PharmacySystem.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
@AllArgsConstructor
public class ProductControllerImpl implements ProductController {
    private ProductService productService;//injecter le service (la liason entre service et cntroller)
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
}
