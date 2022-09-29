package ej5;

public class Main {
	static Matematicas math = new Matematicas();
	static int [] Aint = {2,6,1}; 
	static double [] Ado = {90.5,5,8,12}; 
	public static void main(String[] args) {
		System.out.println("min int " + math.min(Aint));
		System.out.println("max int " + math.max(Aint));
		System.out.println("min double " + math.min(Ado));
		System.out.println("max double " + math.max(Ado));
		

	}

}
