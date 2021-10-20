package Tema2;

import java.util.Scanner;

public class Compara
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2;

		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		num2 = teclado.nextInt();
		if(num1==num2) {
			System.out.println("Son iguales");
		}
		else if(num1<num2)
		{
			System.out.println("El numero " + num1 + " es menor que el "+num2);
			
		}

		else if (num1>num2) {
			System.out.println("El numero " + num1 + " es mayor que el "+num2);
		}
		teclado.close();
	}

}

