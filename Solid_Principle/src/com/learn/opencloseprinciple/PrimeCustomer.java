package com.learn.opencloseprinciple;

public class PrimeCustomer implements ICustomerType {
	private double totalPrice;

	public PrimeCustomer(double totalPrice) {
		super();
		this.totalPrice = totalPrice;
	}

	public PrimeCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePrice() {
		//20% discount
		return totalPrice-0.20*totalPrice ;
	}
	

}
