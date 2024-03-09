package TP;

import java.util.Scanner;

public class exercice5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        long resultat = calculerFactorielle(nombre);

        System.out.println("La factorielle de " + nombre + " est : " + resultat);

        scanner.close();


	}


public static long calculerFactorielle(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
}