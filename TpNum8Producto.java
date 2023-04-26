package ;

public class Producto {
	private int codigo;
	private String nombre;
	private String desc;
	private double precio;

	public Producto(int cod, String nomb, String descripcion, double prec) {
		codigo = cod;
		nombre = nomb;
		desc = descripcion;
		precio = prec;
		
	}
	/// CREAMOS LOS METODOS GETTERS PARA ACCEDER AL CONTENIDO DE LOS ATRIBUTOS/PROPIEDADES

	public int un_codigo(){
		return codigo;
	}

	public String un_nombre(){
		return nombre;
	}
	public String un_desc(){
		return desc;
	}
	public double un_prec(){
		return precio;
	}
	public void mostrarProducto () {
		System.out.println("Producto: ");
		System.out.println("Codigo: "+codigo);
		System.out.println("Nombre: "+nombre);
		System.out.println("Descripcion: "+desc);
		System.out.println("Precio: "+precio);

	}
	}


