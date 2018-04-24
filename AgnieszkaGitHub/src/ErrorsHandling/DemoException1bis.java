
package ErrorsHandling;

import java.util.Scanner;

public class DemoException1bis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez deux entiers: ");

        try {
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
        } catch (Exception ex) {      // Exception ou Throwable gère toutes les exceptions
            System.out.println(ex.toString());
        }
        System.out.println("Terminé, à bientôt");
    }
}
