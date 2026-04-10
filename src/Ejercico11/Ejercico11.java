package Ejercico11;

import java.util.Scanner;

public class Ejercico11 {
	static Scanner entrada = new Scanner(System.in);
	static double montoIgresado;
	static int opcionElegida;
	static double saldoActual = 100;
    static double montoADepositar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarMenu();
		verSaldo();
		depositarDinero();
		retirarDinero();

	}

	private static void mostrarMenu() {
		// TODO Auto-generated method stub
	
		do {

			System.out.println("Elija una opción:");
			System.out.println("---Menu---");
			System.out.println("1: Ver saldo actual");
			System.out.println("2: Depositar dinero");
			System.out.println("3: Retirar dinero");
			System.out.println("4: Salir");

			opcionElegida = entrada.nextInt();

			switch (opcionElegida) {

			case 1: verSaldo();
			
				break;

			case 2: depositarDinero();

				break;

			case 3: retirarDinero();
				
				break;
				
			case 4:

				System.out.println("salir");
				break;

			default:

				System.out.println("nada que ver tu número. Igrese nuevamente");
				break;

			}

		} while (opcionElegida != 4);
	}

	private static void verSaldo() {
		// TODO Auto-generated method stub
 
		System.out.println("SALDO ACTUAL: " + saldoActual);
	}

	private static void depositarDinero() {
		// TODO Auto-generated method stub
        System.out.println("Monto a ingresar: ");
        montoADepositar = entrada.nextDouble();
        
        saldoActual  = montoADepositar + saldoActual;
        
        System.out.println("Su saldo actual es de: "+saldoActual);
	}

	private static void retirarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Igrese su monto a retirar: ");
		montoIgresado = entrada.nextDouble();

		if (montoIgresado < saldoActual) {
			saldoActual = saldoActual - montoIgresado;

		} else {
			System.err.println("fondos insuficientes");
		}

	}

}
