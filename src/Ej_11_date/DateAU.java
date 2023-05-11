package Ej_11_date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/

public class DateAU {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int dia,mes,anio;
		System.out.println("Ingrese una fecha a comparar con la fecha actual >> FORMATO: A/M/D");
		anio = leer.nextInt();
		mes = leer.nextInt();
		dia = leer.nextInt();
		LocalDate fechaUser = LocalDate.of(anio,mes,dia);
		LocalDate fechaACtual = LocalDate.now();
		Period distancia = Period.between(fechaUser, fechaACtual);
		System.out.println("Fecha ingresada: "+fechaUser+"\nFecha Actual: "+fechaACtual+"\nDiferencia de anios: "+distancia.getYears());
		
	}
	
	

}
