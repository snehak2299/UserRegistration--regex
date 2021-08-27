package com.bridgelab.userregistration;

import java.util.Scanner;

public class UserRegistration{
	public static void main(String[] args) {
		String regex = "^[A-Z][a-z]{3,}";
		Scanner sc = new Scanner (System.in);
		System.out.println("enter last name");
		String lastName = sc.nextLine();
		if(lastName.matches(regex)) {
			System.out.println("last name is valid");
		}
		else 
		{
			System.out.println("last name is not valid");
		}
	
	}
}
