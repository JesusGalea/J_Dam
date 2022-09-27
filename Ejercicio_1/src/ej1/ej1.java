package ej1;

import java.util.ArrayList;
import java.util.Scanner;

//Ejercicio 1. Construya un programa que lea los números por teclado de manera infinita
//hasta que se introduzca la palabra “fin” (independientemente de que se escriba en
//mayúsculas o minúsculas). Al finalizar el programa realizará la media de todos los valores.
//Deberá mostrar por pantalla todos los números introducidos, el número lecturas realizadas
//y el valor medio calculado.


public class ej1 {

	static Scanner sc = new Scanner(System.in);
	static double total = 0;
	static ArrayList<Double> valores = new ArrayList<Double>();
	static String input = "";
	static boolean bucle = true;
	public static void main(String[] args) {
		do {
			
		System.out.println("Introduce un numero para hacer la media o la palabra fin para terminar");
		input = sc.next();
		if (comprobar(input)== true) {
			double numero = Double.parseDouble(input);
			valores.add(numero);
			
		} else {
			if (input.toLowerCase().equals("fin")) {
			bucle = false;
		}
		}
		
		} while(bucle);
		System.out.print("numeros introducidos: ");
		for (int i = 0; i < valores.size(); i++) {
			total = total + valores.get(i);
			System.out.print(valores.get(i)+ " ");
		}
		System.out.println("\nsuma total: "+ total);
		System.out.println("numero de lecturas: "+ valores.size());
		System.out.println("media: "+ (total/valores.size()));
		
		
	}
	
	public static boolean comprobar(String a) {
	    if (a == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(a);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}

}
