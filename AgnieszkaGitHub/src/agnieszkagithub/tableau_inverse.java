
package agnieszkagithub;

public class tableau_inverse {
    public static void main(String[] args) {
        int[] source = new int[10];
        for (int i = 0; i < source.length; i++) {
            source[i] = (int) (Math.random() * 10);
        }
        System.out.println("Tableau original : ");
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }
        
        int[] resultat = new int[10];
        for (int i = 0; i < source.length; i++) {
            resultat[i] = source[(source.length) -i -1];
        }
        System.out.println("\nTableau inversé : ");
        for (int i = 0; i < resultat.length; i++) {
            System.out.print(resultat[i] + " ");
        }
    }
}
