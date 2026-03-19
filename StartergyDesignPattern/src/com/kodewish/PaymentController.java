package com.kodewish;

public class PaymentController {

	public static void main(String[] args) {
		IPaymentStargey payment1=new UPI();
		PaymentContext upi=new PaymentContext(payment1) ;
		upi.makePayment(200);
		IPaymentStargey payment2=new CreditCard();
		PaymentContext credit=new PaymentContext(payment2);
		credit.makePayment(300);
	}
	

}
