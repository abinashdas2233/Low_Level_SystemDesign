package com.zomato.controller;

import java.util.List;

import com.zomato.factory.IOperationFactory;
import com.zomato.factory.OperationFactory;
import com.zomato.manager.ResturantManager;
import com.zomato.model.Cart;
import com.zomato.model.MenuItems;
import com.zomato.model.Order;
import com.zomato.model.Restaurant;
import com.zomato.model.User;
import com.zomato.satergy.CreditCardPayment;
import com.zomato.satergy.PaymentContext;

public class Main {

    public static void main(String[] args) {

        // 1. Create Restaurant
        Restaurant r1 = new Restaurant("Dominos", "Bangalore");
        r1.addMenuItem(new MenuItems("101","Pizza", 200));
        r1.addMenuItem(new MenuItems("102","Burger", 100));

        // 2. Add to manager
        ResturantManager manager = ResturantManager.getInstance();
        manager.addRestaurant(r1);

        // 3. Search restaurant
        List<Restaurant> restaurants = manager.searchByLocation("bangalore");
        Restaurant selectedRestaurant = restaurants.get(0);

        // 4. Create user
        User user = new User(230, "abinash", "blr");

        // 5. Create cart
        Cart cart = new Cart();
        cart.setRestaurant(selectedRestaurant);

        // Add items
        cart.addItem(selectedRestaurant.getMenu().get(0));
        cart.addItem(selectedRestaurant.getMenu().get(1));
        
        user.setCart(cart);

        // 6. Create Order
        Order order = new Order(
                121,
                user,
                selectedRestaurant,
                cart.getItems(),
                new CreditCardPayment(),
                cart.getTotalCost()
        );

        // 7. PLACE ORDER
        IOperationFactory placeOp = OperationFactory.getOperation("place");
        placeOp.execute(order);
        

        // 8. PAY ORDER
        IOperationFactory payOp = OperationFactory.getOperation("pay");
        payOp.execute(order);
        
        PaymentContext payment=new PaymentContext();
        payment.paymentMethod("creditcard", cart.getTotalCost());

        // 9. CANCEL ORDER (optional)
        //IOperationFactory cancelOp = OperationFactory.getOperation("cancel");
        //cancelOp.execute(order);
    }
}