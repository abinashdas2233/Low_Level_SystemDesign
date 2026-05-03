package com.zomato.factory;

import com.zomato.model.Order;
import com.zomato.satergy.IPaymentStrategy;

public class PayOrderOperation implements IOperationFactory {

    @Override
    public void execute(Order order) {
        System.out.println("Payment processed for Order ID: " + order.getOrderId());
        
    }
}