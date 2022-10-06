package xd;

import java.util.*;

public class Carrito {
	public static Collection carr = new ArrayList();
	
	public void añadir(Articulos a) {
		if(carr.contains(a) == false) {
		carr.add(a);
		} else {
			a.setCantidad(a.getCantidad()+1);
		}
	}
	
	public double Calcular_Compra() {
		double total = 0;
		Iterator it = carr.iterator();
		while (it.hasNext()) {
			Articulos art = (Articulos)it.next();
			total = total + (art.getPrecio() * art.getCantidad());
		}
		

		return total;
	}

	public static Collection getCarr() {
		return carr;}

	public static void setCarr(Collection carr) {
		Carrito.carr = carr;
	}

}
