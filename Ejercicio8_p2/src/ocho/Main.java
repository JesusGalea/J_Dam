package ocho;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int gente = 0;
		int[] ocupacion = new int[10];
		int[] mesas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < ocupacion.length; i++) {
			num = r.nextInt(0, 5);
			ocupacion[i] = num;
		}
		do {

			System.out.println("           ---------------------");
			System.out.println(
					"Mesas:     |" + mesas[0] + "|" + mesas[1] + "|" + mesas[2] + "|" + mesas[3] + "|" + mesas[4] + "|"
							+ mesas[5] + "|" + mesas[6] + "|" + mesas[7] + "|" + mesas[8] + "|" + mesas[9] + "|");
			System.out.println("           ---------------------");
			System.out.println("ocupacion: |" + ocupacion[0] + "|" + ocupacion[1] + "|" + ocupacion[2] + "|"
					+ ocupacion[3] + "|" + ocupacion[4] + "|" + ocupacion[5] + "|" + ocupacion[6] + "|" + ocupacion[7]
					+ "|" + ocupacion[8] + "|" + ocupacion[9] + "|");
			System.out.println("           ---------------------");
			System.out.println("cuantos son? (-1 para salir del programa)");
			gente = sc.nextInt();
			if (gente > 4) {
				System.out.println("lo sentimos, se admiten grupos de " + gente);
			}

			for (int z = 0; z < ocupacion.length; z++) {
				if (ocupacion[z] + gente <= 4) {
					ocupacion[z] = ocupacion[z] + gente;
					System.out.println("sientense en la mesa " + (z + 1));
					break;
				}
			}
		} while (gente != -1);
	}

}
