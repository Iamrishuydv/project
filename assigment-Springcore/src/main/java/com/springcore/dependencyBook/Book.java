package com.springcore.dependencyBook;

public class Book {

	private int bookcode;
	private String booktitle;
	private String bookauthor;
	private double bookprice;
	
	


	public Book(int bookcode, String booktitle, String bookauthor, double bookprice) {
		super();
		this.bookcode = bookcode;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}




	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", booktitle=" + booktitle + ", bookauthor=" + bookauthor + ", bookprice="
				+ bookprice + "]";
	}


	
	
	
}
