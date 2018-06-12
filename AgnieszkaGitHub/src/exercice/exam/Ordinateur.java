
package exercice.exam;

class Ordinateur {
    private double puissance;
    private int version;

    public double getPuissance() {
        return puissance;
    }

    public int getVersion() {
        return version;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return  puissance + ", " + version;
    }

    public Ordinateur(double puissance, int version) {
        this.puissance = puissance;
        this.version = version;
    }
   
    
}
