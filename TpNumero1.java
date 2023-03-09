package tpnumero2;

public class TpNumero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int variableInicio=5, variableFinal=14;
		
		while (variableInicio <= variableFinal) {
			if (variableInicio %2 == 0) {
				System.out.print(variableInicio+ "-");
			}
			variableInicio++;
		}


int variableInicio=3, variableFinal=12;
		boolean imprimirPares = false;
		
		while (variableInicio <= variableFinal) {
			if (imprimirPares == true) {
				if (variableInicio %2 == 0) {
					System.out.print(variableInicio+ "-");
				}
			}else {
				if (variableInicio %2 != 0) {
					System.out.print(variableInicio+ "-");
				}
			}
			variableInicio++;
		}

int variableInicio=14, variableFinal=5;
		
		for(int i=variableInicio; i>=variableFinal; i--) {
			if (i%2==0) {
				System.out.print(i+"  ");
			}			
		}
	}

}
