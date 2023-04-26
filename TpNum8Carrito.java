package ;

public class Carrito {
private int numero;  //carro1.damenumero() para acceder ya que esta encapsulado con private
private Cliente cliente;
private double montoTotal;

public Carrito (int numero, Cliente clie) {
	this.numero = numero;
	cliente= clie;
	montoTotal=0.0;	
}
//metodo getter
public int dameNumero() {
	return numero;
}
public Cliente dameClie() {
	return cliente;
}
public double dameMontoTotal() {
	return montoTotal;
}
public void mostrarMontoCarrito(double monto) {
	montoTotal = monto;
	System.out.println("Total de la compra: "+montoTotal);
}
}
