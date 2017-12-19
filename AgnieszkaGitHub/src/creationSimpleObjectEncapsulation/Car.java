package creationSimpleObjectEncapsulation;

/**
 *
 * @author 2501agpestel
 */
public class Car {

    private String licencePlate;
    private int year;
    private String color;
    private double km;
    private String model;

    public void setYear(int value) {
        if (value > 1900 && value < 2100) {
            System.out.println("Car change year " + year + " => " + value);
            year = value;
        }
    }

    public String getlicencePlate() {
        return licencePlate;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getKm() {
        return km;
    }

    public String getModel() {
        return model;
    }

    public void setlicencePlate(String licencePlate) {
        
        licencePlate = licencePlate.toUpperCase();

        /* if (licencePlate.length() != 7) {
            return;
        }
           if(licencePlate.charAt(0) >= 'A' && licencePlate.charAt(0) <= 'Z' &&
           licencePlate.charAt(1) >= 'A' && licencePlate.charAt(1) <= 'Z' &&
           licencePlate.charAt(2) >= 'A' && licencePlate.charAt(2) <= 'Z' &&
           licencePlate.charAt(3) == '-' &&
           Character.isDigit(licencePlate.charAt(4)) &&
           Character.isDigit(licencePlate.charAt(5)) &&
           Character.isDigit(licencePlate.charAt(6))) {
            this.licencePlate = licencePlate;
        } else {
            System.err.println("Bad licence plate");
        }*/
        if (licencePlate.matches("[A-Z]{3}-[0-9]{3}")) {
            this.licencePlate = licencePlate;
        } else {
            System.err.println("Bad licence plate");
        }
    }

public void setColor(String color) {
        if(color.equals("white") || color.equals("yellow")) {
            this.color = color;
        } else {
            System.err.println("Bad color");
        }
    }

    public void setKm(double km) {
        if (km >= 0 && km <1000000) {
            this.km = km;
        }
    }

    public void setModel(String model) {
        if(model.equals("Maserati") || model.equals("Porche")) {
            this.model = model;
        } else {
            System.err.println("Bad model");
        }
    }
    
    

    String getDescription() {
        return "La voiture est :\n" + "\tmodèle : " + model + "\n" + "\tannée : " + year + "\n" + "\tcouleur : " + color;
    }

}
