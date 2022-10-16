package ac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Main {
	static Acciones ac = new Acciones();

	public static void main(String[] args) {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		ArrayList<Persona> gente = new ArrayList<Persona>();
		gente = ac.Objetizar();
		do {

			System.out.println("bienvenido, pulse el numero que corresponda a lo que desee hacer");
			System.out.println("[1] Borrar todo el contenido del archivo [2] añadir un usuario [3] borrar un usuario");
			System.out.println(
					"[4] recuperar el ultimo usuario borrado  [5] ver la imagen de un usuario  [6] comprobar los usuarios existentes");
			System.out.println("[7] ver los datos de un usuario [8] salir del programa");

			opcion = sc.nextInt();
			if (opcion == 1) {
				ac.reset();
				gente = ac.Objetizar();
				System.out.println("hecho!");
			}

			if (opcion == 2) {
				System.out.println(
						"introduzca los datos del usuario a añadir en el siguiente orden: Nombre, Apellido, edad, altura y la url de su imagen");
				String nombre = sc.next().strip();
				String apellido = sc.next().strip();
				int edad = sc.nextInt();
				Double altura = sc.nextDouble();
				String foto = sc.nextLine();
				ac.añadir(nombre, apellido, edad, altura, foto);
				gente = ac.Objetizar();
				System.out.println("usuario creado!");

			}

			if (opcion == 3) {
				System.out.println("introduzca el nombre completo y apellidos del usuario a borrar");
				String nombre = sc.next();
				String apellido = sc.next();
				ac.borrar(nombre, apellido);

			}

			if (opcion == 4) {
				ac.recuperar();
				System.out.println("hecho");
			}

			if (opcion == 5) {
				System.out.println("Introduzca el nombre y los apellidos del usuario cuya foto quiere ver");
				String nombre = sc.next().strip();
				String apellidos = sc.next().strip();

				for (int i = 0; i < gente.size(); i++) {
					if (gente.get(i).getNombre().equalsIgnoreCase(nombre)
							&& gente.get(i).getApellido().equalsIgnoreCase(apellidos)) {
						ac.imagen(gente.get(i).foto);
					}
				}

			}

			if (opcion == 6) {
				for (int i = 0; i < gente.size(); i++) {
					System.out.println((i + 1) + " " + gente.get(i).nombre + " " + gente.get(i).apellido);
				}
			}

			if (opcion == 7) {
				System.out.println("Introduzca el nombre y los apellidos del usuario cuya foto quiere ver");
				String nombre = sc.next().strip();
				String apellidos = sc.next().strip();

				for (int i = 0; i < gente.size(); i++) {
					if (gente.get(i).getNombre().equalsIgnoreCase(nombre)
							&& gente.get(i).getApellido().equalsIgnoreCase(apellidos)) {
						System.out.println(gente.get(i).nombre + " " + gente.get(i).apellido + " edad: "
								+ gente.get(i).edad + " altura: " + gente.get(i).altura);
					}
				}
			}

			if (opcion == 8) {
				salir = true;
			}

		} while (salir != true);

	}
}
