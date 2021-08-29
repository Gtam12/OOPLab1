package com.greatlearning.ooplab.main;

import java.util.Scanner;

import com.greatlearning.ooplab.model.Employee;
import com.greatlearning.ooplab.service.GenerateCredentials;

public class driver {
	
	static Employee emp = new Employee("Gowtham","Padmanathan");
	static GenerateCredentials  gc = new GenerateCredentials();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		


		

		
		
		
	     int choice = displayMenu();
	    
	    
	    switch(choice)
	    {
	    
	    case 1:
	    	gc.showCredentials(emp.getFirstName(), emp.getLastName(), "tech");
	    	break;
	    	
	    case 2:
	    	gc.showCredentials(emp.getFirstName(), emp.getLastName(), "adm");
	    	
	    	break;
	    	
	    case 3:
	    	gc.showCredentials(emp.getFirstName(), emp.getLastName(), "hr");
	    	
	    	break;
	    
	    case 4:
	    	gc.showCredentials(emp.getFirstName(), emp.getLastName(), "lgl");
	    	
	    	break;
	    }
	    
	    
		
		


	}
	
	
	private static int displayMenu()
	{
		System.out.println("---------------------------------");
		
		System.out.println("1. Technical");
		
		System.out.println("2. Admin");
		
		System.out.println("3. Human Resources");
		
		System.out.println("4. Legal");
		
		
		System.out.println("---------------------------------");
		
		System.out.println(" Enter your choice ");
		int choice = sc.nextInt();
		
		return choice;
		
	}
	
	

}
