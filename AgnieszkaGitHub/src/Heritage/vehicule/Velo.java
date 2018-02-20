/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage.vehicule;

import Heritage.vehicule.Vehicule;

/**
 *
 * @author 2501agpestel
 */
public class Velo extends Vehicule {
    int nrVitesse = 5;
    int vitesseCourante = 1;
    
    public void changeVitesse(int vitesse) {
        if(vitesse <= nrVitesse) {
            System.out.println("Velo " + name + " a changé de la vitesse " + vitesseCourante + " à " + vitesse);
            vitesseCourante = vitesse;
        }
    }
}
