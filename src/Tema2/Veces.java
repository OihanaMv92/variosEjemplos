package Tema2;

import java.util.Scanner;

public class Veces
{
	public static void main(String[] args)

	{
		Scanner teclado = new Scanner(System.in);
		int num1,veces;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		veces = teclado.nextInt();
		for(int i=1;i<=num1;i++) {
			System.out.println(num1);
		}
	}


}
