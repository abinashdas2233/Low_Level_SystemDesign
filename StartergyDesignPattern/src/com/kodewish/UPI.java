package com.kodewish;

public class UPI implements IPaymentStargey {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("payment done using upi of rs-"+amount);
	}

}
