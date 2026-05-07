package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double numeroIngresado = ingresoNum();
		
		System.out.println("El resultado es de " + numeroDecimal(numeroIngresado)  );
		
	
	}

	private static double ingresoNum() {
		double valorIngresado;
		System.out.println("Ingrese un numero decimal, pls");
		valorIngresado = entrada.nextDouble();
		System.out.println("El numero entero es: " + valorIngresado);
		
		 return valorIngresado;
	}

	private static double numeroDecimal(double numeroIngresado) {
		// TODO Auto-generated method stub
		
		int numeroEntero = (int) numeroIngresado;
		
		double resultadoFraccionaria = numeroIngresado - numeroEntero ;
		 
		return resultadoFraccionaria;
	}

}
