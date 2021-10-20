package Tema2;

import java.util.Scanner;

public class Ordenar3Numeros
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Dame el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("Dame el tercer numero: ");
		num3 = teclado.nextInt();
		if(num1>num2 && num2 >num3) {
			System.out.println("Los numeros ordenador de mayor a menor son: " +num1+","+num2+","+num3);
		}
			else if(num1>num3 && num3>num2) {
				System.out.println("Los numeros ordenador de mayor a menor son: " +num1+","+num3+","+num2);
			}
			else if(num2>num1 && num1>num3) {
				System.out.println("Los numeros ordenador de mayor a menor son: " +num2+","+num1+","+num3);
			}
			else if(num2>num3 && num3>num1) {
				System.out.println("Los numeros ordenador de mayor a menor son: " +num2+","+num3+","+num1);
			}
			else if(num3>num1 && num1>num2) {
				System.out.println("Los numeros ordenador de mayor a menor son: " +num3+","+num1+","+num2);
			}
			else {
				System.out.println("Los numeros ordenador de mayor a menor son: " +num3+","+num2+","+num1);
			}
teclado.close();		
		}



	}


