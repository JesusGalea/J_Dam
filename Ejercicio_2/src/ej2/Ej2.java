package ej2;
import java.util.Scanner;

//Ejercicio 2. Introduzca el número de mes por teclado, el programa deberá mostrar en
//cada caso, el nombre del mes por pantalla, si introducimos un valor que no corresponda con
//los 12 meses del año, deberá mostrar un mensaje de error “no existe ese mes”.


public class Ej2 {
	
	static 	Scanner sc = new Scanner(System.in);
	static int mes = 0;
	static String [] meses= {"Enero" , "Febrero" , "Marzo" , "Abril", "Mayo" , "Junio", "Julio" , "Agosto" , "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	
	public static void main(String[] args) {
		System.out.println("introduce el numero del mes");
		mes = sc.nextInt();
		if (mes > 0 && mes <= 12) {
		System.out.println("El mes es " + meses[(mes-1)]);
		} else { 
			System.out.println("ese numero no pertenece a ningun mes");
		}

	}

}
