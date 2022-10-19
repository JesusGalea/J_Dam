package nueve;

public class Main {

	public static void main(String[] args) {
		pegaPorDetras(12345, 2);

	}

	public static boolean esCapicua(int a) {
		int cantidad = a;
		int resto;
		int inverso = 0;
		while (cantidad != 0) {
			resto = cantidad % 10;
			cantidad = cantidad / 10;
			inverso = inverso * 10 + resto;
		}

		if (inverso == a) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean esPrimo(int a) {
		boolean primo = true;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				return false;
			}

		}
		return true;
	}

	
	public static int siguientePrimo(int a) {
		int primo = a +1;
		
		do {
			esPrimo(primo);
			primo++;
		} while (esPrimo(primo) == false);
			
		
		
		return primo;
	}
	
	public static Double potencia(Double a, int b) {

		Double resultado = 0.0;
		resultado = Math.pow(a, b);
		
		return resultado;
	}
	
	public static void digitos (int a) {
		String numero = Integer.toString(a) ;
		
		System.out.println("digitos: " + numero.length());
	}
	
	public static void digitosN (int a, int b) {
		char numero = Integer.toString(a).charAt((b-1)) ;
		
		System.out.println(numero);
	}
	public static void quitaPorDetras(int a, int b) {
		String numero = Integer.toString(a);
		for (int i = 0 ; i < b ; i++) {
		 numero = numero.substring(0, numero.length()-1);
		}
		System.out.println(numero);
	}
	
	public static void quitaPorDelante(int a, int b) {
		String numero = Integer.toString(a);
		
		for (int i = 0 ; i < b ; i++) {
		 numero = numero.substring(1, numero.length());
		}
		System.out.println(numero);
	}
	
	public static void pegaPorDetras(int a, int b) {
		String numero = Integer.toString(a);
		String añadido = Integer.toString(b);
		numero = numero + añadido;
		System.out.println(numero);
	}
	
	public static void pegaPorDelante(int a, int b) {
		String numero = Integer.toString(a);
		String añadido = Integer.toString(b);
		numero = añadido + numero;
		System.out.println(numero);
	}
}
