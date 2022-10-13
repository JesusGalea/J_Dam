package ej8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Equipo {
String Nombre_Equipo ;
List<Jugador> equ = new ArrayList<Jugador>();
public Equipo() {
	
}

public Equipo(String a) {
	Nombre_Equipo = a;
}

public void Añadir(Jugador a) {
	
	equ.add(a);

}

public String getNombre_Equipo() {
	return Nombre_Equipo;
}

public void setNombre_Equipo(String nombre_Equipo) {
	Nombre_Equipo = nombre_Equipo;
}

}
