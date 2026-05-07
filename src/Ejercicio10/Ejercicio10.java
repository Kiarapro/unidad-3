package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner entrada = new Scanner(System.in);
	static String producto;
	static Double precio;

	public static void main(String[] args) {
		pedirDatos();
		imprimirEtiqueta(producto, precio);
	}

	private static void pedirDatos() {
		// TODO Auto-generated method stub

		System.out.println("Ingrese el nombre del producto");
		producto = entrada.nextLine();

		System.out.println("Ingrese el precio del producto");
		precio = entrada.nextDouble();
		entrada.nextLine();
		validarDatos();
	}

	private static void imprimirEtiqueta(String nombreProducto, double precioProd) {
		// TODO Auto-generated method stub
		System.out.println("Producto: " + nombreProducto);

		System.out.println("Precio: " + precioProd);

	}

	private static void validarDatos() {

		while (precio < 0) {

			System.err.println("Precio invalido. Intenta de nuevo s.");
			precio = entrada.nextDouble();
			entrada.nextLine();
		}

		while (producto.isBlank()) {

			System.err.println("Intenta de nuevo");
			producto = entrada.nextLine();
		
		}

	}

}