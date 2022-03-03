package com.demo;

import com.jdbc.Connector;
	
public	class Registation 
	{
		 
		private String fname;
		private String lname;
		static private String mail;
	   private String pass;
		private  String phno;
		 
		 
		 public String getFname() {
			return fname;
		}
		 public String getLname() {
			return lname;
		}
		public static String getMail() {
			return mail;
		}
		public String getPass() {
			return pass;
		}
		public String getPhno() {
			return phno;
		}
		
		public  void setFname(String fname) {
			
			if(fname.length()>5)
			{
				this.fname = fname;
			}
			else
			 {
				System.out.println("plz enter your fname");
				setFname(Connector.sc.next());
			 } 
			}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public static void setMail(String mail) 
		{
		    String r="^[a-z][a-z0-9]{2}@[gmail|hotmail|outlook|yahoo]+([.com]+)+$";
		    while(!mail.matches(r))
		    {
		    	System.out.println("enter your maiil id");
		    	System.out.println(" first letter must be lower alphabet \n Min Length should be > 3");
		    	System.out.println("next letters shall be either alphbet or numbers");
		    	System.out.println("it contains @gmail/@hotmail/@outlook/@yahoo and .com format");
		
		    	setMail(Connector.sc.next());
		    }
		    Registation .mail=mail;
		}
		public void setPass(String pass) 
		{
			String regex ="^(?=.*[0-9])"
	               + "(?=.*[a-z])(?=.*[A-Z])"
	               + "(?=.*[@#$%^&])"
	               + "(?=\\S+$).{8,20}$";
			
			if(pass.matches(regex))
			{
			  this.pass = pass;
			}
			else
			{
				System.out.println("enter valid password like \n "
						            + "1.contains min 8 digits \n "
						               + "2.contatns atleast one alphabet like[A-Z] \n"
						               + "3.contains atleast one alphabet like[a-z] \n"
						               + "4.spaces are not allowed \n"
						               + "5.atlest one number like[0-9] ");
				setPass(Connector.sc.next());
			}
		}
		public void setPhno(String phno) {
			
			String r="^(0/91)?([6-9]\\d{9})$";
			if(phno.matches(r))
	        {
			this.phno = phno;
					
	        }
			else
			{
				System.out.println("plz enter valid phone number");
				
				  setPhno(Connector.sc.next());
			}
				
				
		}
		
	}



