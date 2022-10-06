package ej8;

import java.util.ArrayList;
import java.util.Iterator;

public class Estadistica {
//	Delantero: goles * 31 + pases * 1 + recuperaciones * 3 – tarjetasRojas * 2
//	Defensa: goles * 21 + pases * 1 + recuperaciones *4 – tarjetasRojas * 2
//	Portero: goles * 60 + paradas * 5 – tarjetasRojas * 2
	
	public void MVP(Equipo a, Equipo b) {
		ArrayList campeon = new ArrayList();
	while (a.it1.hasNext()) {
		Jugador ju = (Jugador)a.it1.next();
		if(ju.getPosicion().toLowerCase().equals("delantero")) {
			ju.setMVP( ju.getGoles()* 31 + ju.getPases() * 1 + ju.getRecuperaciones() * 3 - ju.getTRojas()*2);
		} else if (ju.getPosicion().toLowerCase().equals("defensa")){
			ju.setMVP(ju.getGoles()* 21 + ju.getPases()*1 + ju.getRecuperaciones()*4 - ju.getTRojas());
		} else {
			ju.setMVP(ju.getGoles()* 60 + ju.getParadas() * 5 - ju.getTRojas() * 2);
		}
	}
	}
}
