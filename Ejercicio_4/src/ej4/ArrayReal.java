package ej4;



public class  ArrayReal implements Recuentos {

	
	


	@Override
	 public  double minimo(double [] b) {
		double a = b[0];
		 for (int i = 0 ; i < b.length; i++) {
			if (a> b[i]) {
				a = b[i];
			}
		 }
		return a ;
	}

	@Override
	public double maximo(double [] b) {
		double a = b[0];
		 for (int i = 0 ; i < b.length; i++) {
			if (a< b[i]) {
				a = b[i];
			}
		 }
		return a ;
	}

	@Override
	public double sumatorio(double [] b) {
		double a = b[0];
		 for (int i = 0 ; i < b.length; i++) {
			a = a + b[i];
		 }
		return a ;
	}

}


