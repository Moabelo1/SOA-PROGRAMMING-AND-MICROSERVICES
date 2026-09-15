package com.klef.RestaurantServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public List<Restaurant> getAllRestaurants() {

        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(
            new Restaurant(
                1,
                "Paradise Restaurant",
                "Hyderabad"
            )
        );

        restaurants.add(
            new Restaurant(
                2,
                "Spice Garden",
                "Vijayawada"
            )
        );

        restaurants.add(
            new Restaurant(
                3,
                "Food Palace",
                "Tenali"
            )
        );

        return restaurants;
    }
}