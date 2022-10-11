package ej8;



public class Partido  {
	static Estadistica est = new Estadistica();
static Jugador j1 = new Jugador ("Antonio",  "Delantero", 10, 2, 30, 2, 0 );
static Jugador j2 = new Jugador ("Pepe",  "Delantero", 20, 20, 0, 2, 0 );
static Jugador j3 = new Jugador ("Juan",  "Portero", 12, 20, 10, 2, 0 );
static Jugador j4 = new Jugador ("Mariano",  "Defensa", 14, 20, 30, 2, 0 );
static Jugador j5 = new Jugador ("Luis",  "Delantero", 23, 20, 30, 2, 0 );
	
public static void main(String[] args) {
	Equipo beti = new Equipo ("Betis");
	Equipo sevilla = new Equipo ("Sevilla");
	
	beti.Añadir(j1);
	beti.Añadir(j2);
	beti.Añadir(j3);
	sevilla.Añadir(j4);
	sevilla.Añadir(j5);
	
	System.out.println(est.CalcularMVP(j1));
	System.out.println(est.CalcularMVP(j2));

}
}
