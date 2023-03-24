package ProyectoIntegradorCalculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		boolean repetir=true;
		while (repetir) {
			repetir = Menu(repetir);
		}
	}

	public static boolean Menu(boolean seguir) {
		// TODO Auto-generated method stub
		
		int a=0, b=0;
		double resultado= 0;
		String selecion= null;
		
		Scanner tec= new Scanner (System.in);
        System.out.println("MENU : Selecciona la opcion");
        System.out.println("+: Suma"
        		+ "\n-: Resta"
        		+ "\n*: Multiplicacion"
        		+ "\n/: Division");
        selecion= tec.next();
        
        switch (selecion){
        
        //suma
        case "+":
        	System.out.println("Ha seleccionado suma\n");
        	System.out.println("Ingrese el primer numero");
        	a= tec.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= tec.nextInt();
        	resultado=a+b;
        	System.out.println(a+"+"+b+"="+resultado);
        	break;
        	
        //resta
        case "-":
        	System.out.println("Ha seleccionado resta\n");
        	System.out.println("Ingrese el primer numero");
        	a= tec.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= tec.nextInt();
        	resultado=a-b;
        	System.out.println(a+"-"+b+"="+resultado);
        	break;
        	
        	//multiplicacion
        case "*":
        	System.out.println("Ha seleccionado multiplicacion\n");
        	System.out.println("Ingrese el primer numero");
        	a= tec.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= tec.nextInt();
        	resultado=a*b;
        	System.out.println(a+"*"+b+"="+resultado);
        	break;
        	
        	//division
        case "/":
        	System.out.println("Ha seleccionado division\n");
        	System.out.println("Ingrese el primer numero");
        	a= tec.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= tec.nextInt();
        	resultado=a/b;
        	System.out.println(a+"/"+b+"="+resultado);
        	break;
        	
        
        
        default:
        		System.out.println("Esta opcion no existe");
        }
    	return seguir;
	}
        		
        		public static double suma(double num1, double num2) {
        			return num1+num2;
        		}
        		
        		public static double resta(double num1, double num2) {
        			return num1-num2;
        		}
        		
        		public static double mult(double num1, double num2) {
        			return num1*num2;
        		}
        		
        		public static double div(double num1, double num2) {
        			return num1/num2;
        		}
        		}

