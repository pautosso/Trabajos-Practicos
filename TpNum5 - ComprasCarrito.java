package tpNumCinco;

public class ComprasCarrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto(101, "Jabon en polvo", "Para ropa color", 40);
		Producto p2 = new Producto(102, "Esponja", "Verde", 10);
		Producto p3 = new Producto(103, "Chocolate", "Bolsa x 500g", 100.1);

		Cliente c1 = new Cliente (101, "Tosso Paula", 40920075, "Lamadrid 2000");	
		Cliente c2 = new Cliente (102, "Gonzalez Patricia", 30920075, "Barcel 3000");	
		Cliente c3 = new Cliente (103, "Rodriguez Florencia", 42920075, "La Rioja 2000");
	
			
		Carrito carro1= new Carrito(40, c1);
		
		ItemCarrito item[]= new ItemCarrito [3];
	
		item[0] = new ItemCarrito(carro1, p1, 1);
		item[1] = new ItemCarrito(carro1, p2, 3);
		item[2] = new ItemCarrito(carro1, p3, 2);
			
		item[0].dameTitulo();
		double monto =mostrarCompras(item,carro1,c1);
		carro1.mostrarMontoCarrito(monto);
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
		
	


