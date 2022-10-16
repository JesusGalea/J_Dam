package ac;

import java.io.FileReader;
import java.io.IOException;

// clase persona con los atributos necesarios


public class Persona {
String nombre;
String apellido;
int edad;
double altura;
String foto;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public String getFoto() {
	return foto;
}

public void setFoto(String foto) {
	this.foto = foto;
}

public Persona(String a, String b, int c, double d, String e){
	nombre = a;
	apellido = b;
	edad = c;
	altura = d;
	foto = e;
}
}
