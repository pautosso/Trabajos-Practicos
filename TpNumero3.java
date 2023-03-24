package Clases;

public class TpNumero3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Punto 1-a)
		String palabra="Apapachar";
				
				int contador=0,posicion=0;
				
				char caracter = 'p';
				String palabra_min = palabra.toLowerCase();
				
				posicion = palabra_min.indexOf(caracter); 
				System.out.print("Posicion: "+posicion+" ");
				
				if (posicion != -1) {
				while (posicion != -1 ) {//indice toma el valor de -1 cuando se termina la cadena de caracteres
					contador++;
					posicion = palabra.indexOf(caracter,posicion+1);
					System.out.print("Posicion: "+posicion+" ");
					
				}
				System.out.println("El caracter \""+caracter+"\" aparece "+ contador+ " veces" );
				}else System.out.println("el caracter no exite en el String");
		}


		//Punto 1- b)

		boolean orden_asc = false;
		int []vectorA = {800,0,10};
		int num1=0, num2=0,num3=0, aux1=0, aux2=0, mayor=0;{
			num1 = vectorA[0];
			num2 = vectorA[1];
			num3 = vectorA[2];
			System.out.println(num1+" " + num2+" " + num3);
			
			if ((num1 > num2) && (num1 > num3)) {
					mayor=num1;	
					if (num2 > num3) {
						aux1=num2;
						aux2=num3;
					}else {
						aux1=num3;
						aux2=num2;
					}
			} 
			else{
				if ((num2 > num3) && (num2 > num1))  {
					mayor=num2;	
					if (num1 > num3) {
						aux1=num1;
						aux2=num3;
					}else {
						aux1=num3;
						aux2=num1;
					}
					
				}else {
					mayor=num3;
					if (num2 > num1) {
						aux1=num2;
						aux2=num1;
					}else {
						aux1=num1;
						aux2=num2;
					}
					
			     }
			}	

		System.out.println("El mayor es: "+mayor);
		int vecOrdenado [] = new int[3];
		if (orden_asc) {
		vecOrdenado[0]=mayor;
		vecOrdenado[1]=aux1;
		vecOrdenado[2]=aux2;
		}else {
		vecOrdenado[0]=aux2;
		vecOrdenado[1]=aux1;
		vecOrdenado[2]=mayor;
		}
		}
		

		//Punto 2
	
 
		String frase = "Yo;tengo; un; elefante que se; llama trompita ... ";


		String fraseSplit[] = frase.split(";");{


		for (String elemento : fraseSplit) { // for each for mejorado


			System.out.println(elemento);
}
}
}


