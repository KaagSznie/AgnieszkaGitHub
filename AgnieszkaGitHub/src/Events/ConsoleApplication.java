/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import java.util.Scanner;

/**
 *
 * @author 2501agpestel
 */
public class ConsoleApplication {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer votre commande : 1 ou 2 ou Q");
        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        
        while(next) {
            String cmd = scanner.nextLine();
            switch(cmd) {
                case "1":
                    System.out.println("Action 1 appelée");
                    break;
                case "2":
                    System.out.println("Action 2 appelée");
                    break;
                case "Q":
                    System.out.println("Quitter");
                    next = false;
                    break;
                default:
                    System.err.println("Commande inconnue : " + cmd);
                    System.err.println("Veuillez taper 1 ou 2 ou Q");
            }
        }
    }
}
