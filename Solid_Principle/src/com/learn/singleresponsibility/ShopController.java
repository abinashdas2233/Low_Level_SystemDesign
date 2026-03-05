package com.learn.singleresponsibility;

public class ShopController {
	public static void main(String[] args) {
		Product p1=new Product(900.00,"aswini");
		
		ShoppingCart sc=new ShoppingCart();
		sc.calculatePrice(p1.getPrice(), "prime");
		Invoice invo=new Invoice(sc, p1);
		invo.printInvoice();
		DBStorage db=new DBStorage(sc, p1);
		db.storeInvoice();
		
	}

}
