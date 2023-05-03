package Ej_05_cuenta_bancaria;

import java.util.Scanner;

public class main_cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int eleccion,deposito,retiro;
		Cuenta tool = new Cuenta();
		System.out.println("Primero creemos tu cuenta");
		Cuenta c1 = tool.crearCuenta();
		
		do {
			
			System.out.println("////////////// MENU //////////////");
			System.out.println("1. Depositar\n2. Retirar\n3. Retiro rapido\n4. Consultar Saldo.\n5. Consultar Datos\n6. Salir");
			System.out.println("** Elija una opcion **");
			System.out.println("//////////////////////////////////");
			eleccion = leer.nextInt();
			switch (eleccion) {
			case 1:
				System.out.println("Ingrese la cantidad a depositar");
				deposito = leer.nextInt();
				tool.ingresar(c1,deposito);
				break;
			case 2:
				System.out.println("Que cantidad desea retirar?");
				retiro = leer.nextInt();
				c1.retirar(retiro);
				break;
			case 3:
				System.out.println("Ingrese el monto a retirar de forma rapida?");
				retiro = leer.nextInt();
				c1.extraccionRapida(retiro);
				break;
			case 4:
				c1.consultarSaldo();
				break;
			case 5:
				tool.consultarDatos(c1);
				break;
			case 6:
				System.out.println("Bay");
				eleccion = 6;
				break;
			}
		}while(eleccion != 6);
		
	}

}
