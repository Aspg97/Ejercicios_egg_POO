package Ej_05_cuenta_bancaria;

import java.util.Scanner;

/*TODO Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
* a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
* b) Agregar los métodos getters y setters correspondientes
* c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
* d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
* e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
*f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/

public class Cuenta {
	private int numCuenta;
	private String dni;
	private String nombre;
	private int saldo;

	Scanner leer = new Scanner(System.in);

	public Cuenta() {
	}

	public Cuenta(int numCuenta, String nombre,String dni, int saldo) {
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cuenta crearCuenta() {
		System.out.println("Ingrese su Nombre");
		String nombre = leer.nextLine();
		System.out.println("Ingrese su DNI");
		String dni = leer.nextLine();
		Cuenta cuenta = new Cuenta(0,nombre, dni, 0);
		return cuenta;
	}

	public void ingresar(Cuenta cuenta,int ingreso) {
		int dinero = cuenta.getSaldo();
		cuenta.setSaldo(dinero+=ingreso);
	}

	public void retirar(int retiro) {
		if (retiro > this.saldo) {
			System.out.println("Saldo Insuficiente");
			this.saldo = 0;
		} else {
			this.saldo -= retiro;
		}
	}

	public void extraccionRapida(int retiro) {
		if (retiro > this.saldo * 0.2) {
			System.out.println("No puede sacar mas del 20% de su saldo");
		} else {
			this.saldo -= retiro;
		}
	}

	public void consultarSaldo() {
		System.out.println("Su saldo es:"+this.saldo);
	}

	public void consultarDatos(Cuenta cuenta) {
		System.out.println("Nombre: "+cuenta.getNombre()+"\nDNI:"+cuenta.getDni()+"\nSaldo: "+cuenta.getSaldo()+"\nNumero Cuenta: "+cuenta.getNumCuenta());
	}
}
