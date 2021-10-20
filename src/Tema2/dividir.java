package Tema2;

import java.util.Scanner;

public class dividir
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2,resultado;
		float r;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		num2 = teclado.nextInt();
		resultado=suma(num1, num2);
		System.out.println("El resultado de la suma: " + resultado);
		resultado=resta(num1, num2);
		System.out.println("El resultado de la resta es: " + resultado);
		resultado=multiplicacion(num1, num2);
		System.out.println("El resultado de la multiplicacion es: " + resultado);
		r=dividir(num1, num2);
		
	}


	
	public static float dividir(int a, int b) { // devuelve un real por eso floar
		float resultado;
		float cociente;
		resultado=(float)a/b;
	
		if(b!=0) {
			cociente=(float)a/b;
			System.out.println("La Division es: " + cociente);
			
		}
		else {
			System.out.println("La division no es posible");
		}
		return (resultado);
	}
	public static int suma(int num1, int num2) { // devuelve un real por eso floar
		int resultado;
		resultado=num1+num2;
		return (resultado);
		
	}
	public static int resta(int num1, int num2) { // devuelve un real por eso floar
		int resultado;
		resultado=num1-num2;
		return (resultado);
		
	}
	public static int multiplicacion(int num1, int num2) { // devuelve un real por eso floar
		int resultado;
		resultado=num1*num2;
		return (resultado);
		
	}
}
