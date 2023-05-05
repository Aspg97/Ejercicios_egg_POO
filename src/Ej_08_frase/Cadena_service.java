package Ej_08_frase;

import java.util.Scanner;

/*
a)Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/

public class Cadena_service {
	Scanner leer = new Scanner(System.in);
	public Cadena crearCadena () {
		String frase;
		int longitud;
		System.out.println("Ingrese la frase");
		frase = leer.next();
		longitud = frase.length();
		Cadena cadena = new Cadena(frase,longitud);
		return cadena;
	}
	
	public void contarVocales(Cadena cadena) {
		String frase = cadena.getFrase();
		int cont = 0;
	    for(int i = 0 ; i < frase.length(); i++) {
	    	if(frase.substring(i, i+1).equalsIgnoreCase("a")||frase.substring(i, i+1).equalsIgnoreCase("e")||
	    			frase.substring(i, i+1).equalsIgnoreCase("i")||frase.substring(i, i+1).equalsIgnoreCase("o")||
	    			frase.substring(i, i+1).equalsIgnoreCase("u")) {
	    		cont ++;
	    	}
	    }
	    System.out.println("La fras ingresada contine " + cont +" vocales");
	}
	
	public void invertirFrase(Cadena cadena) {
		String frase = cadena.getFrase();
		String fraseInvertida="";
		for(int i = frase.length() ; i > 0 ; i--) {
			fraseInvertida=fraseInvertida.concat(frase.substring(i-1, i));
		}
		System.out.println("La frase invertida es: "+fraseInvertida);
	}
	
	public void vecesRepetido(Cadena cadena, String letra) {
		String frase = cadena.getFrase();
		int cont=0;
		for(int i = 0 ; i < frase.length() ; i++) {
			if(letra.equalsIgnoreCase(frase.substring(i,i+1))) {
				cont++;
			}
		}
		System.out.println("La letra "+"'"+letra+"' se repite "+cont+" veces");
	}
	
	public void compararLongitud(Cadena cadena, String frase) {
		String fraseDeCadena = cadena.getFrase();
		if(fraseDeCadena.length()>frase.length()) {
			System.out.println("La frase de la clase 'Cadena' es mayor a la frase ingresada posteriormente");
		}else {
			System.out.println("La frase ingresada posteriormente es mayor a la frase de la clase 'Cadena'");
		}
	}
	
	public void unirFrases(Cadena cadena, String frase) {
		String fraseDeCadena=cadena.getFrase(),nuevaFrase="";
		nuevaFrase = fraseDeCadena.concat(" "+frase);
		System.out.println("La nueva frase es: "+nuevaFrase);
	}
	
	public void reemplazar(Cadena cadena, String letra) {
		String frase = cadena.getFrase(), nuevaFrase = "";
		for(int i = 0 ; i < frase.length() ; i++) {
			if(frase.substring(i, i+1).equalsIgnoreCase("a")) {
				nuevaFrase = nuevaFrase.concat(letra);
			}else {
				nuevaFrase = nuevaFrase.concat(frase.substring(i,i+1));
			}
		}
		System.out.println("La nueva frase es: "+nuevaFrase);
	}
	
	public boolean contiene(Cadena cadena, String letra) {
		String frase = cadena.getFrase();
		boolean afirmacion = false;
		for(int i = 0 ; i < frase.length() ; i++) {
			if(frase.substring(i,i+1).equalsIgnoreCase(letra)) {
				afirmacion = true;
			}
		}
		return afirmacion;
	}
}
