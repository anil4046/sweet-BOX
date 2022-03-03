package com.demo;

import java.util.Scanner;

import com.jdbc.Connector;

public class GmailValidation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mailid");
		String r="^[a-z][a-z0-9]{2}@[gmail|hotmail|outlook|yahoo]+([.com]+)+$";
		String r1=sc.next();
		while(!r1.matches(r))
	    {
	    	System.out.println("enter your maiil id");
	    	System.out.println(" first letter must be lower alphabet \n Min Length should be > 3");
	    	System.out.println("next letters shall be either alphbet or numbers");
	    	System.out.println("it contains @gmail/@hotmail/@outlook/@yahoo and .com format");
	    	 r1=sc.next();
	    }
		System.out.println("it is correct");
	    
		
	}

}
