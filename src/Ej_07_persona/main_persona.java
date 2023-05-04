package Ej_07_persona;

/*
A continuación, en la clase main hacer lo siguiente:

Crear 4 objetos de tipo Persona con distintos valores

, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/
public class main_persona {
	
	public static void main(String[] args) {
		//int prueba = 0;
		int contPIB = 0, contPIC = 0, contPIS = 0, contMaE = 0,defC;
		boolean defE;
		Persona tool = new Persona();
		
		Persona persona [] = new Persona[4];
		
		for(int i = 0 ; i < 4 ; i++) {
			persona[i] = tool.crearPersona();
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("<-------------------------->");
			System.out.println("Informacion de: " + persona[i].getNombre());
			defC = persona[i].calcularIMC();
			if(defC==1) {
				contPIS++;
			}else if (defC == 0) {
				contPIC++;
			}else if (defC==-1) {
				contPIB++;
			}
			defE = persona[i].esMayorDeEdad();
			if(defE == true) {
				contMaE++;
			}
			System.out.println("<-------------------------->");
			System.out.println();
		}
		
		porcentajeIMC(contPIB, contPIC, contPIS);
		porcentajeEdad(contMaE);
	}
	
	public static void porcentajeIMC(int contPIb, int contPIC, int contPIS) {
		System.out.println("Porcentajes de IMC:\n Bajo el peso ideal: "+(contPIb*100/4)+"%\nEn el peso ideal: "+(contPIC*100/4)+"%\nSobre Peso: "+(contPIS*100/4)+"%\nTOTAL: "+((contPIb*100/4)+(contPIC*100/4)+(contPIS*100/4))+"%");
	}
	
	public static void porcentajeEdad(int contMaE) {
		System.out.println("Porcentajes de edades:\n Mayor de Edad: "+(contMaE*100/4)+"%\nMenor de edad: "+(100-(contMaE*100/4))+"%");
	}
}
