package Ej_01_creacion_objeto;

public class main_libro {

	public static void main(String[] args) {
		Libro libro = new Libro();
		Libro l1 = libro.crearLibro();
		libro.mostrarLibro(l1);
	}

}
