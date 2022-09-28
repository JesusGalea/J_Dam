package ej4;

//Ejercicio 4. Realizar una clase ArrayReal que declare un atributo de tipo double[]y que implemente una interfaz llamada Recuentos.El contenido de esta interfaz es el siguiente:
//public interface Recuentos {
//	double minimo();
//
//	double maximo();
//
//	double sumatorio();}
//
//	Si lo
//	necesita cree
//	una clase Main,
//	con ejemplos
//	para ejecutarlo.

public class  ArrayReal implements Recuentos {

	static double [] ar = {3.8, 4.0, 5.9};
	

	@Override
	 public  double minimo() {
		double a = ar[0];
		 for (int i = 0 ; i < ar.length; i++) {
			if (a> ar[i]) {
				a = ar[i];
			}
		 }
		return a ;
	}

	@Override
	public double maximo() {
		double a = ar[0];
		 for (int i = 0 ; i < ar.length; i++) {
			if (a< ar[i]) {
				a = ar[i];
			}
		 }
		return a ;
	}

	@Override
	public double sumatorio() {
		double a = ar[0];
		 for (int i = 0 ; i < ar.length; i++) {
			a = a + ar[i];
		 }
		return a ;
	}

}


