package ejercicio1;

import java.util.Scanner;

public class ejercicio6{
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe los 2 números enteros: ");
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		double numero6;
		numero1=sc.nextInt();
		numero2=sc.nextInt();
		numero3=(numero1 + numero2);
		numero4=(numero1 - numero2);
		numero5=(numero1 * numero2);
		numero6=(numero1/numero2);
		System.out.print("La suma de ");
		System.out.print( numero1);
		System.out.print( " y ");
		System.out.print( numero2);
		System.out.print( " es ");
		System.out.println( numero3);
		sc.close();
		System.out.print("La resta de ");
		System.out.print( numero1);
		System.out.print( " y ");
		System.out.print( numero2);
		System.out.print( " es ");
		System.out.println( numero4);
		sc.close();
		System.out.print("La multiplicación de ");
		System.out.print( numero1);
		System.out.print( " y ");
		System.out.print( numero2);
		System.out.print( " es ");
		System.out.println( numero5);
		sc.close();
		System.out.print("La división de ");
		System.out.print( numero1);
		System.out.print( " y ");
		System.out.print( numero2);
		System.out.print( " es ");
		System.out.println( numero6);
		sc.close();
		
		}

}