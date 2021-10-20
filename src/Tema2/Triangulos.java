package Tema2;

import java.util.Scanner;

public class Triangulos
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		float lado1,lado2,lado3;

		System.out.println("Dame un numero entero ");
		lado1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		lado2 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		lado3 = teclado.nextInt();
		if(lado1==lado2&&lado2==lado1) {
			System.out.println("El triangulo es equilatero ");

		}
		
		else if((lado1==lado2)&&(lado2!=lado3)||(lado1!=lado2)&&(lado2==lado3)||(lado1==lado3) // si lado 1 y lado 2 son iguales y lado 2 es desigual a lado 3 ||(Significa o) 
				//o lado 1 diferente lado 2 y lado 2 igual lado 3 o lado 1 igual lado 3 entonces. 
				&&(lado2!=lado3))
		{
			System.out.println("El triángulo es Isósceles");
		}
		else if ((lado1!=lado2)&&(lado2!=lado3)&&(lado1!=lado3)) {
			System.out.println("El triángulo es Escaleno");
		}

	}

}


