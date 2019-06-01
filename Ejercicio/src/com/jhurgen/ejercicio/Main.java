package com.jhurgen.ejercicio;

import java.util.ArrayList;

import com.jhurgen.ejercicio.modal.Drink;
import com.jhurgen.ejercicio.modal.Fruit;
import com.jhurgen.ejercicio.modal.Hygiene;

public class Main {
	
	
	//Inicializo la coleccion de Objetos Vacio;
	static ArrayList<Drink> drinks = new ArrayList<Drink>();
	static ArrayList<Hygiene> hygiene = new ArrayList<Hygiene>();
	static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Carga y muestra todos los productos
		showProductsList();
		System.out.println("==============================================");
		
		//Método de precio maximo
		showMaxPrice();
		//Método de precio minimo
		showMinPrice();
		
	}
	
	
	public static void showProductsList() {
		
		//Carga y muestra los objetos de tipo Bebidas
		showDrinks();
		//Carga y muestra los objetos de tipo Higiene
		showHygiene();
		//Carga y muestra los objetos de tipo Frutas
		showFruts();
		
		
		
	}
	
	public static void showDrinks(){
		drinks.add(new Drink ("Coca-Cola Zero", 20, 1500));
		drinks.add(new Drink("Coca-Cola", 18, 1500));		
		for (int i = 0; i < drinks.size(); i++) {
			System.out.println(drinks.get(i));
		}
	}
	
	public static void showHygiene() {
		hygiene.add(new Hygiene("Shampoo Sedal", 19, 500));
		for (int i = 0; i < hygiene.size(); i++) {
			System.out.println(hygiene.get(i).toString());
		}
	}
	
	public static void showFruts() {
		fruits.add(new Fruit("Frutillas", 64, "kilo"));
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
	}
	
	public static void showMaxPrice() {
		
		//Inicializo objetos vacios;
		Drink maxDrink = new Drink("", 0, 0);
		Fruit maxFruit = new Fruit("", 0, "");
		Hygiene maxHygiene = new Hygiene("", 0, 0);
		
		//Recorro todas las colecciones y voy guardando el objeto con el precio mayor
		//Frutas
		if(fruits.size()>1) {
			for (int j = 0; j <= (fruits.size()-1); j++) {
				int resultF = fruits.get(j).compareTo(fruits.get(j+1));
				
				if(resultF == 1) {
					maxFruit = fruits.get(j);
				}else {
					maxFruit = fruits.get(j+1);
				}
				
			}
		}else {
			maxFruit = fruits.get(0);
		}
		
		//Higiene
		if(hygiene.size()>1) {
			for (int k = 0; k < (hygiene.size()-1); k++) {
				int resultH = hygiene.get(k).compareTo(hygiene.get(k+1));
				
				if(resultH == 1) {
					maxHygiene = hygiene.get(k);
				}else {
					maxHygiene = hygiene.get(k+1);
				}
			}
		}else {
			maxHygiene = hygiene.get(0);
		}
		
		//Bebidas
		if(drinks.size()>1) {
			for (int i = 0; i < (drinks.size()-1); i++) {		
				int resultD = drinks.get(i).compareTo(drinks.get(i+1));
				
				if(resultD == 1) {
					maxDrink = drinks.get(i);
				}else {
					maxDrink = drinks.get(i+1);
				}
				
			}
		}else {
			maxDrink = drinks.get(0);
		}
		
		
		//Acá comparo los 3 objetos con los precios mayores en sus respectivas colecciones
		
		if((maxDrink.compareTo(maxHygiene)) == 1) {
			if((maxDrink.compareTo(maxFruit)) ==1) {
				System.out.println("Producto más caro: "+maxDrink.getName());
			}else {
				System.out.println("Producto más caro: "+maxFruit.getName());
			}
			
		}else if(maxHygiene.compareTo(maxFruit) == 1){
			System.out.println("Producto más caro: "+maxHygiene.getName());
		}else {
			System.out.println("Producto más caro: "+maxFruit.getName());
		}
		
		
	}

	//Éste es igual al maxPrice solo que ahora usando el compareTo con el -1 (Negativo)
	public static void showMinPrice() {
		Drink minDrink = new Drink("", 0, 0);
		Fruit minFruit = new Fruit("", 0, "");
		Hygiene minHygiene = new Hygiene("", 0, 0);
		
		if(fruits.size()>1) {
			for (int j = 0; j <= (fruits.size()-1); j++) {
				int resultF = fruits.get(j).compareTo(fruits.get(j+1));
				
				if(resultF == -1) {
					minFruit = fruits.get(j);
				}else {
					minFruit = fruits.get(j+1);
				}
				
			}
		}else {
			minFruit = fruits.get(0);
		}
		
		if(hygiene.size()>1) {
			for (int k = 0; k < (hygiene.size()-1); k++) {
				int resultH = hygiene.get(k).compareTo(hygiene.get(k+1));
				
				if(resultH == -1) {
					minHygiene = hygiene.get(k);
				}else {
					minHygiene = hygiene.get(k+1);
				}
			}
		}else {
			minHygiene = hygiene.get(0);
		}
		
		
		if(drinks.size()>1) {
			for (int i = 0; i < (drinks.size()-1); i++) {		
				int resultD = drinks.get(i).compareTo(drinks.get(i+1));
				
				if(resultD == -1) {
					minDrink = drinks.get(i);
				}else {
					minDrink = drinks.get(i+1);
				}
				
			}
		}else {
			minDrink = drinks.get(0);
		}
		
		//Y aca vuelvo a comparar entre los 3 objetos con menor precio
		
		if((minDrink.compareTo(minHygiene)) == -1) {
			if((minDrink.compareTo(minFruit)) == -1) {
				System.out.println("Producto más barato: "+minDrink.getName());
			}else {
				System.out.println("Producto más barato "+minFruit.getName());
			}
			
		}else if(minHygiene.compareTo(minFruit) == -1){
			System.out.println("Producto más barato: "+minHygiene.getName());
		}else {
			System.out.println("Producto más barato: "+minFruit.getName());
		}
		
		
		
		
		
		
		
	}
	
}
