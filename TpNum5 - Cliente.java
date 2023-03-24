package tpNumCinco;

public class Cliente {
	private int codigo;
	private String nombre;
	private int dni;
	private String dire;
	//metodo constructor 1
	public Cliente (int codigo, String nombre, int dni, String dire) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.dni = dni;
		this.dire = dire;
		
	}
	//metodo constructor 2 - sobrecarga de constructores
	public Cliente (int codigo, String nombre, int dni) {
		this(codigo, nombre, dni, "Direccion por defecto");
	}
	//metodo constructor 3 - sobrecarga de constructores
	public Cliente(int codigo, String nombre) {
		this(codigo, nombre, 11111111, "Dire por defecto");
	}
	public int dameCodigo() {
		return codigo;
	}
	public String dameNombre() {
		return nombre;
	}
	public int dameDni() {
		return dni;
	}
	public String dameDire() {
		return dire;
	}
	public void mostrarCliente() {
		System.out.println("Cliente: ");
		System.out.println("Codigo: "+codigo);
		System.out.println("Nombre: "+nombre);
		System.out.println("DNI: "+dni);
		System.out.println("Direccion: "+dire);
	}
	}


