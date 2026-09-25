package ejercicio1;

import java.util.Scanner;

public class ejercicio10{
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe tu edad: ");
		Integer age;
		age=sc.nextInt();
		System.out.println("La edad es "+age);
		Boolean b=age >=18;

		System.out.print("¿Eres mayor de edad? ---> " +b);
		sc.close();
		
		}

}