package com.learn.singleresponsibility;

public class DBStorage {
	private ShoppingCart cart;
	private Product product;

	public DBStorage(ShoppingCart cart,Product product) {
		super();
		this.cart = cart;
		this.product=product;
	}
	public void storeInvoice() {
		System.out.println("store invoice-"+cart.getPrice());
		System.out.println(product.getName());
	}

}
