package tp12;

import java.util.Scanner;

public class exercice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez un entier positif supérieur à 1 : ");
        int n = scanner.nextInt();

        
        if (n <= 1) {
            System.out.println("L'entier saisi n'est pas valide.");
        } else {
           
            if (estNombreParfait(n)) {
                System.out.println(n + " est un nombre parfait.");
            } else {
                System.out.println(n + " n'est pas un nombre parfait.");
            }
        }

        scanner.close();
    }

    public static boolean estNombreParfait(int n) {
        int sommeDiviseurs = 0;
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sommeDiviseurs += i; 
            }
        }
        
        return sommeDiviseurs == n;
    }
}
