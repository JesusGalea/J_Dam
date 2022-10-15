package ej6;

public class Main {

	public static void main(String[] args) {
		double [] cifras = {4.5, 6.7, 10};
		ArrayRealExtendido are = new ArrayRealExtendido();
		
		System.out.println("la media de las cifras es: " + are.media(cifras));
		System.out.println("el sumatorio de las cifras es: " + are.sumatorio(cifras));
		System.out.println("el maximo de las cifras es: " + are.maximo(cifras));
		System.out.println("el minimo de las cifras es: " + are.minimo(cifras));

	}

}
