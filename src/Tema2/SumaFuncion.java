package Tema2;

import java.util.Scanner;

public class SumaFuncion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2,r;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		num2 = teclado.nextInt();
		r=suma(num1,num2);
		System.out.println("El resultado de la suma es: " +r);

	}
	public static int suma(int num1, int num2) { // devuelve un real por eso floar
		int resultado;
		resultado=num1+num2;
		return (resultado);
		
	}

}
