package com.learn.opencloseprinciple;

public class InvoicePrint {
	ICustomerType type;
	public InvoicePrint(ICustomerType type) {
		this.type=type;
	}
	
	public void status() {
		System.out.println("printing price-"+type.calculatePrice());
	}


}
