

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;

import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

//The program is long, which means methods could be applied as well. :)
//It is separated in two parts: 
//Part I: for cards from 2 to 10
//Part II: for cards J, Q, K and A
//Parts I and II are almost identical except for the number of repetitions in the loops and the variable used to denote the card.
//itext is used as an external library. 
//The name of the output directory for the PDF file is one on the author's computer. It can be changed to whatever is suitable for the user. 
//The size of the cards are also easily adjustable by manipulating cell/table dimensions. Right now they are made to be one card on a page (so if printed it will be one very BIG playing card :))).
//And that's about it! 
//Enjoy! :) 


public class DeckofCards {

	public static final String Result = "/results/deckofcards.pdf";

	public static void main(String[] args) {
		new DeckofCards().createPDF(Result);

	}

	private void createPDF(String result2) {
		Document document = new Document();
		try {
			PdfWriter
					.getInstance(
							document,
							new FileOutputStream(
									"E:\\Users\\Gabriel\\workspaceJAVA\\Intro-Java-Homework\\DeckofCards.pdf"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		document.open();

		BaseFont bf = null;
		Font f2 = null;

		PdfPTable table1 = new PdfPTable(1);
		PdfPTable table2 = new PdfPTable(1);
		PdfPTable table3 = new PdfPTable(1);
		PdfPTable table4 = new PdfPTable(1);
		
//PART I
		// from 2 to 10
		for (int i = 2; i <= 10; i++) {
			try {
				bf = BaseFont.createFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				f2 = FontFactory.getFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 76);
				f2.setColor(BaseColor.RED);

			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// for clubs
			document.newPage();

			table1.setWidthPercentage(100);
			table1.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell;

			table1 = new PdfPTable(1);
			table1.setWidthPercentage(110f);

			cell = new PdfPCell(new Phrase("" + i + '\u2663', new Font(bf, 76)));
			cell.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell.setFixedHeight(760f);

			cell.hasBorder(Rectangle.BOX);

			table1.addCell(cell);
			try {
				document.add(table1);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// for diamonds
			document.newPage();

			table2.setWidthPercentage(100);
			table2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell2;

			table2 = new PdfPTable(1);
			table2.setWidthPercentage(110f);

			cell2 = new PdfPCell(new Phrase(("" + i + '\u2666'), new Font(f2)));
			cell2.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell2.setFixedHeight(760f);

			cell2.hasBorder(Rectangle.BOX);

			table2.addCell(cell2);
			try {
				document.add(table2);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// for hearts
			document.newPage();

			table3.setWidthPercentage(100);
			table3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell3;

			table3 = new PdfPTable(1);
			table3.setWidthPercentage(110f);

			cell3 = new PdfPCell(new Phrase("" + i + '\u2665', new Font(f2)));
			cell3.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell3.setFixedHeight(760f);

			cell3.hasBorder(Rectangle.BOX);

			table3.addCell(cell3);
			try {
				document.add(table3);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// for spades
			document.newPage();

			table4.setWidthPercentage(100);
			table4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell4;

			table4 = new PdfPTable(1);
			table4.setWidthPercentage(110f);

			cell4 = new PdfPCell(
					new Phrase("" + i + '\u2660', new Font(bf, 76)));

			cell4.setFixedHeight(760f);
			cell4.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell4.hasBorder(Rectangle.BOX);

			table4.addCell(cell4);
			try {
				document.add(table4);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

//PART II
		// for J
		for (int i = 0; i < 1; i++) {
			try {
				bf = BaseFont.createFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				f2 = FontFactory.getFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 76);
				f2.setColor(BaseColor.RED);

			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			document.newPage();

			table1.setWidthPercentage(100);
			table1.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell;

			table1 = new PdfPTable(1);
			table1.setWidthPercentage(110f);

			cell = new PdfPCell(new Phrase("J" + '\u2663', new Font(bf, 76)));
			cell.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell.setFixedHeight(760f);

			cell.hasBorder(Rectangle.BOX);

			table1.addCell(cell);
			try {
				document.add(table1);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table2.setWidthPercentage(100);
			table2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell2;

			table2 = new PdfPTable(1);
			table2.setWidthPercentage(110f);

			cell2 = new PdfPCell(new Phrase(("J" + '\u2666'), new Font(f2)));
			cell2.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell2.setFixedHeight(760f);

			cell2.hasBorder(Rectangle.BOX);

			table2.addCell(cell2);
			try {
				document.add(table2);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table3.setWidthPercentage(100);
			table3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell3;

			table3 = new PdfPTable(1);
			table3.setWidthPercentage(110f);

			cell3 = new PdfPCell(new Phrase("J" + '\u2665', new Font(f2)));
			cell3.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell3.setFixedHeight(760f);

			cell3.hasBorder(Rectangle.BOX);

			table3.addCell(cell3);
			try {
				document.add(table3);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table4.setWidthPercentage(100);
			table4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell4;

			table4 = new PdfPTable(1);
			table4.setWidthPercentage(110f);

			cell4 = new PdfPCell(new Phrase("J" + '\u2660', new Font(bf, 76)));

			cell4.setFixedHeight(760f);
			cell4.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell4.hasBorder(Rectangle.BOX);

			table4.addCell(cell4);
			try {
				document.add(table4);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		// for Q
		for (int i = 0; i < 1; i++) {
			try {
				bf = BaseFont.createFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				f2 = FontFactory.getFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 76);
				f2.setColor(BaseColor.RED);

			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			document.newPage();

			table1.setWidthPercentage(100);
			table1.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell;

			table1 = new PdfPTable(1);
			table1.setWidthPercentage(110f);

			cell = new PdfPCell(new Phrase("Q" + '\u2663', new Font(bf, 76)));
			cell.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell.setFixedHeight(760f);

			cell.hasBorder(Rectangle.BOX);

			table1.addCell(cell);
			try {
				document.add(table1);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table2.setWidthPercentage(100);
			table2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell2;

			table2 = new PdfPTable(1);
			table2.setWidthPercentage(110f);

			cell2 = new PdfPCell(new Phrase(("Q" + '\u2666'), new Font(f2)));
			cell2.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell2.setFixedHeight(760f);

			cell2.hasBorder(Rectangle.BOX);

			table2.addCell(cell2);
			try {
				document.add(table2);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table3.setWidthPercentage(100);
			table3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell3;

			table3 = new PdfPTable(1);
			table3.setWidthPercentage(110f);

			cell3 = new PdfPCell(new Phrase("Q" + '\u2665', new Font(f2)));
			cell3.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell3.setFixedHeight(760f);

			cell3.hasBorder(Rectangle.BOX);

			table3.addCell(cell3);
			try {
				document.add(table3);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table4.setWidthPercentage(100);
			table4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell4;

			table4 = new PdfPTable(1);
			table4.setWidthPercentage(110f);

			cell4 = new PdfPCell(new Phrase("Q" + '\u2660', new Font(bf, 76)));

			cell4.setFixedHeight(760f);
			cell4.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell4.hasBorder(Rectangle.BOX);

			table4.addCell(cell4);
			try {
				document.add(table4);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		// for K
		for (int i = 0; i < 1; i++) {
			try {
				bf = BaseFont.createFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				f2 = FontFactory.getFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 76);
				f2.setColor(BaseColor.RED);

			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			document.newPage();

			table1.setWidthPercentage(100);
			table1.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell;

			table1 = new PdfPTable(1);
			table1.setWidthPercentage(110f);

			cell = new PdfPCell(new Phrase("K" + '\u2663', new Font(bf, 76)));
			cell.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell.setFixedHeight(760f);

			cell.hasBorder(Rectangle.BOX);

			table1.addCell(cell);
			try {
				document.add(table1);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table2.setWidthPercentage(100);
			table2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell2;

			table2 = new PdfPTable(1);
			table2.setWidthPercentage(110f);

			cell2 = new PdfPCell(new Phrase(("K" + '\u2666'), new Font(f2)));
			cell2.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell2.setFixedHeight(760f);

			cell2.hasBorder(Rectangle.BOX);

			table2.addCell(cell2);
			try {
				document.add(table2);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table3.setWidthPercentage(100);
			table3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell3;

			table3 = new PdfPTable(1);
			table3.setWidthPercentage(110f);

			cell3 = new PdfPCell(new Phrase("K" + '\u2665', new Font(f2)));
			cell3.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell3.setFixedHeight(760f);

			cell3.hasBorder(Rectangle.BOX);

			table3.addCell(cell3);
			try {
				document.add(table3);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table4.setWidthPercentage(100);
			table4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell4;

			table4 = new PdfPTable(1);
			table4.setWidthPercentage(110f);

			cell4 = new PdfPCell(new Phrase("K" + '\u2660', new Font(bf, 76)));

			cell4.setFixedHeight(760f);
			cell4.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell4.hasBorder(Rectangle.BOX);

			table4.addCell(cell4);
			try {
				document.add(table4);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		// for A
		for (int i = 0; i < 1; i++) {
			try {
				bf = BaseFont.createFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				f2 = FontFactory.getFont("c:\\windows\\fonts\\ARIALUNI.ttf",
						BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 76);
				f2.setColor(BaseColor.RED);

			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			document.newPage();

			table1.setWidthPercentage(100);
			table1.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell;

			table1 = new PdfPTable(1);
			table1.setWidthPercentage(110f);

			cell = new PdfPCell(new Phrase("A" + '\u2663', new Font(bf, 76)));
			cell.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell.setFixedHeight(760f);

			cell.hasBorder(Rectangle.BOX);

			table1.addCell(cell);
			try {
				document.add(table1);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table2.setWidthPercentage(100);
			table2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell2;

			table2 = new PdfPTable(1);
			table2.setWidthPercentage(110f);

			cell2 = new PdfPCell(new Phrase(("A" + '\u2666'), new Font(f2)));
			cell2.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell2.setFixedHeight(760f);

			cell2.hasBorder(Rectangle.BOX);

			table2.addCell(cell2);
			try {
				document.add(table2);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table3.setWidthPercentage(100);
			table3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell3;

			table3 = new PdfPTable(1);
			table3.setWidthPercentage(110f);

			cell3 = new PdfPCell(new Phrase("A" + '\u2665', new Font(f2)));
			cell3.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell3.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell3.setFixedHeight(760f);

			cell3.hasBorder(Rectangle.BOX);

			table3.addCell(cell3);
			try {
				document.add(table3);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			document.newPage();

			table4.setWidthPercentage(100);
			table4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			PdfPCell cell4;

			table4 = new PdfPTable(1);
			table4.setWidthPercentage(110f);

			cell4 = new PdfPCell(new Phrase("A" + '\u2660', new Font(bf, 76)));

			cell4.setFixedHeight(760f);
			cell4.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
			cell4.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
			cell4.hasBorder(Rectangle.BOX);

			table4.addCell(cell4);
			try {
				document.add(table4);
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		document.close();
	}
}
