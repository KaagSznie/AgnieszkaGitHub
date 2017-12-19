
import java.util.Scanner;

public class DessinUneDimension {

    // A ajouter
    // I imprimer
    // Q quitter
    public static void main(String[] args) {
        char choix;
        char[] tableau = new char[80];

        do {
            AfficheMenu();
            Scanner scanner = new Scanner(System.in);   
            choix = scanner.next().charAt(0);
            switch (choix) {
                case 'A':
                    DesssineTableau(scanner, tableau);
                    break;
                case 'I':
                    AfficheTableau(tableau);
                    break;
                default:
                    System.out.println("Vous avez choisi un mauvais code");
                    System.out.println("Veuillez préciser le charactère : ");
                    System.out.println("Veuillez préciser la position : ");
                    System.out.println("Veuillez préciser la longeur : ");
                    choix = scanner.next().charAt(0);
            }
        } while (choix != 'Q');
    }

    private static void AfficheMenu() {
        System.out.println("Veuillez taper A pour ajouter");
        System.out.println("Veuillez taper I pour imprimer");
        System.out.println("Veuillez taper Q pour quitter");
    }

    private static void AfficheTableau(char[] tableau) {
        System.out.println("Votre tableau : ");
        System.out.println(tableau);
    }

    private static void DesssineTableau(Scanner scanner, char[] tableau) {
        char caractere;
        int position;
        int longeur;
        System.out.print("Veuillez préciser le charactère : ");
        caractere = scanner.next().charAt(0);
        System.out.print("Veuillez préciser la position : ");
        position = scanner.nextInt();
        System.out.print("Veuillez préciser la longeur : ");
        longeur = scanner.nextInt();
        
        for (int i = position; i < position + longeur; i++) {
            tableau[i] = caractere;
        }
    }
}
