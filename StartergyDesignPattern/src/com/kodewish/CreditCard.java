package com.kodewish;

public class CreditCard implements IPaymentStargey {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("credit card payment done of rs-"+amount);
		
	}
	

}
