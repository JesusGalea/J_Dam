package siete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		String[] palabras = new String[8];
		ArrayList<String> colores = new ArrayList<>() {
			{
				add("verde");
				add("rojo");
				add("azul");
				add("amarillo");
				add("naranja");
				add("rosa");
				add("negro");
				add("blanco");
				add("morado");
			}
		};
		int finalArray = (palabras.length - 1);
		int comienzoArray= 0;
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("introduce una palabra");
			palabra = sc.next().toLowerCase();
			sc.reset();

			if (colores.contains(palabra)) {
				palabras[comienzoArray] = palabra;
				comienzoArray++;
			} else {
				palabras[finalArray] = palabra;
				finalArray--;
			}
			
		}
		for (int z = 0; z < palabras.length; z++) {
			System.out.println(palabras[z]);
		}

	}

}
