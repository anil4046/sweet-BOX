package com.demo;

import java.sql.ResultSet;

import com.jdbc.Connector;

public class PurchasedItems 
{
      
	public static void purchasedItemsList() throws Exception
	{
		Connector.connection();
	String sql="insert into purchaseditems (mailid,category,product,price) values('"+Fields.getMail()+"','"+FlipKart.category+"','"+FlipKart.product+"',"+FlipKart.price+")";
	System.out.println(sql);
	
		 int row = Connector.st.executeUpdate(sql);
		 System.out.println(row);
		
	}
	  public static void yourOrders() throws Exception
	  {
		  Connector.connection();
		  String query="select * from purchaseditems where mailid='"+Fields.getMail()+"' ";
		     
		  ResultSet set = Connector.st.executeQuery(query);
		  
		  while(set.next())
		  {
			  System.out.println(set.getString("mailid")+"\t"+set.getString("category")+"\t"+set.getString("product")+"\t"+set.getString("price"));
		  }
		
	  }
	
}
