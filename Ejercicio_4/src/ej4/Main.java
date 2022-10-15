package ej4;

public class Main {

	public static void main(String[] args) {
		double [] t = {4.3,5,2.3};
		ArrayReal AR = new ArrayReal();
		System.out.println("minimo " +AR.minimo(t));
		System.out.println("maximo " + AR.maximo(t));
		System.out.println("sumatorio " + AR.sumatorio(t));

	}

}
