package com.zomato.satergy;

public class PaymentContext {
	
	public void paymentMethod(String type,double amount) {
		
		if(type.toLowerCase().equals("creditcard")) {
			IPaymentStrategy st=new CreditCardPayment();
			st.payment(amount);
			
		}
		else {
			IPaymentStrategy st=new DebitCard();
			st.payment(amount);
		}
	}

}
