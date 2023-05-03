package Ej_02_circunferencia;

import java.util.Scanner;

/*TODO Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/


public class Circunferencia {
	private double radio;
	Scanner leer = new Scanner(System.in);
	
	
	
	public Circunferencia() {
	}

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public Circunferencia crearCircun() {
		System.out.println("Ingrese el radio de la circunferencia");
		Circunferencia circun = new Circunferencia(leer.nextDouble());
		return circun;
	}
	
	public void area(Circunferencia circu) {
		System.out.println("El area del circulo es:" + (Math.PI*Math.pow(circu.getRadio(), 2)));
	}
	
	public void perimetro(Circunferencia circu) {
		System.out.println("El area del circulo es:" + (2*Math.PI*circu.getRadio()));
	}
}
