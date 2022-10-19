package uno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double ex1;
		Double ex2;

		System.out.println("introduce tu primera nota");
		ex1 = sc.nextDouble();
		
		System.out.println("introduce la nota deseada");
		Double nota = sc.nextDouble();
		
		ex2 = (nota - (ex1*0.4)) / 0.6;
		
		System.out.println("nota necesaria en el segundo examen: " + ex2);
		
		

	}

}
