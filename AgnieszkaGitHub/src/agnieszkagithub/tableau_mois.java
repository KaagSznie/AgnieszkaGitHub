
package agnieszkagithub;

import java.util.Scanner;

public class tableau_mois {
    public static void main(String[] args) {
        String[] mois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez introduire le numéro du mois : ");
        int index = scanner.nextInt();
        while(index > 0 && index < 13) {
        System.out.println(index + " : " + mois[(index-1)]);
        System.out.print("Veuillez introduire le numéro du mois : ");
        index = scanner.nextInt();
        }
        System.out.println("Vous avez saisi un mauvais numéro : " + index);
        
        /*
        if(numero > 0 && numero < 13) {
        System.out.println(numero + " : " + mois[(numero-1)]);
        }
        else {
        System.out.println("Mauvais numéro !");
        }
        */
        /*
        for (int i=0; i<mois.length; i++ ) {
            System.out.println(i+1 + " : " + mois[i]);
        }
        */
    }
}
