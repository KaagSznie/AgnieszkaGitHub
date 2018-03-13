
package Encapsulation;

public class DemoIntoxication {
    public static void main(String[] args) {
        Intoxication gastro = new Intoxication();
        gastro.setNom ("Gastro-enérite");
        gastro.setDescription("hum, pas joli");
        gastro.setPopulation(10_000L);
        
        gastro.addCriteres("premier critère", "deuxième critère");
    }
}
