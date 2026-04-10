package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	static int opcionElegida = 0;
	static int puntajeMax = 0;
	static int puntaje = 0;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		mostrarMenu();


	}

	public static void mostrarMenu() {

		do {

			System.out.println("Elija una opción:");
			System.out.println("---Menu---");
			System.out.println("1: Registrar puntaje");
			System.out.println("2: Mostrar mejor puntaje");
			System.out.println("3: Salir");

			opcionElegida = entrada.nextInt();

			switch (opcionElegida) {

			case 1:
				registrarPuntaje();
				break;

			case 2:

				System.out.println("El récord actual es: " + puntajeMax + " puntos");
				break;

			case 3:

				System.out.println("salir");
				break;

			default:

				System.out.println("nada que ver tu número");
				break;

			}

		} while (opcionElegida != 3);
	}

	private static void registrarPuntaje() {
		System.out.println("Registrar puntaje");
		puntaje = entrada.nextInt();
		validarIngreso();

		if (puntaje > puntajeMax) {
			puntajeMax = puntaje;
		}
		mostrarMejorPuntaje();
	}

	private static void mostrarMejorPuntaje() {
		// TODO Auto-generated method stub
		System.out.println("El mejor puntaje es: " + puntajeMax);
	}

	private static void validarIngreso() {
		// TODO Auto-generated method stub

		while (puntaje < 0 || puntaje > 500) {

			System.err.println("Puntaje invalido. Ingrese nuevamente, sorete");
			puntaje = entrada.nextInt();
			mostrarMejorPuntaje();
		}

	}
}
