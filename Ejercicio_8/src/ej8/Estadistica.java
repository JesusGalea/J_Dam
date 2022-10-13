package ej8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Estadistica  {
//	Delantero: goles * 31 + pases * 1 + recuperaciones * 3 – tarjetasRojas * 2
//	Defensa: goles * 21 + pases * 1 + recuperaciones *4 – tarjetasRojas * 2
//	Portero: goles * 60 + paradas * 5 – tarjetasRojas * 2
	
	public void CalcularMVP(Equipo a, Equipo b) {
		String nChampion = null, nDos = null , nTres = null, nCuatro = null , nCinco = null;
		Double mvpChampion = 0.0 , mvpDos = 0.0 , mvpTres = 0.0, mvpCuatro = 0.0, mvpCinco =  0.0;
		for (int x = 0; x < a.equ.size(); x++){
			Jugador ju = a.equ.get(x);
			
		if(ju.getPosicion().toLowerCase().equals("delantero")) {
			ju.setMVP( ju.getGoles()* 31 + ju.getPases() * 1 + ju.getRecuperaciones() * 3 - ju.getTRojas()*2);
		} else if (ju.getPosicion().toLowerCase().equals("defensa")){
			ju.setMVP(ju.getGoles()* 21 + ju.getPases()*1 + ju.getRecuperaciones()*4 - ju.getTRojas());
		} else {
			ju.setMVP(ju.getGoles()* 60 + ju.getParadas() * 5 - ju.getTRojas() * 2);
		}
		
		if (ju.getMVP() > mvpChampion) {
			mvpDos = mvpChampion;
			nDos = nChampion;
			mvpChampion = ju.getMVP();
			nChampion = ju.getNombre();
			
		} else if (ju.getMVP() > mvpDos) {
			mvpTres = mvpDos;
			nTres = nDos;
			
			mvpDos = ju.getMVP();
			nDos = ju.getNombre();
			
		} else if (ju.getMVP() > mvpTres) {
			mvpCuatro = mvpTres;
			nCuatro = nTres;
			
			mvpTres = ju.getMVP();
			nTres = ju.getNombre();
		}
		else if (ju.getMVP() > mvpCuatro) {
			mvpCinco = mvpCuatro;
			nCinco = nCuatro;
			
			mvpCuatro = ju.getMVP();
			nCuatro = ju.getNombre();
		}
		else if (ju.getMVP() > mvpCinco) {
			mvpCinco = ju.getMVP();
			nCinco = ju.getNombre();
			
		}
		
		}
		
		for (int x = 0; x < b.equ.size(); x++){
			Jugador ju = b.equ.get(x);
			
		if(ju.getPosicion().toLowerCase().equals("delantero")) {
			ju.setMVP( ju.getGoles()* 31 + ju.getPases() * 1 + ju.getRecuperaciones() * 3 - ju.getTRojas()*2);
		} else if (ju.getPosicion().toLowerCase().equals("defensa")){
			ju.setMVP(ju.getGoles()* 21 + ju.getPases()*1 + ju.getRecuperaciones()*4 - ju.getTRojas());
		} else {
			ju.setMVP(ju.getGoles()* 60 + ju.getParadas() * 5 - ju.getTRojas() * 2);
		}
		
		if (ju.getMVP() > mvpChampion) {
			mvpDos = mvpChampion;
			nDos = nChampion;
			mvpChampion = ju.getMVP();
			nChampion = ju.getNombre();
			
		} else if (ju.getMVP() > mvpDos) {
			mvpTres = mvpDos;
			nTres = nDos;
			
			mvpDos = ju.getMVP();
			nDos = ju.getNombre();
			
		} else if (ju.getMVP() > mvpTres) {
			mvpCuatro = mvpTres;
			nCuatro = nTres;
			
			mvpTres = ju.getMVP();
			nTres = ju.getNombre();
		}
		else if (ju.getMVP() > mvpCuatro) {
			mvpCinco = mvpCuatro;
			nCinco = nCuatro;
			
			mvpCuatro = ju.getMVP();
			nCuatro = ju.getNombre();
		}
		else if (ju.getMVP() > mvpCinco) {
			mvpCinco = ju.getMVP();
			nCinco = ju.getNombre();
			
		}
		
		}
		
		
		System.out.println("el mvp es: " + nChampion + " con una puntuación de: " + mvpChampion);
		System.out.println("el segundo mvp es: " + nDos + " con una puntuación de: " + mvpDos);
		System.out.println("el tercer mvp es: " + nTres + " con una puntuación de: " + mvpTres);
		System.out.println("el cuarto mvp es: " + nCuatro + " con una puntuación de: " + mvpCuatro);
		System.out.println("el quinto mvp es: " + nCinco + " con una puntuación de: " + mvpCinco);
		
		
	}
	
	
	}
	





