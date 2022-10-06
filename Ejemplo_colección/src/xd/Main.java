package xd;

public class Main {
	public static Carrito carro = new Carrito();
	public static Articulos papitas = new Articulos("papitas lays campesinas", 0.95);
	public static Articulos zumo = new Articulos("zumito de naranja", 1.40);
	public static Articulos lechuga = new Articulos("verde y fresca", 1);
	public static Articulos galletas = new Articulos("rellenas de chocolate", 2.10);

	public static void main(String[] args) {

		carro.añadir(galletas);
		carro.añadir(lechuga);
		carro.añadir(zumo);
		carro.añadir(papitas);

		System.out.println("precio total: " + carro.Calcular_Compra(null));

	}

}
