package ErrorsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez deux entiers: ");

        try {
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
        } catch (ArithmeticException | InputMismatchException ex) {      // que les exceptions du type ArithmeticException5 
            System.out.println(ex.toString());
        }
        System.out.println("Terminé, à bientôt");
    }
}
