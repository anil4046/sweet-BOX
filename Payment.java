package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Random;

import com.jdbc.Connector;

class Payment extends PaymentDetails{
	static  String payment;
	static private String otp;
	static int j;
	
	   public static void otp()
	    {
		  otp= new DecimalFormat("000000").format(new Random().nextInt(999999));
		  System.out.println(otp);
	    }
	 public static void payment() throws Exception
	  {
		  System.out.println("click on payment button");
		  payment=sc.next();
		  try
		  {
			  String query="select "+payment+" from Payment";
			  System.out.println(query);
			   ResultSet rs1=Connector.st.executeQuery(query);
			    while(rs1.next())
			     {
				System.out.println(rs1.getString("payment"));	
			     }
			     System.out.println("are you purchased before  press olduser \n  you are new user press newuser ");
			     String s=sc.next();
			     if(s.equalsIgnoreCase("olduser"))
			          Payment.selectPayment();
			      else if(s.equalsIgnoreCase("newuser"))
				  newUserPayment.details();        
		     } 
		   catch (SQLException e) 
		    {
			e.printStackTrace();
		    } 
		     
	  }
	 
	 public static void payment1() throws Exception
	 {
		 System.out.println("choose payment options \n 1.phonepay \n 2.googlepay \n 3.creditcard \n 4.debitcard");
		 Payment.selectPayment();
	 }
	 
	 public static void selectPayment() throws Exception
	 {
		 System.out.println("select payment mode");
		PaymentDetails.setPayment(sc.next());
		String x=PaymentDetails.getPayment();
		System.out.println(PaymentDetails.getPayment());
		 switch (x)
		 {
		 case "phonepay":
		 case "googlepay":
		
		 String query="select * from payment where payment='"+PaymentDetails.getPayment()+"' ";
		 System.out.println(query);
		 ResultSet rs = Connector.st.executeQuery(query);
		 
		    if(rs.next())
		    {
			 System.out.println(rs.getString("payment")+"\t");
			 upiValidation();
		    }
		     break;
		 case "debitcard":
		 case "creditcard":
			 
			 String query1="select * from payment where payment='"+PaymentDetails.getPayment()+"' ";
			 System.out.println(query1);
			 ResultSet rs1 = Connector.st.executeQuery(query1);
			 
			 if(rs1.next())
			 {
				 System.out.println(rs1.getString("payment")+"\t");
				 
				 cardFinalPayment(); 
			 } 
		 }
	}
	  public static void upiValidation() throws Exception
	  {
		  System.out.println("enter Upi");
		  int i=2;
		  while(i>=0)
		  {
			  PaymentDetails.setUpiid(sc.next());
		  String query="select * from payments where (Gpay='"+PaymentDetails.getUpiid()+"'"
			+" or  phonepay='"+PaymentDetails.getUpiid()+"') and mailid='"+Fields.mail+"' ";
		  System.out.println(query);
			 ResultSet rs = Connector.st.executeQuery(query);
			 
			 if(rs.next())
			 {
				 System.out.println(rs.getString("phonepay")+"\t"+rs.getString("pin"));
				 System.out.println("upi is valid");
				   otp();
				    System.out.println("enter otp");

	               String otp1=sc.next();
	                     if(otp1.equals(otp))
	                     {
	                    	 System.out.println("payment done Sucessfully \n we will send payment recipent to your mailid");
	                    	 System.out.println("check your order press 1");
	                    	 j=sc.nextInt() ;
	                    	 if(j==1)
	                    	 {
	                    		 InvoiceGenerator.invoice();
	                    		 Mail.main();
	                    	 }
	                    	 
	                    	 break;
	                     }
                 
			 }
			 else if(i>0)
			 {
				 System.out.println("enter valid UPI");
			 }
			 if(i==0)
			 {
				 System.out.println("sorry your upi was not found");
				 
			 } 
			 i--;
		  }
	  }
	  public static void cardFinalPayment() throws Exception
	  {
		  System.out.println("enter cvv number");
		  int i=2;
		  while(i>=0)
		  {
		   PaymentDetails.setCvv(sc.next());
		   String query="select * from payments where ( cardno='"+PaymentDetails.getCardno()+"' or dcardno='"+PaymentDetails.getCardno()+"' or cvv='"+PaymentDetails.getCvv()+"') and mailid='"+Fields.mail+"' ";
		   System.out.println(query);
			 ResultSet rs = Connector.st.executeQuery(query);
			 if(rs.next())
			  {
				 otp();
			    System.out.println("enter otp");
			   
               String otp1=sc.next();
                     if(otp1.equals(otp))
                     {
                    	 System.out.println("payment done Sucessfully \n we will send payment recipent to your mailid");
                    	 System.out.println("check your order press 1");
                    	 j=sc.nextInt() ;
                    	 if(j==1)
                    	 {
                    		 InvoiceGenerator.invoice();
                    		 Mail.main();
                    	 }
                    	 break;
                     }  
			  }
				 else
				 {
					 System.out.println("enter valid pin number");
				 }
		
				 if(i==1)
				 {
					 System.out.println("it is last chance plz enter correct pin");
				 }
				
				i--;
		  }
	  }
	  
 } 

