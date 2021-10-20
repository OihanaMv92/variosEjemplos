package Tema2;

import java.util.Scanner;

public class operaciones4
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3,resultado;
		float r;
	
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		num2 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		num3 = teclado.nextInt();
		resultado=suma(num1, num2,num3);
		System.out.println("El resultado de la suma: " + resultado);
		r=media(num1, num2, num3);
		System.out.println("El resultado de la multiplicacion es: " + resultado);
		resultado=multiplicacion(num1, num2,num3);
		
	}
	public static int suma(int num1, int num2, int num3) { // devuelve un real por eso floar

		return (num1+num2+num3);
		
	}
	public static int multiplicacion(int num1, int num2, int num3) { // devuelve un real por eso floar
		int multiplicacion;
		multiplicacion=(num1*num2*num3);
		return (multiplicacion);
		
	}
	public static float media(int num1, int num2, int num3) { // devuelve un real por eso floar
		float media;
		media=suma(num1,num2,num3)/3;
		return (media);
		
	}

}

