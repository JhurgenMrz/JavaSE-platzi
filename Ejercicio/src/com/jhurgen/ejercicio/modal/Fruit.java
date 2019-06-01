package com.jhurgen.ejercicio.modal;

public class Fruit extends Product {

	private String unit;
	
	

	public Fruit(String name, int price, String unit) {
		super(name, price);
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	//Sobrescribi el método toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+getName() +" /// Precio: $"+getPrice()+ " /// Unidad de Venta: "+getUnit();
	}
	
	
}
