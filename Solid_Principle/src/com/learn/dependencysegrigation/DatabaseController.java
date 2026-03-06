package com.learn.dependencysegrigation;

public class DatabaseController {
	public static void main(String[] args) {
		Database mysql=new MySqlDB();
		Database mongo=new  MongoDb();
		
		UserService user1 =new UserService(mysql);
		UserService user2=new UserService(mongo);
		
		user1.callDataBase("abhi");
		user2.callDataBase("Abhi");
		
	}

}
