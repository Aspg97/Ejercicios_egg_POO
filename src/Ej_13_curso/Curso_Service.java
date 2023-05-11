package Ej_13_curso;

import java.util.Scanner;

/*
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos

 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
*/

public class Curso_Service {
	Scanner leer = new Scanner(System.in);

	public String[] llenarAlumnos() {
		String alumnos[] = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese el nombre del alumno " + (i + 1));
			alumnos[i] = leer.nextLine();
			leer.next();
		}
		return alumnos;
	}

	public Curso crearCurso() {
		String nombreCurso, turno;
		int cantidadHorasPorDia, cantidadHorasPorSemana;
		double precioPorHora;
		String alumnos[] = new String[5];
		System.out.println("Ingrese el nombre del curso");
		nombreCurso = leer.nextLine();
		System.out.println("Ingrese la cantidad de horas por dia");
		cantidadHorasPorDia = leer.nextInt();
		System.out.println("Ingrese la cantidad de horas por semana");
		cantidadHorasPorSemana = leer.nextInt();
		System.out.println("Ingrese el turno 'mañana' o 'tarde'");
		turno = leer.next();
		System.out.println("Ingrese el precio por hora");
		precioPorHora = leer.nextDouble();
		System.out.println("Ingrese los nombres de los 5 alumnos");
		alumnos = llenarAlumnos();
		Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadHorasPorSemana, turno, precioPorHora,
				alumnos);
		return curso;
	}
	
	public void calcularGanaciaSemanal(Curso curso) {
		double gananciaSemanal = curso.getPrecioPorHora()*curso.getCantidadHorasPorDia()*curso.getCantidadHorasPorSemana()*curso.getAlumnos().length;
		System.out.println("La ganacia semanal es de: $"+gananciaSemanal);
	}
}
