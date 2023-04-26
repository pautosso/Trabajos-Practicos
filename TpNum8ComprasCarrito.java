package ;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComprasCarrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto(101, "Jabon en polvo", "Para ropa color", 40);
		Producto p2 = new Producto(102, "Esponja", "Verde", 10);
		Producto p3 = new Producto(103, "Chocolate", "Bolsa x 500g", 100.1);
		Producto p4 = new Producto(104, "Azucar", "Bolsa 500", 200);
		Producto p5 = new Producto(105, "Cafe", "Negro", 300);
		Producto p6 = new Producto(106, "Fideos", "Bolsa x 300g", 150);

		Cliente c1 = new Cliente (101, "Tosso Paula", 40920075, "Lamadrid 2000");	
		Cliente c2 = new Cliente (102, "Gonzalez Patricia", 30920075, "Barcel 3000");	
		Cliente c3 = new Cliente (103, "Rodriguez Florencia", 42920075, "La Rioja 2000");
	
			
		Carrito carro1= new Carrito(40, c1);
		
		//ItemCarrito item[]= new ItemCarrito [3];
	
		ItemCarrito item1 = new ItemCarrito(carro1, p1, 1);
		ItemCarrito item2 = new ItemCarrito(carro1, p2, 3);
		ItemCarrito item3 = new ItemCarrito(carro1, p3, 2);
		ItemCarrito item4 = new ItemCarrito(carro1, p4, 4);
		ItemCarrito item5 = new ItemCarrito(carro1, p5, 5);
		ItemCarrito item6 = new ItemCarrito(carro1, p6, 6);
		
		List <ItemCarrito> listaI;//declaracion
		listaI = new ArrayList<ItemCarrito> ();
		
		listaI.add(item1);
		listaI.add(item2);
		listaI.add(item3);
		listaI.add(item4);
		listaI.add(item5);
		listaI.add(item6);
		
		Iterator <ItemCarrito> itI = listaI.iterator();
		while (itI.hasNext()) {
			ItemCarrito datos = itI.next();
			datos.mostrarItem();
			if(datos.dameNombre().equals ("Azucar")) {
			itI.remove();
			}
			datos.mostrarItem();
			}
			
		}
	
	
	public static void aplicarDescuento (double monto) {
		
		final double montoMinimo = 5000;
		
		LocalDate fecha = LocalDate.now(); //muestra la fecha
		int dia = fecha.getDayOfMonth();
		
		if (dia%2!=0) {
			Descuento desc1 = new DescuentoFijo();
			desc1.setValorDesc(150);
			double montoF = desc1.valorFinal(monto);
			if (montoF > 0)
			System.out.println("Monto del Carrito con Descuento Fijo: "+String.format("%.2f",montoF));
			else
				System.out.println("El monto no se puede aplicar");
			//System.out.println("Monto del carrito con descuento fijo: " +desc1.valorFinal(monto));
		    
		}
		else {
			Descuento desc2 = new DescuentoPor ();
			if (monto<montoMinimo) {
				desc2.setValorDesc(0.10);
			}
			else
			desc2.setValorDesc(0.15);
			double montoD =desc2.valorFinal( monto); 
			if (montoD > 0)
				System.out.println("Monto del Carrito con Descuento %: "+String.format("%.2f",montoD));
			else
				System.out.println("El monto no se puede aplicar");
			
				//System.out.println("Monto del carrito con porcentaje: " +desc2.valorFinal(monto));
		}
		
	}
	public static void mostrarCompras(List listaI, Carrito carro1, Cliente c1) {
		
		Iterator<ItemCarrito> itI = listaI.iterator();
		boolean titulo=true;
		double monto=0;
		
		while (	itI.hasNext()) {
			ItemCarrito datos = itI.next();
			if (titulo) {
				datos.dameTitulo();
				titulo=false;
			}
			datos.mostrarItem();	
			monto = monto + datos.dameMontoItem();
			}
		carro1.dameMontoTotal();
		carro1.mostrarMontoCarrito(monto);
		if (monto > 0 ) 
		aplicarDescuento(monto);
		else
			System.out.println("El monto del carro no permite descuentos");				
		}
	
	    public static double mostrarCompras(ItemCarrito item[], Carrito carro1, Cliente c1) {
		double suma = 0;
		for (ItemCarrito itemC : item) {
			itemC.mostrarItem(item);	
			suma = suma + itemC.dameMontoItem();
		}
	    
		return suma;

	}


		
			}
		
	


