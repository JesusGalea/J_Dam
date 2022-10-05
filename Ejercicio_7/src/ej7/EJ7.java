package ej7;

import java.util.Scanner;

//Ejercicio 7. La empresaria Macarena Aloja ha creado una tienda de venta de banderas 
//españolas, nos ha contratado para que le hagamos un configurador de precios. Calcularemos 
//el precio de cada bandera dependiendo de su tamaño (ancho y alto). El precio del que 
//partimos es de 1 céntimo de € el centímetro cuadrado. Además, si queremos que aparezca 
//el escudo tendrá un coste adicional de 3.75€ independientemente del tamaño. Al no disponer 
//de Amazon Prime, cada envío que se realice fuera de la ciudad de Sevilla tendrá un coste de 
//4,25€. Todas las peticiones, deben estar controladas para que no se introduzcan letras o 
//caracteres no válidos (en ese caso deberá volver a repetir la pregunta). Se muestra un ejemplo 
//de salida:

//Introducir el ancho de la bandera (en cm): __
//Introducir el alto de la bandera (en cm): __
//¿Quiere escudo? (s/n): __
//Localidad de envío: __________

//Desglose de la factura:
//Bandera XXX cm2 = ___ €
//Escudo = ___ €
//Gastos de envio = ____ €
//Total pedido = _______€

public class EJ7 {
	static Scanner sc = new Scanner(System.in);
	static double an = 0;
	static double alt = 0;
	static char escudo = ' ';
	static String localidad = "";
	static boolean a = false;

	public static void main(String[] args) {

		try {
			System.out.println("Introducir el ancho de la bandera (en cm)");

			an = sc.nextDouble();
			
			System.out.println("Introducir el alto de la bandera (en cm)");

			alt = sc.nextDouble();

			System.out.println("Quiere escudo? (s/n)");

			escudo = sc.next().charAt(0);

			System.out.println("Localidad de envio");

			localidad = sc.next().toLowerCase();
			a = true;
		} catch (Exception e) {
			System.out.println("error");
		}

		System.out.println(localidad);
		factura();

	}

	public static void factura() {
		double cm2 = an * alt;
		double pescudo = 0;
		double plocalidad = 4.25;
		if (escudo == 's') {
			pescudo = 3.75;
		}

		if (localidad.equals("sevilla")) {
			plocalidad = 0;
		}
		System.out.println("Desglose de la factura: ");
		System.out.println("Bandera " + cm2 + " cm2 = " + (cm2 * 0.01) + " € ");
		System.out.println("Escudo = " + pescudo + " € ");
		System.out.println("Gastos de envio = " + plocalidad + " € ");
		System.out.println("Total pedido = " + ((cm2 * 0.01) + pescudo + plocalidad) + " € ");

	}
}
