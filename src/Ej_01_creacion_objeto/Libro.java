package Ej_01_creacion_objeto;

import java.util.Scanner;

/* TODO Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numPag;
	
	Scanner leer = new Scanner(System.in);
	
	public Libro(String isbn, String titulo, String autor, int numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	public Libro() {
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	public Libro crearLibro() {
		
		Libro libro = new Libro();
		System.out.println("Ingrese el ISBN del libro");
		libro.setIsbn(leer.nextLine());
		System.out.println("Ingrese el titulo del libro");
		libro.setTitulo(leer.nextLine());
		System.out.println("Ingrese el autor del libro");
		libro.setAutor(leer.nextLine());
		System.out.println("Ingrese el numero de paginas");
		libro.setNumPag(leer.nextInt());
		
		return libro;
	}
	
	public void mostrarLibro(Libro libro) {
		System.out.println(libro.getAutor()+", "+libro.getIsbn()+", "+libro.getNumPag()+", "+libro.getTitulo());
	}
	
	
	
}
