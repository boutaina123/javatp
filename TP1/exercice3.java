package TP;

import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la valeur de b : ");
        int b = scanner.nextInt();

        System.out.println("Avant permutation :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Après permutation :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }

}


