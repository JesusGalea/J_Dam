package ej8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Equipo {
String Nombre_Equipo ;
Collection equ = new ArrayList();
Iterator it1 = equ.iterator();
public Equipo() {
	
}

public Equipo(String a) {
	Nombre_Equipo = a;
}

public void Añadir(Jugador a) {
	if (equ.contains(a)== false) {
	equ.add(a);
	}
}

public String getNombre_Equipo() {
	return Nombre_Equipo;
}

public void setNombre_Equipo(String nombre_Equipo) {
	Nombre_Equipo = nombre_Equipo;
}

}
