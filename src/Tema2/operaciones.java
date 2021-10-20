package Tema2;

import java.util.Scanner;

public class operaciones
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
		suma=num1+num2;
		System.out.println("La suma es: " + suma);
		resta=num1-num2;
		System.out.println("La resta es: " + resta);
		producto=num1*num2;
		System.out.println("La multiplicacion es: " + producto);
		
		if(num2!=0) {
			cociente=(float)num1/num2;
			System.out.println("La Division es: " + cociente);
			
		}
		else {
			System.out.println("La division no es posible");
		}

	}

}
