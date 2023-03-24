package tpNumCinco;

public class ItemCarrito {
	
	private Carrito num; 
	private Producto prod;
	private int cant;
	private double montoItem;
	
public ItemCarrito (Carrito numero, Producto producto, int cant) {
num = numero;
prod = producto;
this.cant = cant;
montoItem = prod.un_prec()* cant;
}

public int dameCant () {
	return cant;
}
public double dameMontoItem () {
	return montoItem;
}
public void mostrarTitulo () {
	System.out.println("Cant/Precio/Producto\tSub-Total");
}
public void mostrarItem(ItemCarrito vector[]) {
	System.out.println(cant+"\t"+prod.un_prec()+"\t"+montoItem+"\t\t"+prod.un_nombre());
}
public void dameTitulo() {
	System.out.println("Cant\tPrecio\tSubTotal\tProducto");

}
}




