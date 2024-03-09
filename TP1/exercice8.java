package TP;

import java.util.Scanner;

public class exercice8 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 	System.out.print("Entrez le premier entier : ");
	        int a = scanner.nextInt();
	        System.out.print("Entrez le deuxième entier : ");
	        int b = scanner.nextInt();

	        
	        System.out.println("Le PGCD de " + a + " et " + b + " est : " + calculerPGCD(a, b));

	        scanner.close();
	    }

	   
	    public static int calculerPGCD(int a, int b) {
	       
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	}

