package Tema2;

import java.util.Scanner;

public class BinarioDecimal
{

	public static void main(String[] args)
	{

			Scanner teclado = new Scanner(System.in);
			int a, b, c, d, e,f,g,h;
			System.out.println("Indicar el valor de la primera cifra del número binario:");
			e= teclado.nextInt();
			System.out.println("Indicar el valor de la segunda cifra del número binario:");
			d= teclado.nextInt();
			System.out.println("Indicar el valor de la tercera cifra del número binario:");
			c= teclado.nextInt();
			System.out.println("Indicar el valor de la cuarta cifra del numero binario:");
			b= teclado.nextInt();
			System.out.println("Indicar el valor de la quinta cifra del número binario:");
			a= teclado.nextInt();
			System.out.println("Indicar el valor de la quinta cifra del número binario:");
			f= teclado.nextInt();
			System.out.println("Indicar el valor de la quinta cifra del número binario:");
			g= teclado.nextInt();
			System.out.println("Indicar el valor de la quinta cifra del número binario:");
			h= teclado.nextInt();
			System.out.println("El numero decimal equivalente es:"+Conversion(h,g,f,e, d, c, b, a));
			teclado.close();
		}
		public static int Conversion(int h, int g,int f,int e, int d, int c, int b, int a)
		{
			int resultado=0;
			resultado=(h*128)+(g*64)+(f*32)+(e*16)+(d*8)+(c*4)+(b*2)+(a*1);
			return (resultado);
		}
	}