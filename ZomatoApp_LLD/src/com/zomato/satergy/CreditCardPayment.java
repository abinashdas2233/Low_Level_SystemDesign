package com.zomato.satergy;

public class CreditCardPayment implements IPaymentStrategy {

	@Override
	public void payment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of rupees-"+amount+" done through creditcard.");
		
	}

}
