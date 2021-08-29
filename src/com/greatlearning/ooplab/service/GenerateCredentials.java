package com.greatlearning.ooplab.service;

import java.util.Scanner;
import java.security.SecureRandom;

public class GenerateCredentials {
	
	
	Scanner sc = new Scanner(System.in);
	
public String generateEmail(String fName, String lName, String department){
	
	return fName+lName+"@"+department+".abc.com";
	
}


public String generatePassword() {
	
	String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqurstuvwxyz!@#$%^&*_=+-/.?<>)0123456789";
	SecureRandom random = new SecureRandom();
	StringBuilder password = new StringBuilder();
	
	
	for(int i=0; i<8;i++)
	{
		int index = random.nextInt(chars.length());
		password.append(chars.charAt(index));
	}
	
	return password.toString();

}


public void showCredentials(String fName, String lName, String department) {
	
	
	
System.out.println("Email --> "+generateEmail(fName, lName, department));

System.out.print("Passowrd --> " + generatePassword());
	
	

}





}
