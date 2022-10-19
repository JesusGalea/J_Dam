package nueve;

public class Main {

	public static void main(String[] args) {
		esCapicua(77877);

	}
public static boolean esCapicua (int a) {
	int cantidad = a;
	int resto;
	int inverso = 0;
	while (cantidad != 0) {
		resto = cantidad%10;
		cantidad = cantidad/10;
		inverso = inverso*10+ resto;
	}
	
	if (inverso == a) {
		return true;
	} else {
		return false;
	}
	
}
	
	public boolean esPrimo(int a ) {
		
		return false;
	}
}
