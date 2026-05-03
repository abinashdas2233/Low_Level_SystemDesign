package com.zomato.factory;

import com.zomato.model.Order;

public class CancelOrderOperation implements IOperationFactory {

    @Override
    public void execute(Order order) {
        System.out.println("Order cancelled. Order ID: " + order.getOrderId());
    }
}