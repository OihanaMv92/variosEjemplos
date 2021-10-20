package Tema2;

import java.util.Scanner;

public class TablaMultiplicar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println("La tabla de multiplicar del "+ num1+ " es: " +num1*i);
		}

	}

}
