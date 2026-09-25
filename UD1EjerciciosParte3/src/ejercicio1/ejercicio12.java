package ejercicio1;

import java.util.Scanner;

public class ejercicio12{
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe las cantidad de manzanas y peras en kilos ");
		int manzanas;
		int peras;
		double kilosM;
		double kilosP;
		double total;
		manzanas=sc.nextInt();
		peras=sc.nextInt();
		kilosM=(manzanas * 2.35);
		kilosP=(peras * 1.95);
		total=(kilosM + kilosP);
		System.out.print("El importe total es de  ");
		System.out.print( total);
		System.out.print(" euros");
		sc.close();
		
		}

}