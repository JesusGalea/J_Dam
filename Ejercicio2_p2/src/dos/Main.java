package dos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int altura;
		char caracter;
		
		System.out.println("introduce la altura de la piramide");
		altura = sc.nextInt();
		
		System.out.println("introduce el caracter de la piramide");
		caracter = sc.next().charAt(0);
		 int planta = 1;
		    int largo = 1;
		    int huecos = altura-1;
		    
		    while (planta <= altura) {
		      
		      for (int i = 1; i <= huecos; i++) {
		        System.out.print(".");
		      }

		      for (int z = 1; z <= largo; z++) {
		        System.out.print(caracter);
		      }

		      System.out.println();
		     
		      huecos = huecos -1;
		      planta = planta +1; 
		      largo = largo + 2;
	}
	}
}
