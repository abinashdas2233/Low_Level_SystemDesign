package com.learn.opencloseprinciple;

public class ShopController {
	public static void main(String[] args) {
		ICustomerType type1=new PrimeCustomer(900.00);
		ICustomerType type2=new  NonPrimeCustomer(900.00);
		StoreDB db1=new StoreDB(type1);
		StoreDB db2=new StoreDB(type2);
		
		db1.status();
		db2.status();
		
		InvoicePrint print=new InvoicePrint(type1);
		InvoicePrint print2=new InvoicePrint(type2);
		
		print.status();
		print2.status();
		
		
	}

}
