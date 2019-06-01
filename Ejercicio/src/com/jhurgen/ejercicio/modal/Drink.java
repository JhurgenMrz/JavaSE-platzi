package com.jhurgen.ejercicio.modal;

public class Drink extends Product {

private float liters;
	
	

	public Drink(String name, int price, float liters) {
		super(name, price);
		this.liters = liters;
	}

	public float getLiters() {
		return (liters/1000);
	}

	public void setLiters(float liters) {
		this.liters = liters;
	}
	
	//Sobrescribi el método toString
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Nombre: "+getName() +" /// Litros: "+getLiters()+" /// Precio: $"+getPrice();
		}
}
