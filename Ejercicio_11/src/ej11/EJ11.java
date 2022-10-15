package ej11;

import java.util.HashMap;
import java.util.Scanner;

public class EJ11 {
	static HashMap<String, String> diccionario = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");
		diccionario.put("Ratón", "Mouse");
		diccionario.put("Caballo", "Horse");
		diccionario.put("Pollo", "Chicken");
		diccionario.put("Cuervo", "Crow");
		diccionario.put("Mono", "Monkey");
		diccionario.put("Zorro", "Fox");
		diccionario.put("Rana", "Frog");
		diccionario.put("Mariposa", "Butterfly");
		diccionario.put("Conejo", "Rabbit");
		diccionario.put("Buho", "Owl");

		System.out.println("introduce la palabra en español");

		String clave = sc.next();

		if (diccionario.containsKey(clave)) {
			System.out.println(diccionario.get(clave));
		}

	}

}
