package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	static Scanner entrada = new Scanner(System.in);
	static double montoIngresado;
	static double precioFinal;

	public static void main(String[] args) {

		
		mostrarDatos(calculo(28000));
		
		mostrarDatos(calculo(11000));
		
		mostrarDatos(calculo(ingresarMonto()));
	}

	public static void mostrarDatos(double precioFinal) {
		System.out.println("el precio final es: " + precioFinal);
	}

	private static double calculo(double montoIngresado) {

		if (montoIngresado > 15000) {

			double descuento = montoIngresado * 0.10;
			double precioFinalDescuento = montoIngresado - descuento;

			return precioFinalDescuento;
		} else {
			return montoIngresado;
		}

	}

	private static double ingresarMonto() {

		System.out.println("ingrese el monto");
		montoIngresado = entrada.nextDouble();

		while (montoIngresado <= 0) {

			System.err.println("monto invalido. Ingrese de nuevo.");
			montoIngresado = entrada.nextDouble();

		}

		return montoIngresado;
	}

}
