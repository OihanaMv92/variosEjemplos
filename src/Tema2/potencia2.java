package Tema2;

import java.util.Scanner;

public class potencia2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2,r;
		System.out.println("Dame un numero entero ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro exponente entero ");
		num2 = teclado.nextInt();
		r=potencia(num1,num2);
		System.out.println("El resultado de la potencia es: " +r);

	}
	public static int potencia(int base, int exp) { // devuelve un real por eso floar
		int resultado=1;
		for(int i=1;i<=exp;i++) {
			resultado=resultado*base;
			
			
		}
	
		return (resultado);
	}

}


