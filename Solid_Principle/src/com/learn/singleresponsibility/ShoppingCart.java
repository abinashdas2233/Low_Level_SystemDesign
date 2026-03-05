package com.learn.singleresponsibility;

public class ShoppingCart {
	private double price;
	
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void calculatePrice(double actualPrice,String type) {
		
		if(type.equals("prime")) {
			//prime customer 20% discount
			this.price= actualPrice-actualPrice*0.20;
			
		}
		else {
			this.price= actualPrice;
		}
		
		
		
	}

}
