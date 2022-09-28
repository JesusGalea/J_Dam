package ej3;

import java.util.Scanner;

//Ejercicio 3. Escriba un programa que nos diga el horóscopo que es a partir del día y
//mes introducido. 

public class EJ3 {

	static Scanner sc = new Scanner(System.in);
	static int dia = 0;
	static int mes = 0;

	public static void main(String[] args) {
		System.out.println("Introduce el numero de dia");

		dia = sc.nextInt();

		System.out.println("Introduce el numero de mes");

		mes = sc.nextInt();

		switch (mes) {
		case 1:
			if (dia < 21) {
				System.out.println("Capricornio");

			} else {
				System.out.println("Acuario");
			}
			break;

		case 2:
			if (dia < 20) {
				System.out.println("Acuario");

			} else {
				System.out.println("Piscis");
			}
			break;

		case 3:
			if (dia < 21) {
				System.out.println("Piscis");

			} else {
				System.out.println("Aries");
			}
			break;

		case 4:
			if (dia < 20) {
				System.out.println("Aries");

			} else {
				System.out.println("Tauro");
			}
			break;

		case 5:
			if (dia < 20) {
				System.out.println("Tauro");

			} else {
				System.out.println("Geminis");
			}
			break;

		case 6:
			if (dia < 22) {
				System.out.println("Geminis");

			} else {
				System.out.println("Cancer");
			}
			break;

		case 7:
			if (dia < 22) {
				System.out.println("Cancer");

			} else {
				System.out.println("Leo");
			}
			break;

		case 8:
			if (dia < 24) {
				System.out.println("Leo");

			} else {
				System.out.println("Virgo");
			}
			break;

		case 9:
			if (dia < 23) {
				System.out.println("Virgo");

			} else {
				System.out.println("Libra");
			}
			break;

		case 10:
			if (dia < 23) {
				System.out.println("Libra");

			} else {
				System.out.println("Escorpio");
			}
			break;

		case 11:
			if (dia < 23) {
				System.out.println("Escorpio");

			} else {
				System.out.println("Sagitario");
			}
			break;

		case 12:
			if (dia < 21) {
				System.out.println("Sagitario");

			} else {
				System.out.println("Capricornio");
			}
			break;

		}

	}

}
