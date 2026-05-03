package com.zomato.satergy;

public class DebitCard implements IPaymentStrategy{

	@Override
	public void payment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of rupees-"+amount+" done through debit card.");
		
	}

}
