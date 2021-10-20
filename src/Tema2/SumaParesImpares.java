package Tema2;

import java.util.Scanner;

public class SumaParesImpares
{

	public static void main(String[] args)
	{

		int num1,num2;
		int suma=0;
		int producto=1;

		for(int i=1;i<=40;i++)
			if(i%2==0){ // pares 
				// if(i%2!=0) Impares
				suma=suma+i;
			}
				else {
					producto=producto*i;
				}

		System.out.println("La suma de los pares es: " + suma);
		System.out.println("La suma de los pares es: " + producto);


	}

}


