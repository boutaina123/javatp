package TP;

import java.util.Scanner;

public class exercice1 {
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("entrez le premier entier:");
		int entier1=scanner.nextInt();
		System.out.print("entrez le deuxieme entier:");
		int entier2=scanner.nextInt();
		int somme=entier1 + entier2;
		int difference=entier1 - entier2;
		int produit=entier1 * entier2;
		double quotient;
		if (entier2!=0) {
			quotient = (double)entier1/entier2;
		}else {
			quotient=Double.POSITIVE_INFINITY;
		}
		System.out.println("La somme est:"+ somme);
		System.out.println("La difference est:"+ difference);
		System.out.println("Le produit est:"+ produit);
		System.out.println("Le quotient est:"+ quotient);
		scanner.close();
		
	}

}

