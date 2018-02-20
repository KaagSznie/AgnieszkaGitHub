/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage.vehicule;

/**
 *
 * @author 2501agpestel
 */
public class Vehicule {
    double weight;
    double lengh;
    double width;
    double height;
    double maxRate;
    String name;
    
    void star() {
        System.out.println("Le véhicule " + name + " a démarré");
    }
    
    void stop() {
        System.out.println("Le véhicule " + name + " s'est arrêté");
    }
    
    
}
