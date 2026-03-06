package com.learn.dependencysegrigation;

public class MongoDb implements Database{

	@Override
	public void saveData(String name) {
		System.out.println("store in mongodb");
		
	}

}
