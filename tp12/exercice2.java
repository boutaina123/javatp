package tp12;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez l'heure : ");
        int heure = scanner.nextInt();
        System.out.print("Entrez les minutes : ");
        int minutes = scanner.nextInt();

       
        minutes++; 

        if (minutes == 60) {
           
            minutes = 0;
            heure++;
            if (heure == 24) {
               
                heure = 0;
            }
        }

       
        System.out.println("L'heure suivante est : " + heure + " heure(s) " + minutes);

        scanner.close();
    }


	

}
