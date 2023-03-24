package Clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TpNumero4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Punto 1)
		
		boolean orden_asc = false;

		int []vectorA = {800,0,10};

		int num1=0, num2=0,num3=0, aux1=0, aux2=0, mayor=0;

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

		if ((num2 > num3) && (num2 > num1)) {

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

		for (int i=0; i< vecOrdenado.length; i++ ) {

		System.out.print(vecOrdenado[i]+"-");


		}



       //Punto 2)
		

		String ruta = "C:\\Users\\Admin\\Desktop\\Mi primer archivo.txt";

		sumarArchivo(ruta);

}

	private static void sumarArchivo(String ruta) {

		try {

		for(String archivo : Files.readAllLines(Paths.get(ruta))) {
		System.out.println(archivo);
	}

		int sumaValores= sumaValores("C:\\Users\\Admin\\Desktop\\Mi primer archivo.txt");

		System.out.println("La suma es: "+ sumaValores);
		} catch (IOException e) {
	// TODO Auto-generated catch block

		System.out.println("El archivo no exixte");;
}

}

	public static int sumaValores(String datosArchivo) throws FileNotFoundException {
		File archivo = new File("C:\\Users\\Admin\\Desktop\\Mi primer archivo.txt");
		int sumaInt=0;
		Scanner sumaNumeros = new Scanner(archivo);

		while (sumaNumeros.hasNextInt()) { 
        sumaInt = sumaInt + sumaNumeros.nextInt();
}
 

		return sumaInt;
		
		
		//Punto 3)
		
		
		String ruta = "C:\\Users\\Admin\\Desktop\\Mi primer archivo.txt";

		try {

		for(String archivo : Files.readAllLines(Paths.get(ruta))) {

		System.out.println(archivo);

		}

		} catch (IOException e) {

		// TODO Auto-generated catch block

		System.out.println("El archivo no existe");

}
	}
}
