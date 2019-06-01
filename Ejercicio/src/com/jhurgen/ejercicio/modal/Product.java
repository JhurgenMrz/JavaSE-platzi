package com.jhurgen.ejercicio.modal;
						//Interfaz Comparable
public class Product implements Comparable<Product> {
	
	private int id;
	private String name;
	private int price;
	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Product O) {
		// TODO Auto-generated method stub
		if(this.price>O.price) {
			return 1;
		}
		if(this.price< O.price) {
			return -1;
		}
		else{
			return 0;	
		}
		
		
	}
	
	
	
}
