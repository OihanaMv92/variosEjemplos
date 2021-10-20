package Tema2;

import java.util.Scanner;

public class Intercambio
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2,intercambia;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		num2 = teclado.nextInt();
		System.out.println("Valores iniciales: numero 1 = " + num1 + "   numero2 = " + num2); 
		intercambia=num1;
		num1=num2;
		num2=intercambia;
		System.out.println("Valores intercambiados: numero 1 = " + num1 + "   numero 2 = " + num2); 
			
		

	}

}
