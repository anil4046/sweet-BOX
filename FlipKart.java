package com.demo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.lang.System;
import com.jdbc.Connector;
import java.util.regex.*;

class Fields
  {
	static  String mail;
	static  String pass;
	public static String getMail() {
		return mail;
	}
	public static String getPass() {
		return pass;
	}
	public static void setMail(String mail) {
		Fields.mail = mail;
	}
	public static void setPass(String pass) {
		Fields.pass = pass;
	}
	
	
	}
  abstract class PaymentDetails
  {
	  
	  
	    static  String price;
	    static int i;
	   static Scanner sc=new Scanner(System.in);
		static private String payment;
		static private String upiid;
		
		static private String cardno;
		static private String cvv;
		public static String getPayment() {
			return payment;
		}
		public static String getUpiid() {
			return upiid;
		}
		public static String getCardno() {
			return cardno;
		}
		public static String getCvv() {
			return cvv;
		}
		public static void setPayment(String payment) {
			PaymentDetails.payment = payment;
		}
		public static void setUpiid(String upiid) {
			PaymentDetails.upiid = upiid;
		}
		public static void setCardno(String cardno) {
			PaymentDetails.cardno = cardno;
		}
		public static void setCvv(String cvv) {
			PaymentDetails.cvv = cvv;
		}
		
		
		
		
  }
  
  class Home 
  {
	  static  int i;
	  public static void home() throws Exception
	  {
		
		  while(true)
		  {
			   
		  System.out.println("**********************************************************************************");
		  System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		  System.out.println("**************************WEL COME TO FLIPKART************************************");
		  System.out.println();
		  System.out.println("   Home    [_Search_]   [__LogIN__]    [__SignUP__]   [__YourOrders__]   [__Cart_]");
		  System.out.println();
		  System.out.println("Hey what do u want just click on The Buttons");
		  
		  String s=Connector.sc.next();
		  if(s.equalsIgnoreCase("login"))
		    {
			  User.user();
			  i++;
		    }
		   if(s.equalsIgnoreCase("SignUp"))
		    {
			  SignUp.signUp();
			  i++;
		    }
		   if(s.equalsIgnoreCase("YourOrders"))
		    {
			   int j=0;
			    if(j==0)
			    {
			    	//System.out.println("first sign after that you will check your orders");
			    	j++;
			    	
			    }
			    if(Fields.getMail().equals(User.name1) && Fields.getPass().equals(User.pass1))
			    {
			     //if(j==0)
			       {
			    	PurchasedItems.yourOrders();
			       }
			    }
			 
		    }
		  if(s.equalsIgnoreCase("Search"))
		  {
			  int j=0;
			  if(j==0)
			  {
				  //System.out.println("first signin after that you will search");  
				 j++; 
			  }
			  if(Fields.getMail().equals(User.name1) && Fields.getPass().equals(User.pass1))
			       Buyer.selectCategory();  
		  }
		    if(s.equalsIgnoreCase("cart"))
		    {
			  if(i==0)
			     {
				  System.out.println("first sign in after that you will your cart");
			    }
		    }
		    try
		    {
		    if(Fields.getMail().equals(User.name1) && Fields.getPass().equals(User.pass1))
		    {
		       logOut();
		    }
		    }
		    catch(Exception e)
		    {
		    	System.out.println("hey relax why are you Hurrey up ! LogIn");
		    }
		  i++;
	  }
  }
              
	  public static void logOut()
	  {
		  System.out.println("**********************************************************************************");
		  System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		  System.out.println("**************************WEL COME TO FLIPKART************************************");
		  System.out.println();
		  System.out.println("   Home    [_Search_]   [__LogIN__]    [__SignUP__]   [__YourOrders__]   [__Cart_]");
		  System.out.println();
	
		  
		  System.out.println("if u want to sign out press logout");
		     String b=Connector.sc.next();
		     if(b.equals("logout"))
		      {
			   System.exit(0);
		      }
	    }  
  }		  
public class FlipKart {

	public static double price;
	public static String product;
	public static String category;
	
	public static void main(String[] args) throws Exception
	{
		try
		{
		Home.home();
		}
		catch(Exception e)
		{
			System.out.println("hey relax why are you Hurrey up ! LogIn");
			Home.home();
		}
	
	}

}
