package agnieszkagithub;

import java.util.Arrays;

public class tableau_copy_tri_recherche {

    public static void main(String[] args) {
        double[] ds = {1.7, 100.8, 11321};
        double[] idem = ds; // ! copie les références

        idem[0] = -99999;
        System.out.println(Arrays.toString(ds)); // affiche [-99999.0, 100.8, 11321.0]

        double copie[] = new double[ds.length];
        System.arraycopy(ds, 0, copie, 0, ds.length);
        System.out.println(Arrays.toString(copie));

        double[] copie2 = Arrays.copyOf(ds, ds.length);
        System.out.println(Arrays.toString(copie2));
        
        //trier le tableau
        String[] tableauDeString = {"index 0", "élément 1", "texte 2", "a 3", " espace 4"};
        //Arrays.sort(tableauDeString);
        //System.out.print(Arrays.toString(tableauDeString));
        
        //recherche binaire
        int indexDeA3 = Arrays.binarySearch(tableauDeString, "a 3");
        System.out.println("Index de 'a 3' est " + indexDeA3);
    }
}
