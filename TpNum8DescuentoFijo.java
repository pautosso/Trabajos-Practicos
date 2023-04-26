package ;

public class DescuentoFijo  extends Descuento{
public double valorFinal (double valorInicial) {
	return valorInicial - this.getValorDesc();
}
}
