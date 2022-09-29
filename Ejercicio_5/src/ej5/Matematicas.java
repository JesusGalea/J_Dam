package ej5;

//Ejercicio 5. Realizar una clase final Matemáticas que amplíe las declaraciones de

//métodos estáticos de la clase Matemáticas y que implemente una interfaz llamada MinMax
//compilada con el siguiente código fuente:
//public interface MinMax {
//int min(int [] a);
//int max(int [] a);
//double min(double [] a);
//double max(double [] a);
//}
//Si lo necesita cree una clase Main, con ejemplos para ejecutarlo.

public class Matematicas implements MinMax {

	public static void main(String[] args) {
		

	}

	@Override
	public int min(int[] a) {
		int m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < m) {
				m = a[i];
			}
		}
		return m;
	}

	@Override
	public int max(int[] a) {
		int m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > m) {
				m = a[i];
			}
		}
		return m;
	}

	@Override
	public double min(double[] a) {
		double m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < m) {
				m = a[i];
			}
		}
		return m;
	}

	@Override
	public double max(double[] a) {
		double m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > m) {
				m = a[i];
			}
		}
		return m;
	}

}
