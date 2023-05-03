package Ej_04_rectangulo;

import java.util.Scanner;

/*TODO Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

public class Rectangulo {
	private int base;
	private int altura;
	
	Scanner leer = new Scanner(System.in);
	
	public Rectangulo() {
	}

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Rectangulo crearRectangulo() {
		Rectangulo rec = new Rectangulo();
		System.out.println("Ingrese la altura del rectangulo");
		rec.setAltura(leer.nextInt());
		System.out.println("Ingrese la base del rectangulo");
		rec.setBase(leer.nextInt());
		return rec;
	}
	
	public void area(Rectangulo rec) {
		System.out.println("La superficie del rectangulo es: "+(rec.getAltura()*rec.getBase()));
	}
	
	public void perimetro(Rectangulo rec) {
		System.out.println("El perimetro del rectangulo es: "+(Math.pow(rec.getAltura(), 2)+Math.pow(rec.getBase(), 2)));
	}
	
	public void dibujarRectangulo(Rectangulo rec) {
		for(int i=0;i<rec.getAltura();i++) {
			for(int j=0;j<rec.getBase();j++) {
				if(i==0||j==0||i==rec.getAltura()-1||j==rec.getBase()-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
