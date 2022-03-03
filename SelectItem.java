package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.Connector;


	class SelectItem extends PaymentDetails
	 {
			/* public static void item() throws Exception 
		    {
			 
			  item=sc.next();
			 
			 ResultSet rs=Connector.st.executeQuery("select * from electronics where mobile='"+item+"'or price='"+price+"'");
			   if(rs.next())
			   {
				   System.out.println(rs.getString("mobile")+"\t"+rs.getDouble("price"));
				   //System.out.println("click on payment");
				   payment();
				   
			   }
		 }
		 public static void item1() throws Exception
		 {
			 
			  item=sc.next();
			 
			 ResultSet rs=Connector.st.executeQuery("select * from electronics where laptop='"+item+"'or pcprice='"+price+"'");
			   if(rs.next())
			   {
				   System.out.println(rs.getString("laptop")+"\t"+rs.getDouble("pcprice"));
				  // System.out.println("click on payment");
				   payment();
				   
			   }
		 }
		 
		 public static void item2() throws Exception
		 {
			 
			  item=sc.next();
			 
			 ResultSet rs=Connector.st.executeQuery("select * from books where myth='"+item+"'or price='"+price+"'");
			   if(rs.next())
			   {
				   System.out.println(rs.getString("myth")+"\t"+rs.getDouble("price"));
				  // System.out.println("click on payment");
				   payment();
				   
			   }
		 }
		 public static void item3() throws Exception
		 {
			 
			  item=sc.next();
			 
			 ResultSet rs=Connector.st.executeQuery("select * from books where novel='"+item+"'or price1='"+price+"'");
			   if(rs.next())
			   {
				   System.out.println(rs.getString("novel")+"\t"+rs.getDouble("price1"));
				  // System.out.println("click on payment");
				   payment();
				   
			   }
		 } */
		/* public static void payment() throws Exception
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
					
				}
				System.out.println("are you purchased before  press olduser \n  you are new user press newuser ");
				String s=sc.next();
				
				  if(s.equalsIgnoreCase("olduser"))
				  {
				  Payment.selectPayment();
				  }
				  else if(s.equalsIgnoreCase("newuser"))
				  {
					  newUserPayment.details();
				  }
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		  } */


} 
