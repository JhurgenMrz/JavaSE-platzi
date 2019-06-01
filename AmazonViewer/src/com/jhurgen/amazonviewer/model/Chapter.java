package com.jhurgen.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie {
	
	private int id;
	
	private int sessionNumber;


	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return	" :: CHAPTER ::"+
				"\n Title: "+ getTitle()+
				"\n Year: "+ getYear()+
				"\n Creador: "+ getCreator()+
				"\n Duration: "+ getDuration();
	}
	
	public static ArrayList <Chapter> makeChaptersList(){
		ArrayList<Chapter> chapters = new ArrayList<Chapter>();
		
		for (int i = 1; i <= 3; i++) {
			chapters.add(new Chapter("Capitulo "+i, "Genre "+i, "Creator "+i, 60, (short)(2020+i),i));
		}
		
		
		return chapters;
	}
}
