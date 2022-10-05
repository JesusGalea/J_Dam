package xd;

public class Punto implements IPunto {
private double x;
private double y;

public Punto() {
	x = 0;
	y = 0;
}
public Punto(double a, double b) {
	x = a;
	y = b;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public void borrar() {
	x = 0;
	y = 0;
}
public void mover(double a, double b) {
	x = a;
	y = b;
}
public void mover (IPunto a) {
	
}



}
