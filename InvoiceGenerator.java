package com.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Writer;
import java.sql.ResultSet;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.jdbc.Connector;

public class InvoiceGenerator
{
	
	public static void invoice() throws Exception 
	{
		
		String filename = "E:\\Newfolder\\invoice.pdf";
		Document document = new Document();
		
		PdfWriter.getInstance(document, new FileOutputStream(filename));
		document.open();
		Paragraph para = new Paragraph("Welcome to Flipkart");
		document.add(para);
		para=new Paragraph("your order detatils");
		document.add(para);
		
	
		
		// add table
	        	  
		
		PdfPTable table = new PdfPTable(4);
		
		table.setWidthPercentage(70);
		table.setSpacingAfter(11f);
		table.setSpacingBefore(11f);
		float [] colwidth={2f,2f,2f,2f};
		table.setWidths(colwidth);

		PdfPCell c1 = new PdfPCell(new Paragraph("Catagory"));
		PdfPCell c2 = new PdfPCell(new Paragraph("product Name"));
		PdfPCell c3 = new PdfPCell(new Paragraph("Price"));
		PdfPCell c4 = new PdfPCell(new Paragraph("Payment"));
	    table.setHeaderRows(1);
	    
	    table.addCell(c1);
	    table.addCell(c2);
	    table.addCell(c3);
	    table.addCell(c4);
	    table.addCell(FlipKart.category);
	    table.addCell(FlipKart.product);
	    table.addCell("Rs"+" "+FlipKart.price);
	    table.addCell("Done");
	    document.add(table);
		
	    document.close();
	    PurchasedItems.purchasedItemsList();
	    System.out.println("category\tproductName\tprice");
		System.out.println(FlipKart.category+"\t"+FlipKart.product+"\t"+FlipKart.price);
		
	}

	
}