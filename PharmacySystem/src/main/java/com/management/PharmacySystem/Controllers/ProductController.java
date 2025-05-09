package com.management.PharmacySystem.Controllers;

import com.management.PharmacySystem.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductController {

    @PostMapping()
    String addProduct(@RequestBody Product product);

    @GetMapping("/{id}")
    Product retrieveProduct(@PathVariable long id);

    @GetMapping()
    List<Product> retrieveAllProducts();

    @DeleteMapping("/{id}")
    String deleteProduct(@PathVariable long id);

    @PutMapping("/{id}")
    Product updateProduct( @PathVariable long id ,@RequestBody Product product);

}
