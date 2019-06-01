package com.jmaraza.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola Mundo Feliz!!! :D");
		
		//Tipos de Datos
		//Enteros
		byte edad = 127;
		short year = 2020;
		
		
		//Arrays
		//Declaraciónn de Array
		int [] arregloInt = new int [2];
		double arregloDouble[];
		
		int [][] array2D = new int [2][3]; //Array de 2 Dimensiones 
		int [][][] array3D = new int [3][3][2]; //Cabe
		int [][][][] array4D = new int [1][2][3][4];
		
		char[][] days = { {'M','T','W'}, {'M','T','W'}};

		char[][][] days3D  = { {{'a'},{'b'},{'c'}}, {{'a'},{'b'},{'c'}}};
		
		char [] names = new char [4];
		names[0]= 'h';
		names[1]= 'o';
		names[2]= 'l';
		names[3]= 'a';
		
		//System.out.println(names[0]);
		//System.out.println(names[1]);
		//System.out.println(names[2]);
		//System.out.println(names[3]);
		
		
		char [][][][] monkey = new char [2][3][2][2];
		monkey [1][0][0][1] = 'm';
		
		//System.out.println(monkey [1][0][0][1]);
		
		
		//Operadores Aritméticos
		int a = 1;
		int aa= a+a;
		System.out.println("El valor de: a + a es igual a "+aa);
		
		double x = 2.56;
		int y = 9;
		float w = (float)x + y;
		
		double k = 4/0.000002;
		
		System.out.println(7%16);
		
		
		int f = 2;
		int g = 3;
		//f = f + f + f + g;
		f += g;
		
		System.out.println(f);
		
		
		int l = 3;
		//l++;   --> Primero lee y despues incrementa
		++l;	//---> Pre-fijo 1. Incremeta el valor, 2. Asignar el valor a 'l'
		//System.out.println(l);
		
		
		//Operadores de Equidad 
		int q = 8;
		int p = 5;
		//System.out.println(q != p);
		
		
		//Operadores Relacionales
		System.out.println("q > p : "+ (q>p));
		System.out.println("q < p : "+ (q<p));
		
		System.out.println("q >= p : "+ (q >= p));
		System.out.println("q <= p : "+ (q <= p));	
		
		//Operadores Lógicos
		boolean n = false;
		boolean m = true;
		
		//System.out.println("a && b --> "+(n&&m)) ;
		//System.out.println("a || b --> "+(n||m)) ;
		//System.out.println("!n --> "+(!n)) ;
		
		
		//Control de Flujo
		if(q>p) {
			System.out.println("Es mayor");
		}else if(q == p) {
			System.out.println("Es Igual");
		}else {
			System.out.println("No es Mayor ni igual");
		}
		
		//Switch
		int mes = 12;
		
		switch (mes) {
		case 1:
			System.out.println("Enero");
			
			break;
		case 2:
			System.out.println("Febrero");
			
			break;
		case 3:
			System.out.println("Marzo");
			
			break;
		case 4:
			System.out.println("Abril");
			
			break;
		case 5:
			System.out.println("Mayo");
			
			break;
		case 6:
			System.out.println("Junio");
			
			break;
		case 7:
			System.out.println("Julio");
			
			break;
		case 8:
			System.out.println("Agosto");
			
			break;
		case 9:
			System.out.println("Septiembre");
			
			break;
		case 10:
			System.out.println("Octubre");
			
			break;
		case 11:
			System.out.println("Noviembre");
			
			break;
		case 12:
			System.out.println("Diciembre");
			
			break;

		default:
				System.out.println("No existe ese mes");
			break;
		}
		
		
		System.out.println();
		
		
		
		int[] numeros = new int[5];
		
		for(int c=0; c<5;c++) {
			numeros[c]=c;
			System.out.println("Numeros["+c+"]: "+ numeros[c]);
		}
		
		//Foreach
		
		for (int i: numeros) {
			System.out.println(i);
		}
		
		
		
		
	}

}
