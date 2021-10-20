package Tema2;

import java.util.Scanner;

public class ParImpar
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		int num1;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();

		if(num1%2==0){
			System.out.print("Es par");
			
		}
		else {
			System.out.print("Es impar");
		}
	teclado.close();
	}

}
