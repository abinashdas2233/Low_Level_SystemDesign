package com.learn.opencloseprinciple;

public class StoreDB {
	ICustomerType type;
	public StoreDB(ICustomerType type) {
		this.type=type;
	}
	
	public void status() {
		System.out.println("store in db price-"+type.calculatePrice());
	}

}
