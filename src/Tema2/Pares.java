package Tema2;

import java.util.Scanner;

public class Pares
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		num2 = teclado.nextInt();
		for(int i=num1;i<=num2;i++)
			if(i%2==0){ // pares 
				// if(i%2!=0) Impares
				System.out.println("Los numeros pares entre "+num1+" y "+num2 +" es: " +i);
		
			
			}

	teclado.close();

	}

}
