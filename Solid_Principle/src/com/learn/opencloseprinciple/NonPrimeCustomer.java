package com.learn.opencloseprinciple;

public class NonPrimeCustomer implements ICustomerType {
	private double totalPrice;

	public NonPrimeCustomer(double totalPrice) {
		super();
		this.totalPrice = totalPrice;
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return totalPrice;
	}

}
