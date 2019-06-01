package com.jhurgen.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {
	
	private int id;
		
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;


	public Serie(String title, String genre, String creator, int duration, int sessionQuantity,ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
		this.chapters = chapters;
	}
	

	public int getId() {
		return id;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}


	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}


	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return	"\n :: SERIE ::"+
				"\n Title: "+ getTitle()+
				"\n Genero: "+ getGenre()+
				"\n Creador: "+ getCreator()+
				"\n Duration: "+ getDuration();
	}
	
	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList<Serie>();
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie "+i, "genre "+i, "Creator "+i, 120+i, 1+i,Chapter.makeChaptersList()));
		}	
		return series;
	}
	
	
}
