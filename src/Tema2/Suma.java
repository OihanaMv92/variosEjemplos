package Tema2;

import java.util.Scanner;

public class Suma
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		int suma=0;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Ingrese otro numero entero ");
		num2 = teclado.nextInt();
		suma=num1+num2;
		System.out.print("La suma de los numeros es " + suma);
		teclado.close();
	}

}
