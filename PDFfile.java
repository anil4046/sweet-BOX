package com.demo;


import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;  
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFfile {
     public static void main(String[] args) {
    	 try {
    		 String filename = "E:\\Newfolder\\Receipt1.pdf";
    			Document document = new Document();
    			
    			PdfWriter.getInstance(document, new FileOutputStream(filename));
    			document.open();
    			Paragraph para = new Paragraph("Employee Details");
    			document.add(para);
    			document.add(new Paragraph(" "));
    			
    			
    		//add table
    			
    		PdfPTable table = new PdfPTable(3);
    		
    		table.setWidthPercentage(70);
    		table.setSpacingAfter(11f);
    		table.setSpacingBefore(11f);
    		float [] colwidth={2f,2f,2f};
    		table.setWidths(colwidth);

    		PdfPCell c1 = new PdfPCell(new Paragraph("Name"));
    		PdfPCell c2 = new PdfPCell(new Paragraph("Ngame"));
    		PdfPCell c3 = new PdfPCell(new Paragraph("Njjame"));
    	   // table.setHeaderRows(1);
    	    
    	    table.addCell(c1);
    	    table.addCell(c2);
    	    table.addCell(c3);
    	    
    	    
    	   /* table.addCell("thiru");
    	    table.addCell("HYD");
    	    table.addCell("12345");
    	    table.addCell("thiru");
    	    table.addCell("HYD");
    	    table.addCell("12345");  */ 
    	    document.add(table);
    			
    	    //document.add(Image.getInstance("D:\\down.jfif"));
    			document.close();
    			System.out.println("finished");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
