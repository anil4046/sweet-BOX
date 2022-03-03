package com.demo;

import com.jdbc.Connector;

public class newUserPayment extends PaymentDetails
{
	 public static void details()
	 {
		 
		 Registation r= new Registation();
		
		 System.out.println(Registation.getMail());
		 System.out.println(" select anyone of the above payment gateway");
		 String gateway=sc.next();
		 
		 switch(gateway)
		 {
		 case "phonepay":
			 
			 System.out.println("enter upi id");
			 PaymentDetails.setUpiid(sc.next());
			 String sql=String.format("insert into payments(mailid,phonepay) values ('%s','%s')",Fields.getMail(),PaymentDetails.getUpiid());
			 try {
				int ex = Connector.st.executeUpdate(sql);
				
				System.out.println(ex);
				System.out.println("your Data will be added in our site");
				Payment.payment1();
			    }  
			    catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
			   break;
		 case "googlepay":
			 String sql1=String.format("insert into payments(mailid,gpay) values ('%s','%s')",Fields.getMail(),PaymentDetails.getUpiid());
			 try {
				int ex = Connector.st.executeUpdate(sql1);
				
				System.out.println(ex);
				System.out.println("your Data will be added in our site");
				Payment.payment1();
			    }  
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			  }
			    break;
		 case "creditcard":
			 System.out.println("enter card number");
			 PaymentDetails.setCardno(sc.next());
			 System.out.println("enter cvv number");
			 PaymentDetails.setCvv(sc.next());
			 String sql2=String.format("insert into payments(mailid,cardno,cvv) values ('%s','%s','%s')",Fields.getMail(),PaymentDetails.getCardno(),PaymentDetails.getCvv());
			 try {
				int ex = Connector.st.executeUpdate(sql2);
				
				System.out.println(ex);
				System.out.println("your Data will be added in our site");
				Payment.payment1();
			    }  
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			  }
			   break;
		 case "debitcard":
			        System.out.println("enter card number");
			        PaymentDetails.setCardno(sc.next());
			         System.out.println("enter cvv number");
			         PaymentDetails.setCvv(sc.next());
			       String sql3=String.format("insert into payments(mailid,dcardno,cvv) values ('%s','%s','%s')",Fields.getMail(),PaymentDetails.getCardno(),PaymentDetails.getCvv());
		       	   try {
			      	int ex = Connector.st.executeUpdate(sql3);
				
			     	System.out.println(ex);
			     	System.out.println("your Data will be added in our site");
			     	Payment.payment1();
			       }  
			       catch (Exception e) {
			     	// TODO Auto-generated catch block
			     	e.printStackTrace();
			  }
			 
		 }

	 }
}

