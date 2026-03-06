package com.learn.dependencysegrigation;

public class UserService {
	Database db;

	public UserService(Database db) {
		super();
		this.db = db;
	}
	public void callDataBase(String name) {
		db.saveData(name);
	}

}
