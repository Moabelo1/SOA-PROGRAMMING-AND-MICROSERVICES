package com.klef.OrderServices_1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdeerController {

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {

        return order;
    }
}