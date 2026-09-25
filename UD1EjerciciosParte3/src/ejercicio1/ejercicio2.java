package ejercicio1;

import java.util.Scanner;

public class ejercicio2{
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe tu edad");
		int numero;
		numero=sc.nextInt();
		System.out.print("En 2027 tendrás ");
		System.out.print( numero + 1);
		System.out.print(" años");
		sc.close();
		
		}

}