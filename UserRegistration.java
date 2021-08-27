package com.bridgelab.userregistration;

import java.util.Scanner;

public class UserRegistration{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regexPhoneNumber = "^[0-9]{1,}\s[0-9]{10}$";
		System.out.println("enter valid phone number along country code");
		String phoneNumb = sc.nextLine();
		if(phoneNumb.matches(regexPhoneNumber)) {
			System.out.println("phone number is valid");
		}
		else {
			System.out.println("phone number is not valid");
		}
		
	
	}
}
