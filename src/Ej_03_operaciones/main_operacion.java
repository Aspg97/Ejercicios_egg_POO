package Ej_03_operaciones;

public class main_operacion {

	public static void main(String[] args) {
		Operacion tool = new Operacion();
		Operacion op1 = tool.crearOperacion();
		
		tool.sumar(op1);
		tool.restar(op1);
		tool.multiplicar(op1);
		tool.division(op1);

	}

}
