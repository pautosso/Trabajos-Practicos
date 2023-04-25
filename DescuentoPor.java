package TpNum5;

public class DescuentoPor extends Descuento{
	public double valorFinal (double valorInicial) {
		return valorInicial - (valorInicial * this.getValorDesc());
}
}
