package agnieszkagithub;

import java.util.Arrays;

public class tableau_2_dimensions {

    public static void main(String[] args) {
        int[][] tableau2Dim = new int[3][10];
        tableau2Dim[0][0] = 0;
        tableau2Dim[0][1] = 1;
        tableau2Dim[0][2] = 2;

        tableau2Dim[1][0] = 10;
        tableau2Dim[1][1] = 11;
        tableau2Dim[1][2] = 12;

        /*
        int[] premiereLigne = tableau2Dim[0];
        System.out.println(Arrays.toString(premiereLigne));
         */
        System.out.println(Arrays.toString(tableau2Dim[0]));
        System.out.println(Arrays.toString(tableau2Dim[1]));

        int[] troisiemeLigne = tableau2Dim[2];
        Arrays.fill(troisiemeLigne, -1);
        System.out.println(Arrays.toString(troisiemeLigne));

        System.out.println(tableau2Dim.length);
        System.out.println(tableau2Dim[0].length);
        System.out.println(tableau2Dim.length * tableau2Dim[0].length);

        for (int i = 0; i < tableau2Dim.length; i++) {
            for (int j = 0; j < tableau2Dim[i].length; j++) {
                tableau2Dim[i][j] = 5;
            }
        }

        for (int i = 0; i < tableau2Dim.length; i++) {
            for (int j = 0; j < tableau2Dim[i].length; j++) {
                System.out.println(i + "," + j + " => " + tableau2Dim[i][j]);
            }
        }
        
        for (int i = 0; i < tableau2Dim.length; i++) {
            for (int j = 0; j < tableau2Dim[i].length; j++) {
                System.out.printf("%4d", tableau2Dim[i][j]);
            }
            System.out.println("");
        }
    }
}
