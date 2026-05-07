package Ejemplo15;

import java.util.Scanner;


public class Ejemplo15 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double notaUno = ingreso();
		double notaDos = ingreso();
		double notaTres = ingreso();
		double promedio = calculo(notaUno, notaDos, notaTres);
		String logicaAprob = logica(promedio);
		salida(promedio, logicaAprob);
	}

	private static void salida(double promedio, String logicaAprobacion) {

		System.out.println("Tu promedio es de: " + promedio);

		System.out.println("Tu estado es: " + logicaAprobacion);

	}

	private static String logica(double promedio) {
		String estado;
		if (promedio >= 6) {

			estado = "aprobado";
		}

		else {

			estado = "desaprobado";
		}

		return estado;
	}

	private static double calculo(double notaUno, double notaDos, double notaTres) {

		double resultadoSuma;

		resultadoSuma = (notaUno + notaDos + notaTres);
		double promedio = resultadoSuma / 3;

		return promedio;
	}

	private static double ingreso() {

		System.out.println("ingrese su nota: ");

		return entrada.nextDouble();

	}

}
