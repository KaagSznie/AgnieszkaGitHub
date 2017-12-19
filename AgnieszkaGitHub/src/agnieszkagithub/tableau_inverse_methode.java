package agnieszkagithub;

public class tableau_inverse_methode {

    public static int[] reverse(int[] source) {
        int[] resultat = new int[10];
        for (int i = 0; i < source.length; i++) {
            resultat[i] = source[(source.length) - i - 1];
        }
        return resultat;
    }

    public static void main(String[] args) {
        int[] testsource = new int[10];
        for (int i = 0; i < testsource.length; i++) {
            testsource[i] = (int) (Math.random() * 10);
        }
        System.out.println("Tableau original : ");
        for (int i : testsource) {
            System.out.print(i);
        }

        int[] inverse = reverse(testsource);
        System.out.println("\nTableau inversé : ");
        for (int i : inverse) {
            System.out.print(i);
        }
    }
}
