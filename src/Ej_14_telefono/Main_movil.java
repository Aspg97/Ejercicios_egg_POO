package Ej_14_telefono;

public class Main_movil {

	public static void main(String[] args) {
		Movil_Service tool = new Movil_Service();
		Movil m1 = tool.cargarCelular();
		System.out.println(m1.getMarca()+" "+m1.getModelo());
	}
}
