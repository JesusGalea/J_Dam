package doce;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] puntos = { 9, 5, 3, 2, 1 };
		int[] maximos = { 1, 2, 2, 2, 8 };
		int[] comidos = { 0, 0, 0, 0, 0 };
		int total = 0;
		int cantidad = 0;
		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			if (  total+(puntos[i]*maximos[i])<= 15) {
				 cantidad = r.nextInt(0, (maximos[i]+1));
				comidos[i] = cantidad;
				total = total + comidos[i] * puntos[i];
			}else if(total+puntos[i] <= 15) {
				cantidad = r.nextInt(0, 1);
				comidos[i] = cantidad;
				total = total + comidos[i] * puntos[i];
						
				
			}else {
				break;
			}
		}

		System.out.println(" Reina torres alfiles caballos peones");
		System.out.println("   "+comidos[0]+"\t " + comidos[1] + "\t "+ comidos[2] + "\t "+ comidos[3]+ " \t" + comidos[4]);
		System.out.println("puntos totales: " + total);

	}

}
