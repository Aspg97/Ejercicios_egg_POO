package Ej_14_telefono;

import java.util.Scanner;

/*
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
public class Movil_Service {
	
	Scanner leer = new Scanner(System.in);
	public int[] ingresarCodigo() {
		
		int codigo[] = new int[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + " del codigo del celular");
			codigo[i] = leer.nextInt();
		}
		return codigo;
	}

	public Movil cargarCelular() {
		String marca,modelo;
		double precio;
		int memoriaRam,almacenamiento;
		int codigo [] = new int [7];
		System.out.println("Ingrese la marca del celular");
		marca = leer.nextLine();
		System.out.println("Ingrese el precio del celular");
		precio = leer.nextDouble();
		leer.nextLine();
		System.out.println("Ingrese el modelo del celular");
		modelo = leer.nextLine();
		System.out.println("Ingrese el tamano de la memoria RAM");
		memoriaRam = leer.nextInt();
		System.out.println("Ingrese el tamano del almacenamiento");
		almacenamiento = leer.nextInt();
		System.out.println("Ingrese el codigo numerico");
		codigo = ingresarCodigo();
		Movil movil = new Movil(marca,precio,modelo,memoriaRam,almacenamiento,codigo);
		return movil;
	}
}
