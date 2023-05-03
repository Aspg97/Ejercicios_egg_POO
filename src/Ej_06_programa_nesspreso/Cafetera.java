package Ej_06_programa_nesspreso;

import java.util.Scanner;

/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/

public class Cafetera {
	public int capMax;
	public int cantAct;
	Scanner leer = new Scanner(System.in);
	
	public Cafetera() {
	}
	
	public Cafetera(int capMax, int cantAct) {
		this.capMax = capMax;
		this.cantAct = cantAct;
	}

	public double getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	public double getCantAct() {
		return cantAct;
	}

	public void setCantAct(int cantAct) {
		this.cantAct = cantAct;
	}
	
	public void llenarCafetera() {
		this.cantAct = this.capMax;
	}
	
	public void servirTaza(int tamTaza) {
		if(tamTaza>this.cantAct) {
			System.out.println("Cafe insuficiciente:");
			System.out.println("Se lleno "+this.cantAct+"oz de cafe");
			this.cantAct = 0;
		}else {
			this.cantAct -= tamTaza;
		}
	}
	
	public void vaciarCafetera() {
		this.cantAct=0;
	}
	
	public void agregarCafe(int cantidad) {
		this.cantAct += cantidad;
	}
}
