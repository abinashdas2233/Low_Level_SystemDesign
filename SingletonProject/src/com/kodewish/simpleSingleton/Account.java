package com.kodewish.simpleSingleton;

public class Account {
	private static Account instances;
	private Account() {
		
	}
	public static Account getInstance() {
		if(instances==null) {
			instances=new Account();
			
		}
		
		return instances;
	}

}
