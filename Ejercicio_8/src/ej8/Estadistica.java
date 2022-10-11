package ej8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Estadistica  {
//	Delantero: goles * 31 + pases * 1 + recuperaciones * 3 – tarjetasRojas * 2
//	Defensa: goles * 21 + pases * 1 + recuperaciones *4 – tarjetasRojas * 2
//	Portero: goles * 60 + paradas * 5 – tarjetasRojas * 2
	
	public double CalcularMVP(Jugador a) {
		
	
		if(a.getPosicion().toLowerCase().equals("delantero")) {
			a.setMVP( a.getGoles()* 31 + a.getPases() * 1 + a.getRecuperaciones() * 3 - a.getTRojas()*2);
		} else if (a.getPosicion().toLowerCase().equals("defensa")){
			a.setMVP(a.getGoles()* 21 + a.getPases()*1 + a.getRecuperaciones()*4 - a.getTRojas());
		} else {
			a.setMVP(a.getGoles()* 60 + a.getParadas() * 5 - a.getTRojas() * 2);
		}
		
   
		return a.getMVP();
		
		
	}
	
	
	}
	





