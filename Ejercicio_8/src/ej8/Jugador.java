package ej8;

public class Jugador extends Equipo {
String nombre;
String posicion;
int goles;
int pases;
int recuperaciones;
int TRojas;
int Paradas;
double MVP;

public Jugador() {
	
}
public Jugador (String n, String p, int g, int pas, int rec, int Tr, int par) {
	nombre = n;
	posicion = p;
	goles = g;
	pases = pas;
	recuperaciones = rec;
	TRojas = Tr;
	Paradas = par;
	MVP = 0;
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getPosicion() {
	return posicion;
}
public void setPosicion(String posicion) {
	this.posicion = posicion;
}
public int getGoles() {
	return goles;
}
public void setGoles(int goles) {
	this.goles = goles;
}
public int getPases() {
	return pases;
}
public void setPases(int pases) {
	this.pases = pases;
}
public int getRecuperaciones() {
	return recuperaciones;
}
public void setRecuperaciones(int recuperaciones) {
	this.recuperaciones = recuperaciones;
}
public int getTRojas() {
	return TRojas;
}
public void setTRojas(int tRojas) {
	TRojas = tRojas;
}
public int getParadas() {
	return Paradas;
}
public void setParadas(int paradas) {
	Paradas = paradas;
}



}
