package view;

import java.util.Scanner;

import controllers.UsuarioController;
import models.Usuario;

public class UsuarioView {
	
	
	public static void main (String [] args) {
		 boolean bucle = true;
		 String nombre; 
		 String apellido;
		 String ciudad;
		 int id;
		 UsuarioController uc = new UsuarioController();
		 int opcion= 0;
		 Scanner sc = new Scanner(System.in);
		while(bucle) {
			
			System.out.println("Que desea hacer?"
					+ "\n1 - ver todos los usuarios"
					+ "\n2 - insertar un nuevo usuario"
					+ "\n3 - modificar un usuario"
					+ "\n4 - buscar un usuario"
					+ "\n5 - borrar un usuario"
					+ "\n6 - borrar todos los usuarios"
					+ "\n7 - salir ");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				uc.getUsuarios();
				break;
			case 2:
				System.out.println("introduce el nombre");
				 nombre = sc.next();
				System.out.println("introduce el apellido");
				 apellido = sc.next();
				System.out.println("introduce la ciudad");
				 ciudad = sc.next();
				uc.createUsuario(nombre, apellido, ciudad);
				break;
			case 3:
				System.out.println("introduce el id del usuario a modificar");
				 id = sc.nextInt();
				System.out.println("introduce el nuevo nombre");
				 nombre = sc.next();
				System.out.println("introduce el nuevo apellido");
				 apellido = sc.next();
				System.out.println("introduce la nueva ciudad");
				 ciudad = sc.next();
				uc.updateUsuario(id, nombre, apellido, ciudad);
				break;
			case 4:
				System.out.println("introduce el id del usuario a buscar");
				id = sc.nextInt();
				uc.getUsuario(id);
				break;
			case 5:
				System.out.println("introduce el id del usuario a borrar");
				id = sc.nextInt();
				uc.deleteUsuario(id);
				
			}
			
		}
		
		 		
	}
	
}
