package Ej_04_rectangulo;

public class main_rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo tool = new Rectangulo();
		Rectangulo rec = tool.crearRectangulo();
		tool.area(rec);
		tool.perimetro(rec);
		tool.dibujarRectangulo(rec);
	}

}
