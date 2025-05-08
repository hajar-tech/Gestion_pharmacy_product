package com.management.PharmacySystem.Controllers;

import com.management.PharmacySystem.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductController {

    @PostMapping()
    String addProduct(@RequestBody Product product);

    @GetMapping("/{id}")
    Product retrieveProduct(@PathVariable long id);

    @GetMapping()
    List<Product> retrieveAllProducts();


}
