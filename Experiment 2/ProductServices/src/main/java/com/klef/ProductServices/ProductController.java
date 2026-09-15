package com.klef.ProductServices;



import com.klef.ProductServices.Model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {

        List<Product> products = new ArrayList<>();

        products.add(
            new Product(1, "Laptop", 55000.00)
        );

        products.add(
            new Product(2, "Mobile Phone", 25000.00)
        );

        products.add(
            new Product(3, "Headphones", 3000.00)
        );

        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {

        if (id == 1) {
            return new Product(1, "Laptop", 55000.00);
        }

        if (id == 2) {
            return new Product(2, "Mobile Phone", 25000.00);
        }

        if (id == 3) {
            return new Product(3, "Headphones", 3000.00);
        }

        return null;
    }
}