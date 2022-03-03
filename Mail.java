package com.demo;


	
	import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
	import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.text.StringContent;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

	public class Mail {

	    public static void main() throws Exception {

	        final String username = "aaaahjhjjh@gmail.com";
	        final String password = "ncsfembijtqzckal";

	        Properties prop = new Properties();
	        prop.put("mail.smtp.host", "smtp.gmail.com");
	        prop.put("mail.smtp.port", "587");
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.starttls.enable", "true"); //TLS
	        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
	        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

	        Session session = Session.getInstance(prop,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });
	        	        try {
                String s  = Fields.getMail();
	           // StringContent message = new StringContent(session);
                Message message = new MimeMessage(session);

	            message.setFrom(new InternetAddress("julyregnant@gmail.com"));
	            message.setRecipients(
	                    Message.RecipientType.TO,
	                    InternetAddress.parse(s)
	            );
	            message.setSubject("Flipkart");
	            message.setText("dear customer ,"
	                    + "your order details \n"
	                     
	                 + FlipKart.category+"\t\t"+FlipKart.product+"\t\t"+FlipKart.price);
	            
	            Transport.send(message);
	            
	           }
	            catch (MessagingException e) {
		            e.printStackTrace();
	            
	           
	      
	            System.out.println("Done");

	            }
	        
	    }

	}



	


