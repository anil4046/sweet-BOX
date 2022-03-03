package com.demo;

import com.jdbc.Connector;

public class SignUp  
{
	public static void signUp() 
	 {
		 try
		 {
			 Registation r= new Registation();
			Connector.connection();
			System.out.println("enter your First Name");
			r.setFname(Connector.sc.next());
		    System.out.println("enter your Last Name");
		    r.setLname(Connector.sc.next());			
		    System.out.println("enter your  gmail");
		    Registation.setMail(Connector.sc.next());
			System.out.println("enter your password ");
			r.setPass(Connector.sc.next());
			System.out.println("enter your phnumber");
			r.setPhno(Connector.sc.next());

			System.out.println(r.getMail());
			 System.out.println(r.getMail());
			 
			String sql=String.format("insert into user(firstname,lastname,mailid,password,phnumber) values('%s','%s','%s','%s','%s')", 
                   r.getFname(),r.getLname(),Registation.getMail(),r.getPass(),r.getPhno());
			 
			Connector.st.executeUpdate(sql);
             
             System.out.println("signUp sucessfully");
 			System.out.println("if you want sign in press signIn box");
 			String signIn=Connector.sc.next();
 			if(signIn.equalsIgnoreCase("signin"))
 			    User.user();
 			   
	          }  	
		   catch (Exception e)
		     {
			   e.printStackTrace();
			 System.out.println("probably your connection is worng");
		     } 
	 }
}

