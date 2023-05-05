package Ej_08_frase;

import java.util.Scanner;

/*
En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:*/

public class main_cadena {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Scanner leerOP = new Scanner(System.in);
		int op;
		String parametro;
		Cadena cadena = new Cadena();
		Cadena_service tool = new Cadena_service();
		System.out.println("Ingrese una frase");
		cadena.setFrase(leer.nextLine());
		cadena.setLongitud(cadena.getFrase().length());
		System.out.println("La informacion reconocida a partir de la frase ingresada es: \nFrase: "+cadena.getFrase()+"\nLongitud: "+cadena.getLongitud());

		do {
			System.out.println("<<<<<<<<<<<<<< MENU >>>>>>>>>>>>>>");
			System.out.println("1. Contar Vocales.\n2. Invertir Frase\n3. Ver cuantas veces se repite una letra."
					+ "\n4. Comparar longitud de la cadena ingresada con una nueva.\n5. Unir la frase ingresada con una nueva.\n"
					+ "6. Reemplazar una letra por las letras 'a' de la frase.\n7. Buscar una letra\n8. Salir");
			System.out.println("<<<<<<<<<<<<< FIN MENU >>>>>>>>>>>>");
			System.out.println("Que accion desea realizar con la frase ingresada");
			op = leer.nextInt();
			leer.nextLine();
			switch (op) {
			case 1:
				System.out.println("<--------------------------->");
				tool.contarVocales(cadena);
				System.out.println("<--------------------------->");
				break;
			case 2:
				System.out.println("<--------------------------->");
				tool.invertirFrase(cadena);
				System.out.println("<--------------------------->");
				break;
			case 3:
				System.out.println("<--------------------------->");
				System.out.println("Ingrese la letra que desea ver cuantas veces se repite");
				parametro = leer.next();
				tool.vecesRepetido(cadena, parametro);
				System.out.println("<--------------------------->");
				break;
			case 4:
				System.out.println("<--------------------------->");
				System.out.println("Ingrese una frase para comparar");
				parametro = leer.nextLine();
				tool.compararLongitud(cadena, parametro);
				System.out.println("<--------------------------->");
				break;
			case 5:
				System.out.println("<--------------------------->");
				System.out.println("Ingrese la nueva frase a unir con la anterior");
				parametro = leer.nextLine();
				tool.unirFrases(cadena, parametro);
				System.out.println("<--------------------------->");
				break;
			case 6:
				System.out.println("<--------------------------->");
				System.out.println("Ingrese la letra que desea integrar");
				parametro = leer.next();
				tool.reemplazar(cadena, parametro);
				System.out.println("<--------------------------->");
				break;
			case 7:
				System.out.println("<--------------------------->");
				System.out.println("Cual es la letra que desea buscar?");
				parametro = leer.next();
				System.out.println(tool.contiene(cadena, parametro));
				System.out.println("<--------------------------->");
				break;
			case 8:
				System.out.println("<--------------------------->");
				System.out.println("Bye");
				System.out.println("<--------------------------->");
				break;
			}
		} while (op != 8);
	}

}
