package xd;

public class Articulos {
String desc;
double precio;
int cantidad;

public Articulos (String a, double b) {
	desc = a;
	precio = b;
	cantidad = 1;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}





}
