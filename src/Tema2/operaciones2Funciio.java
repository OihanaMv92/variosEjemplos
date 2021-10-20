package Tema2;

import java.util.Scanner;

public class operaciones2Funciio
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2,suma,resta,producto;
		float cociente;
		System.out.println("Dame el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo numero: ");
		num2 = teclado.nextInt();
		r=dividir(num1, num2);

	}
	public static float dividir(int num1, int num2) { // devuelve un real por eso floar
		float resultado;
		resultado=(float)num1/num2;
		return (resultado);
		
	}
}
