/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage.vehicule;

import Heritage.vehicule.Auto;

/**
 *
 * @author 2501agpestel
 */
public class DemoVehicule {

    public static void main(String[] args) {
        Vehicule v = new Velo();
        v.name = "velo";
        playWith(v);
        
        System.out.println("\n\n");
        
        Vehicule[] vlist = new Vehicule[] {
            new Auto(),
            new Velo(),
            new Velo()
        };
        vlist[0].name = "Citron c3";
        vlist[1].name = "Eddy";
        vlist[2].name = "Deca";
        for (Vehicule vehicule : vlist) {
            playWith(vehicule);
        }
        
    }
    
    public static void playWith(Vehicule v1) {
        v1.star();

        if (v1 instanceof Auto) {
            Auto a1 = (Auto) v1;
            a1.faireLePlain(40);
            //((Auto) v1).faireLePlain(40);
        } else if(v1 instanceof Velo) {
            Velo v = (Velo) v1;
            v.changeVitesse(2);
        }

        v1.stop();   
    }

}