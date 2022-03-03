package com.demo;

import java.sql.ResultSet;

import com.jdbc.Connector;

public class User extends Connector {
	static String name1;
	static String pass1;
	 public static void user() 
		 {
		
	      try {
			Connector.connection();
	      int i=0,j=0;
	 	 
	      System.out.println("enter mailid");
	      Fields.setMail(sc.next());
	      
	        
	        ResultSet rs=st.executeQuery("select * from user where mailid='"+Fields.getMail()+"' ");//or password='"+Fields.getPass()+"'");  
				
		     if(rs.next())
	           {
		    	  name1 = rs.getString("mailid");
		    	 rs.close();
		    	 while(j<=2)
		    	 {
		    	 System.out.println("enter your password");
			       Fields.setPass(sc.next());
			       ResultSet rs1=st.executeQuery("select * from user where  password='"+Fields.getPass()+"'");
	        	   if(rs1.next())
	        	     {
	        	       pass1 = rs1.getString("password");
	        	
			             if(Fields.getMail().equals(name1) && Fields.getPass().equals(pass1))
			              {
			    	      System.out.println("your sucessfully login");
			    		  Home.home();
			    		  con.close();	
			    		  System.exit(0);	   
			              }
			           }
	        	    System.out.println("pass word is worng");
	        	   if(j==1)
			       {
				   System.out.println("this is the last attempt");
			       }
	        	   if(j==2)
	    	         {
	    		    System.out.println("plz update your password");
	    		     UpdateData.update();
	    	          }
	        	     j++;;
	        	     } 
	             }   
		     System.out.println("enter valid Gmail");
		     
		    }
		  
	      
	      catch (Exception e) {
	  		System.out.println("you handled exception beautifully");
	  		e.printStackTrace();
	  	
	  	}
	      
	      
		 }
	  
}  
	 


