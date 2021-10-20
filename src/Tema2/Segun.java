package Tema2;

import java.util.Scanner;

public class Segun
{	
	public static void main(String[] args)

	{
		Scanner teclado = new Scanner(System.in);
		int a,b,suma,multiplicacion;
		System.out.println("Dame un numero entero ");
		a = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		b = teclado.nextInt();
		if(a<b) {
			suma=a+b;
			System.out.println("El resultado de la suma es " + suma);
		}
		else if(a>=b){
			multiplicacion=a*b;
			System.out.println("El resultado de la multiplicacion es " + multiplicacion);

		}



	}
}
