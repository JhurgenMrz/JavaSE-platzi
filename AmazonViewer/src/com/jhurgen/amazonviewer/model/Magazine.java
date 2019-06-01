package com.jhurgen.amazonviewer.model;

import java.sql.Date;

public class Magazine extends Publication {

	private int id;
	
	
	
	
	public Magazine(String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);
	}




	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: MAGAZINE ::"+
				"\n Title: "+ getTitle()+
				"\n Editorial: "+ getEditorial()+
				"\n Edition Date: "+ getEditionDate();
	}
	
	
}
