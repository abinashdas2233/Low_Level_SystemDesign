package com.zomato.model;

import java.util.List;

import com.zomato.satergy.IPaymentStrategy;


public class Order {
	private static int nextOrderId = 0;

	private int orderId;
	private User user;
	private Restaurant resturants;
	private List<MenuItems> menulists;
	private IPaymentStrategy paymentStrategy;
	private double total;
	

	public Order(int orderId, User user, Restaurant resturants, List<MenuItems> menulists,
			IPaymentStrategy paymentStrategy, double total) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.resturants = resturants;
		this.menulists = menulists;
		this.paymentStrategy = paymentStrategy;
		this.total = total;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setUser(User u) {
		user = u;
	}

	public User getUser() {
		return user;
	}

	public void setRestaurant(Restaurant r) {
		resturants = r;
	}

	public Restaurant getRestaurant() {
		return resturants;
	}

	public void setItems(List<MenuItems> its) {
		menulists = its;
		total = 0;
		for (MenuItems i : menulists) {
			total += i.getPrice();
		}

	}
}
