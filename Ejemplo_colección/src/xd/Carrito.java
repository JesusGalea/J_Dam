package xd;

import java.util.*;

public class Carrito {
	public static Collection carr = new ArrayList();
	
	public void añadir(Articulos a) {
		carr.add(a);
	}
	
	public double Calcular_Compra(Collection a) {
		double total = 0;
		Iterator it = carr.iterator();
		while (it.hasNext()) {
			Articulos art = (Articulos)it.next();
			total = total + art.getPrecio();
		}
		
		
		return total;
	}

	public static Collection getCarr() {
		return carr;
	}

	public static void setCarr(Collection carr) {
		Carrito.carr = carr;
	}

}
