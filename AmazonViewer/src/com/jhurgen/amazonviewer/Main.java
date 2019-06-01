package com.jhurgen.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.jhurgen.amazonviewer.model.Chapter;
import com.jhurgen.amazonviewer.model.Movie;
import com.jhurgen.amazonviewer.model.Serie;
import com.jhurgen.makereport.Report;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		showMenu();
	
	}

	
	public static void showMenu() {
		int Opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Bienvenidos a AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el Numero de la Opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report today");
			System.out.println("0. Exit");
			
			Opcion = Integer.valueOf(sc.nextLine());
			
			
			//Leer
			switch (Opcion) {
			case 1:
				 System.out.println("Opcion 1 - Movies");
				 showMovies();
			break;
			case 2:
			 	System.out.println("Opcion 2 - Series");
			 	showSeries();
			break;
			case 3:
			 	System.out.println("Opcion 3 - Books");
			 	showBooks();
			break;
			case 4:
			 	System.out.println("Opcion 4 - Magazines");
			 	showMagazines();
			break;
			case 5:
			 	System.out.println("Opcion 5 - Report");
			 	makeReport();
			break;
			case 6:
			 	System.out.println("Opcion 6 - Make Report");
			 	makeReport(new Date());
			 	break;
			case 0:
			 	System.out.println("Opcion 0 - Usted Salio de la App");
			 	Opcion = 0;
			break;

			default:
				System.out.println("Opción Incorrecta");
				break;
			}
			
			
			
			
			}while(Opcion != 0);

	}
	static ArrayList<Movie> movies;
	public static void showMovies() {
			
		movies = Movie.makeMoviesList();
		
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			for (int i = 0; i < movies.size(); i++) {
				System.out.println( (i+1) +". "+movies.get(i).getTitle()+ " Visto: "+movies.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response =  Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			if(response>0) {
				Movie movieSelected = movies.get(response-1);
				movieSelected.setViewed(true);
				Date dateI = movieSelected.startToSee(new Date());
				
				for (int i = 0; i < 100000; i++) {
					System.out.println("................");
				}
				
				//Termine de Verla
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Viste: "+movieSelected);
				System.out.println("Por: "+movieSelected.getTimeViewed()+" milisegundos");
			}
			
			
			
		}while(exit!=0);
		
	}
	public static void showSeries() {
		int exit = 1;
		
		ArrayList<Serie> series = Serie.makeSeriesList();
		
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			for (int i = 0; i < series.size() ; i++) {
				System.out.println(i+1 +". "+ series.get(i).getTitle()+" Visto: "+series.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response =  Integer.valueOf(sc.nextLine());
			
			
			if(response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapters());
			
			
		}while(exit!=0);
		
	}
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) {
				System.out.println(i+1 +". "+chaptersOfSerieSelected.get(i).getTitle()+ " Visto: "+chaptersOfSerieSelected.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response =  Integer.valueOf(sc.nextLine());
			
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewed(true);
			
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("................");
			}
			
			//Termina de Ver
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: "+chapterSelected);
			System.out.println("Por: "+chapterSelected.getTimeViewed()+" milisegundos");
			
			
		}while(exit!=0);
		
	}
	public static void showBooks() {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
		}while(exit!=0);
		
	}
	public static void showMagazines() {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}while(exit!=0);
		
	}
	
	public static void makeReport() {
		
		Report report = new Report();
		report.setNameFile("reporte");
		report.setTitle(":: VISTOS ::");
		report.setExtension("txt");
		String contentReport = "";
		for (Movie movie : movies) {
			if(movie.getIsViewed()) {
				contentReport += movie.toString()+"\n"+
								"////////////////////////";
			}
		}
		report.setContent(contentReport);
		report.makeReport();
		
		
	}
	
	public static void makeReport(Date date) {
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		
		String dateString = df.format(date);
		Report report = new Report();
		report.setNameFile("reporte "+dateString);
		report.setTitle(":: VISTOS ::");
		report.setExtension("txt");
		String contentReport = "";
		for (Movie movie : movies) {
			if(movie.getIsViewed()) {
				contentReport += movie.toString()+
								"///////////////////////\n";
			}
		}
		report.setContent(contentReport);
		report.makeReport();
		
	}
	
	
	
	
}
