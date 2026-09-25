package ejercicio1;

import java.util.Scanner;

public class ejercicio15{
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe las notas redondeadas del primer, segundo y tercer trimestre ");
		int primero;
		int segundo;
		int tercero;
		int media;
		double expediente;
		primero=sc.nextInt();
		segundo=sc.nextInt();
		tercero=sc.nextInt();
		media=((primero + segundo + tercero)/3);
		expediente=((primero + segundo + tercero)/3);
		System.out.print("La nota del curso en el boletin de calificaciones es de ");
		System.out.print(media);
		System.out.print(" ,mientras que en el expediente academico es de ");
		System.out.print(expediente);
		sc.close();
		
		}

}