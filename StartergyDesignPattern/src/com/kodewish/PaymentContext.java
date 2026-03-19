package com.kodewish;

public  class PaymentContext {
	IPaymentStargey payment;
	
	public PaymentContext(IPaymentStargey payment) {
		super();
		this.payment = payment;
	}

	public void makePayment(int amount) {
		payment.pay(amount);
	}

}
