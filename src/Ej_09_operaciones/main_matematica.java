package Ej_09_operaciones;

/*
En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/

public class main_matematica {

	public static void main(String[] args) {
		int mayor[] = new int[2];
		Matematica numeros = new Matematica();
		numeros.setNumA(Math.round(Math.random()*(10+10)-10));
		numeros.setNumB(Math.round(Math.random()*(10+10)-10));
		System.out.println(numeros.getNumA() + ", " + numeros.getNumB());
		mayor = devolverMayor((int) numeros.getNumA(), (int) numeros.getNumB());
		System.out.println("Numeros generados automaticamente\nMayor: "+mayor[0]+"\nMenor es: "+mayor[1]);
		calcularPotencia(mayor[0],mayor[1]);
		calcularRaiz(mayor[1]);
	}

	public static int[] devolverMayor(int n1, int n2) {
		int orden[] = new int[2];
		orden[0] = Math.max(n1, n2);
		orden[1] = Math.min(n1, n2);
		return orden;
	}

	public static void calcularPotencia(int mayor, int menor) {
		if(menor<0) {
			menor *= -1;
		}
		System.out.println(mayor+" elevado a la potencia "+menor+" es: "+Math.pow(mayor, menor));
	}
	
	public static void calcularRaiz(int num) {
		if(num<0) {
			num *= -1;
		}
		System.out.println("La raiz cuadrada de "+num+" es: "+Math.sqrt(num));
	}
	

}
