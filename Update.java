package com.demo;

import java.sql.SQLException;

import com.jdbc.Connector;

class UpdateData 

{
	 public static void update()
	 {
		 Registation r= new Registation();
		 
		 System.out.println("enter your  Gmail");
		    Registation.setMail(Connector.sc.next());
			System.out.println("enter your password ");
			r.setPass(Connector.sc.next());
		 System.out.println("re enter your password");
		    r.setPass(Connector.sc.next());
	
		     String sql=String.format("update user set password='%s' where mailid='%s' ", r.getPass(),Registation.getMail());
		  int up;
		try {
			up = Connector.st.executeUpdate(sql);
			System.out.println(up);
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		   System.out.println("password update sucessfully");
		
	 }
}

