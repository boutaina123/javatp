package TP;

import java.util.Scanner;

public class exercice4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de x : ");
        double x = scanner.nextDouble();

        System.out.print("Entrez la valeur de n : ");
        int n = scanner.nextInt();

        double resultat = calculerPuissance(x, n);

        System.out.println(x + " à la puissance " + n + " = " + resultat);

        scanner.close();
    }

    public static double calculerPuissance(double x, int n) {
        double resultat = 1.0;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                resultat *= x;
            }
        } else {
            for (int i = 0; i > n; i--) {
                resultat /= x;
            }
        }
        return resultat;


	}

}
