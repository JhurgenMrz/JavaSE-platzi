package com.jhurgen.ejercicio.modal;

public class Hygiene extends Product{

	private int content;

	
	
	public Hygiene(String name, int price, int content) {
		super(name, price);
		this.content = content;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}
	//Sobrescribi el método toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+getName() +" /// Contenido: "+getContent()+"ml /// Precio: $"+getPrice();
	}
	
	
}
