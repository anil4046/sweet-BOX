package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.Connector;

 class Buyer 
{
	 static String  s;
	static String mobile1=null;
	static String myth;
	static String tablename;
	static String columnname;
	static String product;
	static Scanner sc=new Scanner(System.in);
	public static void selectCategory() throws Exception 
	 {
	
		 System.out.println("choose category \n electronics  \n"
		 		             + " books ");
		 Connector.connection();
		 
		    tablename =Connector.sc.next();
		  
		    if(tablename.equalsIgnoreCase("electronics"))
		      {
			     electronics();
		       }
		     else if(tablename.equalsIgnoreCase("books"))
		       {
		    	electronics();
		       }   
	    }  
        
	     public static void  electronics() throws Exception
	      {
	    	 String sql="select * from "+tablename+" ";
    	       ResultSet rs = Connector.st.executeQuery(sql);
	         if(tablename.equalsIgnoreCase("electronics"))
	         {
	        	 System.out.println("select the following category \n mobile \n laptop");
	        	 System.out.println("***************");
	        	 columnname=sc.next();
	        	 
	        	 if(columnname.equalsIgnoreCase("mobile"))
	        	 {
	        	    System.out.println("Available  phones are\n ************* ");  
	        		 while(rs.next())
	        		 System.out.println(rs.getString("mobile"));
	        		 System.out.println("you want to buy click on the mobile");
	        			
	        		 product=sc.next();
	        		 query();
	        		 	 
	        	 }
	        	 else if(columnname.equalsIgnoreCase("laptop"))
	        	 {
	        		   System.out.println("Available  laptops are \n**************** ");
	        		  while(rs.next())
	        		   System.out.println(rs.getString("laptop"));
	        		   System.out.println("you want to buy click on the laptop");
	        		   product=sc.next();
	        		   query();
	        	 }
	          } 
                 
	         else if(tablename.equalsIgnoreCase("books"))
	         {
	        	 System.out.println("select the following category \n Myth \n novel ");
	        	 System.out.println("***************");
	        	 columnname=sc.next();
	        	 if(columnname.equalsIgnoreCase("myth"))
	        	 {
	        		 System.out.println(" Available Mythological Books  are \n **************** ");
	        		 while(rs.next())
	        			System.out.println(rs.getString("myth"));
	        		 System.out.println("you want to buy click on the product");
	        		 product=sc.next();
	        			        		 
	        		 	query();
	        		 	 
	        	 }
	        	 
	        	 else if(columnname.equalsIgnoreCase("novel"))
	        	 {
	        		 System.out.println(" Available  novels are \n **************** ");
	        		    while(rs.next())
		        		   System.out.println(rs.getString("novel"));
	        		   
	        		   System.out.println("you want to buy click on the Book");
	        		   product=sc.next();
	        		   query();
	        	 }  
	         }  
	      } 
	
	  public static void query() throws Exception
	  {
		  
		  Connector.connection();
		  String sql="select * from "+tablename+"  where "+columnname+" ='"+product+"' ";
		  ResultSet rs = Connector.st.executeQuery(sql);
		       if(columnname.equalsIgnoreCase("mobile"))
		       {
		    	 
		    	   while(rs.next())
		             {
		            	System.out.println( rs.getString("mobile")+"\t\t\t\t"+rs.getDouble("price"));
		                FlipKart.category=rs.getString("catogery");
		            	FlipKart.product=rs.getString("mobile");
		            	FlipKart.price=rs.getDouble("price");
		               }
		    	   rs.close();
		    	   Payment.payment();
		    		
		       }
		       else if(columnname.equalsIgnoreCase("laptop"))
		       {
		    	   
		    	   while(rs.next())
		    	   {
		    		   System.out.println( rs.getString("laptop")+"\t\t\t\t"+rs.getDouble("pcprice"));
		    		   FlipKart.category=rs.getString("catogery");
		    		   FlipKart.product=rs.getString("laptop");
		    		   FlipKart.price=rs.getDouble("pcprice");
		    		   
		    	   }
		    	   rs.close();
		    	   Payment.payment();
		       }
		       else if(columnname.equalsIgnoreCase("myth"))
		       {
		    	 
		    	   while(rs.next())
		    	   {
		    	     System.out.println( rs.getString("myth")+"\t\t\t"+rs.getString("author")+"\t\t\t\t"+rs.getDouble("price"));
		    	     FlipKart.category=rs.getString("category");
		    	     FlipKart.product=rs.getString("myth");
		    	     FlipKart.price=rs.getDouble("price");  
		    	   }
		    	   rs.close();
		    	   Payment.payment();
		       }
		       else if(columnname.equalsIgnoreCase("novel"))
		       {
		    	   while(rs.next())
		             {
		            	System.out.println( rs.getString("novel")+"\t\t\t"+rs.getString("author1")+"\t\t\t"+rs.getDouble("price1"));
		            	FlipKart.category=rs.getString("category");
		            	FlipKart.product=rs.getString("novel");
		            	FlipKart.price=rs.getDouble("price1");
		             }
		    	   rs.close();
		    	   Payment.payment();
		       }		  
	  }
	

	
    /* public static void electronics() throws Exception
		 {
			 System.out.println("select the following category");
			 System.out.println("mobile \nlaptop");
			 
			  mobile1=sc.next();
			         
			  switch(mobile1)
			  {
		
			  case "mobile":   
				     
			         String sql="select "+mobile1+",price from electronics";
			         System.out.println(sql);
				     ResultSet rs = st.executeQuery(sql);
				     System.out.println("mobile name\t\t\t price");
		             while(rs.next())
		             {
		            	System.out.println( rs.getString("mobile")+"\t\t\t\t"+rs.getDouble("price"));
		             }
		             System.out.println("if you want buy click on item");
		             SelectItem.item();
		             break;
			  case  "laptop":
				    
				    String sql1="select "+mobile1+",pcprice from electronics";
			         System.out.println(sql1);
				     ResultSet rs1 = st.executeQuery(sql1);
				         System.out.println("laptop name\t\t\t  price");
		             while(rs1.next())
		             {
		            	System.out.println( rs1.getString("laptop")+"\t\t\t\t"+rs1.getDouble("pcprice"));
		             }
		             System.out.println("if you want buy click on item");
		             SelectItem.item1();
		             
		             break;
			     }
			 
		 } 
		 public static void books() throws Exception
		 {
			 System.out.println("select the following category");
			 System.out.println("Myth \n novel");
			 
			  myth=sc.next();
			         
			  switch(myth)
			  {
		
			  case "myth":   
				     
			         String sql="select "+myth+",author,price from books";
			         System.out.println(sql);
				     ResultSet rs = st.executeQuery(sql);
				     System.out.println("BookName\t\t\t Author \t\t\t Price");
		             while(rs.next())
		             {
		            	System.out.println( rs.getString("myth")+"\t\t\t"+rs.getString("author")+"\t\t\t\t"+rs.getDouble("price"));
		             }
		             System.out.println("if you want buy click on item");
		             SelectItem.item2();
		             break;
			  case  "novel":
				    
				    String sql1="select "+myth+",author1,price1 from books";
			         System.out.println(sql1);
				     ResultSet rs1 = st.executeQuery(sql1);
				         System.out.println("BookName\t\t\t Author \t\t\t Price");
		             while(rs1.next())
		             {
		            	System.out.println( rs1.getString("novel")+"\t\t\t"+rs1.getString("author1")+"\t\t\t"+rs1.getDouble("price1"));
		             }
		             System.out.println("if you want buy click on item");
		             SelectItem.item3();
		             
		             break;
			     }
		    }  */
	 } 
	
