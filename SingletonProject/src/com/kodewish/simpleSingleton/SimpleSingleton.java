package com.kodewish.simpleSingleton;

public class SimpleSingleton {
	public static void main(String[] args) {
		Account a1=Account.getInstance();
		Account a2=Account.getInstance();
		System.out.println(a1==a2);
	}

}
