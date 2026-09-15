package com.klef.CartServices_1;

import com.klef.CartServices_1.model.Cart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public List<Cart> getCart() {

        List<Cart> cart = new ArrayList<>();

        cart.add(
            new Cart(1, 1, 2)
        );

        cart.add(
            new Cart(2, 3, 1)
        );

        return cart;
    }

    @GetMapping("/{id}")
    public Cart getCartItem(@PathVariable int id) {

        if (id == 1) {
            return new Cart(1, 1, 2);
        }

        if (id == 2) {
            return new Cart(2, 3, 1);
        }

        return null;
    }
}