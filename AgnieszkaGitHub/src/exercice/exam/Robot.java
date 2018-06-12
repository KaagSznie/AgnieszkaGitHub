
package exercice.exam;

public class Robot extends Ordinateur implements Deplacement{
    private String model;
    private String name;
    private String description;

    public Robot(double puissance, int version, String model, String name, String description) {
        super(puissance, version);
        this.model = model;
        this.name = name;
        this.description = description;
    }
    

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    @Override
    public void avance(double distance) {
        System.out.println("Le robot avance de " + distance);
    }

    @Override
    public void tourne(double angle) {
        System.out.println("Le robot tourne de " + angle);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + model + ", " + name + ", " + description;
    }


    
}
