package TpNum5;

public class DescuentoFijo  extends Descuento{
public double valorFinal (double valorInicial) {
	return valorInicial - this.getValorDesc();
}
}
