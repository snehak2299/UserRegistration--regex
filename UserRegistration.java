package com.bridgelab.userregistration;

import java.util.Scanner;

public class UserRegistration{
	public static void main(String[] args) {
		String regex = "^[A-Z][a-z]{3,}";
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first name");
		String name = sc.nextLine();
		if(name.matches(regex)) {
			System.out.println("name is valid");
		}
		else 
		{
			System.out.println("name is not valid");
		}
	}

}
