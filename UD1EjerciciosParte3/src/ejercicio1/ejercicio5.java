package ejercicio1;

import java.util.Scanner;

public class ejercicio5{
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe los 2 números enteros: ");
		int numero1;
		int numero2;
		double numero3;
		numero1=sc.nextInt();
		numero2=sc.nextInt();
		numero3=(numero1 + numero2)/2;
		System.out.print("La media aritmetica es de ");
		System.out.print( numero3);
		sc.close();
		
		}

}