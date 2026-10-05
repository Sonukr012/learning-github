package com.kodewala.arrays;

public class Driver2 {
    
	public static void main(String [] args) {
		
		User user1 = new User("Kodwala" ,"986896907");
		User user2 = new User("Kamdev" ,"75596907");
		User user3 = new User("Sonu" ,"983453907");
		User user4 = new User("Salman" ,"983596907");
		User user5 = new User("Glou" ,"94356907");
		
		// store user object in an array.
		 User users[] = new User[5];
		
		 users[0] = user1;
		 users[1] = user2;
		 users[2] = user3;
		 users[3] = user4;
		 users[4] = user5;
		
	}
}
