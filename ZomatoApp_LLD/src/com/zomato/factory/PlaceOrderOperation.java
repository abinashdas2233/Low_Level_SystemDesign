package com.zomato.factory;

import com.zomato.model.Order;

public class PlaceOrderOperation implements IOperationFactory {

   

	@Override
	public void execute(Order order) {
		// TODO Auto-generated method stub
		 System.out.println("Order placed successfully. Order ID: " + order.getOrderId());
		
	}
}