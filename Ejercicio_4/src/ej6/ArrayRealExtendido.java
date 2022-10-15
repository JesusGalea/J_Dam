package ej6;

public class ArrayRealExtendido extends ej4.ArrayReal {
	
	public void Calcular(double [] a) {
		minimo(a);
		sumatorio(a);
		maximo(a);
		media(a);
	}
	public double media (double [] a) {
		double total = 0;
		double media = 0;
		
		for(int i = 0; i< a.length; i++) {
			total = total+ a[i];
			
		}
		media = total/a.length;
		
		return media;
	}
}
