package Ej_13_curso;

public class Main_Curso {

	public static void main(String[] args) {
		Curso_Service tool = new Curso_Service();
		Curso c1 = tool.crearCurso();
		System.out.println("\n<----------------->\n");
		tool.calcularGanaciaSemanal(c1);
		System.out.println("\n<----------------->\n");
	}

}
