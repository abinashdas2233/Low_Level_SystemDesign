package com.learn.dependencysegrigation;

public class MySqlDB implements Database{

	@Override
	public void saveData(String name) {
		System.out.println("save data into mysql db");
		
	}

}
