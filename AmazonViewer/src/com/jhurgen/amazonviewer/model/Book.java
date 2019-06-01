package com.jhurgen.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {

	private int id;
	
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	
	
	
	
	public Book(String title, Date editionDate, String editorial, String [] authors) {
		super(title, editionDate, editorial);
		setAuthors(authors);
	}

	public int getId() {
		return id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isReaded() {
		return readed;
	}
	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	public int getTimeReaded() {
		return timeReaded;
	}
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String datailBook =	"\n :: BOOK ::"+
								"\n Title: "+ getTitle()+
								"\n Editorial: "+ getEditorial()+
								"\n Edition Date: "+ getEditionDate()+
								"\n Authors: "+getAuthors();
		//for (int i = 0; i < getAuthors().length; i++) {
			//datailBook += "\t "+ getAuthors()[i];
		//}
		return datailBook;
	}

	@Override
	public java.util.Date startToSee(java.util.Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(java.util.Date dateI, java.util.Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime() > dateI.getTime()) {
			setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
			
		}else {
			setTimeReaded(0);
		}
		
	}
	
	public static ArrayList <Book> makeBooksList(){
		ArrayList<Book> books = new ArrayList <Book>();
		
		for (int i = 0; i <= 5; i++) {
			//books.add(new Book("Libertad "+i, (Fri May 31 00:02:57 ART 2019) , "Liberty", "Jhurgen"));
		}
		
		
		return books;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
