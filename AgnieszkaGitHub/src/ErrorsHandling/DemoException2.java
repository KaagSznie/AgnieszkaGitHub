package ErrorsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueInput = true;

        while (continueInput) {
            try {
                System.out.print("Entrez deux entiers: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
                continueInput = false;
                
            } catch (ArithmeticException | InputMismatchException ex) {
                input.nextLine();                   //Discard input
                System.out.println(ex.toString()); 
            }
            
        }
        System.out.println("Terminé, à bientôt");
    }

}
