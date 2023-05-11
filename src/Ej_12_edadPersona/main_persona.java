package Ej_12_edadPersona;

import java.util.Scanner;

public class main_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int edadSP;
		Persona_Service tool = new Persona_Service();
		Persona p1 = tool.crearPersona();
		System.out.println("\n<--------------------->\n");
		tool.calcularEdad(p1);
		System.out.println("\n<--------------------->\n");
		System.out.println("Ingrese la edad de una segunda persona");
		edadSP = leer.nextInt();
		if (tool.menorQue(p1, edadSP) == false)
			System.out.println("La dedad de " + p1.getNombre() + " es mayor a la edad ingresada (" + edadSP + ")");
		else
			System.out.println("La dedad de " + p1.getNombre() + " es menor a la edad ingresada (" + edadSP + ")");
		System.out.println("\n<--------------------->\n");
		tool.mostrarPersona(p1);
	}

}
