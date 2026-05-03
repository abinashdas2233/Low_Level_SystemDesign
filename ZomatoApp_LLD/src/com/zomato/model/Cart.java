package com.zomato.model;


import java.util.ArrayList;
import java.util.List;

public class Cart {
	private Restaurant restaurant;
    private List<MenuItems> items = new ArrayList<>();
    
    public Cart() {
        restaurant = null;
    }

    public void addItem(MenuItems item) {
        if (restaurant == null) {
            System.err.println("Cart: Set a restaurant before adding items.");
            return;
        }
        items.add(item);
    }

    public double getTotalCost() {
        double sum = 0;
        for (MenuItems it : items) {
            sum += it.getPrice();
        }
        return sum;
    }

    public boolean isEmpty() {
        return restaurant == null || items.isEmpty();
    }

    public void clear() {
        items.clear();
        restaurant = null;
    }

    public void setRestaurant(Restaurant r) {
        restaurant = r;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<MenuItems> getItems() {
        return items;
    }


}
