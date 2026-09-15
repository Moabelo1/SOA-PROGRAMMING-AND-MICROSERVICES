package com.klef.OrderServices_1;

public class Order {

    private int userId;
    private int restaurantId;
    private String items;

    public Order() {
    }

    public Order(int userId, int restaurantId, String items) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.items = items;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}