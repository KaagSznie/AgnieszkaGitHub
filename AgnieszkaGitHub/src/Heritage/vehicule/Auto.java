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
public class Auto extends Vehicule {
    double puissance;
    boolean diesel = false;
    
    public double getCO2Emission() {
        return 10;
    }
    
    public void faireLePlain(double quantite) {
        System.out.println("La voiture " + name + " fait le plein de " + quantite + " littres");
    }
}
