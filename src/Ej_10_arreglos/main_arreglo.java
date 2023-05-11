package Ej_10_arreglos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.

Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/
public class main_arreglo {

	public static void main(String[] args) {
		double arregloA[] = new double[50];
		double arregloB[] = new double[20];

		for (int i = 0; i < 50; i++) {
			arregloA[i] = Math.round(Math.random() * 1000.0) / 100.0;
		}
		for (int i = 0; i < 50; i++) {
			System.out.println(arregloA[i] + ",");
		}

		System.out.println("\n<><><><><><><><><>\n");

		Arrays.sort(arregloA);

		for (int i = 0; i < 50; i++) {
			System.out.println(arregloA[i] + ",");
		}

		System.out.println("\n<><><><><><><><><>\n");

		for (int i = 0; i < 10; i++) {
				arregloB[i] = arregloA[i];
			
		}
		
		Arrays.fill(arregloB,10,arregloB.length,0.5);

		for (int i = 0; i < 20; i++) {
			System.out.println(arregloB[i]);
		}
	}

}
