package com.demo;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import com.jdbc.Connector;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* public static void electronics() 
		    {
			 
			 try {
			 Connector.connection();
          String mobile=sc.next();
		    String sql="select * from electronics";
		    System.out.println();
			    ResultSet rs = st.executeQuery(sql);
			
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                
                ArrayList<String> columns=new ArrayList<>();
                
                for (int i = 2; i < columnCount; i++) 
                {
                    String columnName = metaData.getColumnName(i);
                    columns.add(columnName);
                }
     
                
                while (rs.next()) {
                    for (String columnName : columns) {
                        String value = rs.getString(columnName);
                        System.out.print(columnName + " = " + value+"\t");
                    }
                }
     
			 }  
			
			 catch (Exception e)
			 {
			
				e.printStackTrace();
			  }
			   
			 
			 
		    }
		 /* class SignUp extends Connector
		 {
			 
			static String fname;
			static String lname;
			static String mail;
		    static String pass;
			 static double phno;
			
			   public static void signUp()
			   {
				   try {
					Connector.connection();
					System.out.println("enter your First Name");
					fname=sc.next();
					System.out.println("enter your Last Name");
					lname=sc.next();
					System.out.println("enter your  gmail");
					mail=sc.next();
					System.out.println("enter your password ");
					pass=sc.next();
					System.out.println("enter your phnumber");
					phno=sc.nextDouble();
					String sql=String.format("insert into user(firstname,lastname,mailid,password,phnumber) values('%s','%s','%s','%s',%f)", 
							                                   fname,lname,mail,pass,phno);
					st.executeUpdate(sql);
					System.out.println("signUp sucessfully");
					System.out.println("if you want sign in press signIn box");
					String signIn=sc.next();
					if(signIn.equalsIgnoreCase("signin"))
					    User.user();
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				   
				   
				   
			   }
			 
				   
			 
		 } */
		 

		/* public static void payment1() throws Exception
		  {
			  System.out.println("click on payment button");
			   payment=sc.next();
			  try {
				  String query="select "+payment+" from Payment";
				  System.out.println(query);
				ResultSet rs1=Connector.st.executeQuery(query);
				
				while(rs1.next())
				{
					System.out.println(rs1.getString("payment"));
					Payment.selectPayment();
					
				}
			  }
				catch (SQLException e) 
			    {
							
			    }

	   } */
	 
	 
	   
		/*  public static void cardValidation() throws Exception
		  {
			  System.out.println("enter Card Number");
			  int i=2;
			  while(i>=0)
			  {
			   cardno=sc.next();
			 
			  String query="select * from payments where (cardno='"+cardno+"' or  Dcardno='"+cardno+"')and mailid='"+Fields.mail+"' ";
			  System.out.println(query);
				 ResultSet rs =Connector.st.executeQuery(query);
				 
				 if(rs.next())
				 {
					 System.out.println(rs.getString("cardno")+"\t"+rs.getString("cvv"));
					 System.out.println("card number is valid");
					 cardFinalPayment();
					 
					  break;
				 }
				 else if(i>0)
				 {
					 System.out.println("enter valid ACCNO");
				 }
				 if(i==0)
				 {
					 System.out.println("sorry your upi/accono was not found");
					 
				 } 
				 i--;
			  }
		  } */
		   

		  
		  /*public static void finalPayment() throws Exception
		  {
			  System.out.println("enter pin  number");
			  int i=2;
			  while(i>=0)
			  {
				  String pin=sc.next();
				  String query="select * from payments where (Gpay='"+upiid+"' or phonepay='"+upiid+"') and mailid='"+Fields.mail+"' and pin='"+pin+"' ";
				  System.out.println(query);
					 ResultSet rs =Connector. st.executeQuery(query);
					 
					 if(rs.next())
					 {
						 System.out.println(rs.getString("phonepay")+"\t"+rs.getString("pin"));
						 System.out.println("payment done Sucessfully \n we will send payment recipent to your mailid"); 
						 break;
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
		  } */
		  

	}

}
