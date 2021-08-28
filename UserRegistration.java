package com.bridgelab.userregistration;

import java.util.Scanner;

public class UserRegistration{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regexPhoneNumber = "^[0-9]{1,}\s[0-9]{10}$"; // UC4
		System.out.println("enter valid phone number along country code");
		String phoneNumb = sc.nextLine();
		if(phoneNumb.matches(regexPhoneNumber)) {
			System.out.println("phone number is valid");
		}
		else {
			System.out.println("phone number is not valid");
		}
		String regexPassword = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$"; // UC8
		System.out.println("enter password more than 8 charcter");
		String password = sc.nextLine();
		if(password.matches(regexPassword)) {
			System.out.println("valid password");
		}
		else {
			System.out.println("invalid password");
		}
		
	
	}
}
