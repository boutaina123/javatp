package TP;

import java.util.Scanner;

public class exercice7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez le coefficient a : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le coefficient b : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez le coefficient c : ");
        double c = scanner.nextDouble();

        
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
           
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("L'équation a deux solutions réelles distinctes :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
           
            double x = -b / (2 * a);
            System.out.println("L'équation a une seule solution réelle :");
            System.out.println("x = " + x);
        } else {
          
            System.out.println("L'équation n'a pas de solution réelle.");
        }

        scanner.close();
    }
}
