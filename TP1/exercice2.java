package TP;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
         System.out.print("Entrez le rayon du cercle : ");
         double rayon = scanner.nextDouble();
         double surface = Math.PI * rayon * rayon;
         double perimetre = 2 * Math.PI * rayon;
         System.out.println("La surface du cercle est : " + surface);
         System.out.println("Le périmètre du cercle est : " + perimetre);
         scanner.close();
    }
}


