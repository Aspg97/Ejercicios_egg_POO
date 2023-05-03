package Ej_06_programa_nesspreso;

import java.util.Scanner;

public class main_cafetera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		Cafetera cafetera = new Cafetera(1000,0);
		int op,cantidad;	
		do {
			System.out.println("////////////// MENU ///////////////");
			System.out.println("1. Llenar Cafetera.\n2. Servir Taza.\n3. Vaciar Cafetera\n4. Agregar Cafe\n5. Apagar Maquina");
			System.out.println("///////////////////////////////////");
			System.out.println("Seleccione una opcion");
			op = leer.nextInt();
			switch(op) {
			case 1:
				cafetera.llenarCafetera();
				System.out.println("Cantidad de cafe actual: "+cafetera.getCantAct()+"oz");
				break;
			case 2:
				System.out.println("Ingrese la capacidad de la taza");
				cantidad = leer.nextInt();
				cafetera.servirTaza(cantidad);
				System.out.println("Cantidad de cafe actual: "+cafetera.getCantAct()+"oz");
				break;
			case 3:
				cafetera.vaciarCafetera();
				System.out.println("Cantidad de cafe actual: "+cafetera.getCantAct()+"oz");
				break;
			case 4:
				System.out.println("Cual es la cantidad de cafe que va a agregar en la cafetera");
				cantidad = leer.nextInt();
				cafetera.agregarCafe(cantidad);
				System.out.println("Cantidad de cafe actual: "+cafetera.getCantAct()+"oz");
				break;
			case 5:
				System.out.println("BYEEEE...");
				break;
			}
		}while(op != 5);
	}

}
