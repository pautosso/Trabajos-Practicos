package TpNum5;

public abstract class Descuento {

 double valor;
	
	//getter
	public double getValorDesc () {
		return valor;
		
	}
	//setter
	public void setValorDesc ( double valor) {
		this.valor = valor;
	}
	//metodo abstracto (va sin {})
	public abstract double  valorFinal (double valorInicial);
	
	}
	

