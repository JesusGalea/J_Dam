package xd;

public class Articulos {
String desc;
double precio;

public Articulos (String a, double b) {
	desc = a;
	precio = b;
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



}
