package ej8;



public class Partido  {
	static Estadistica est = new Estadistica();
static Jugador j1 = new Jugador ("Antonio",  "Delantero", 10, 2, 30, 2, 0 );
static Jugador j2 = new Jugador ("Pepe",  "Delantero", 20, 20, 0, 2, 0 );
static Jugador j3 = new Jugador ("Juan",  "Portero", 12, 20, 10, 2, 0 );
static Jugador j4 = new Jugador ("Mariano",  "Defensa", 14, 20, 30, 2, 0 );
static Jugador j5 = new Jugador ("Luis",  "Delantero", 23, 20, 30, 2, 0 );
static Jugador j6 = new Jugador ("Mbappe",  "Delantero", 14, 2, 30, 2, 0 );
static Jugador j7 = new Jugador ("Joselito",  "Delantero", 25, 20, 0, 5, 0 );
static Jugador j8 = new Jugador ("Carlos",  "Portero", 12, 20, 10, 2, 6 );
static Jugador j9 = new Jugador ("Juan Alberto",  "Defensa", 14, 25, 30, 2, 0 );
static Jugador j10 = new Jugador ("Manolo",  "Delantero", 23, 20, 32, 2, 0 );
static Jugador j11 = new Jugador ("Jesus",  "Delantero", 10, 23, 30, 2, 0 );
static Jugador j12 = new Jugador ("Jose",  "Delantero", 20, 25, 7, 7, 0 );
static Jugador j13 = new Jugador ("Josemi",  "Portero", 12, 20, 12, 2, 0 );
static Jugador j14 = new Jugador ("Ismael",  "Defensa", 14, 20, 40, 2, 0 );
static Jugador j15 = new Jugador ("Zihao",  "Delantero", 23, 50, 30, 2, 0 );
static Jugador j16 = new Jugador ("El patas",  "Delantero", 20, 2, 30, 24, 0 );
static Jugador j17 = new Jugador ("Verdejo",  "Delantero", 20, 20, 0, 24, 0 );
static Jugador j18 = new Jugador ("Paco",  "Portero", 12, 20, 12, 2, 2 );
static Jugador j19 = new Jugador ("Geodude",  "Defensa", 0, 0, 0, 0, 0 );
static Jugador j20 = new Jugador ("Luis Antonio",  "Delantero", 13, 4, 30, 2, 0 );
static Jugador j21 = new Jugador ("Alvaro",  "Defensa", 14, 20, 30, 5, 0 );
static Jugador j22 = new Jugador ("Francisco",  "Delantero", 23, 20, 50, 2, 0 );
	
public static void main(String[] args) {
	Equipo beti = new Equipo ("Betis");
	Equipo sevilla = new Equipo ("Sevilla");
	
	beti.Añadir(j1);
	beti.Añadir(j2);
	beti.Añadir(j3);
	beti.Añadir(j4);
	beti.Añadir(j5);
	beti.Añadir(j6);
	beti.Añadir(j7);
	beti.Añadir(j8);
	beti.Añadir(j9);
	beti.Añadir(j10);
	beti.Añadir(j11);
	
	sevilla.Añadir(j12);
	sevilla.Añadir(j13);
	sevilla.Añadir(j14);
	sevilla.Añadir(j15);
	sevilla.Añadir(j16);
	sevilla.Añadir(j17);
	sevilla.Añadir(j18);
	sevilla.Añadir(j19);
	sevilla.Añadir(j20);
	sevilla.Añadir(j21);
	sevilla.Añadir(j22);
	
	
 est.CalcularMVP(beti,sevilla);
	

}
}
