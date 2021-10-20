package Tema2;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int exp,base,r=1,i;
		System.out.println("Dame un numero entero ");
		exp = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		base = teclado.nextInt();
		for(i=1;i<=exp;i++) {
			r=r*base;
		}
		System.out.println("El numero " +base+ " Elevado a " +exp+ " es " +r);
		teclado.close();
	}
	

}
