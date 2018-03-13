package Encapsulation;

public class Intoxication {

    private String nom;
    private char[] description;     //juste pour la démonstration
    private String[] criteres = new String[0];
    private long population;

    public String getDescription() {
        return String.copyValueOf(description);
    }

    public void setDescription(String description) {
        this.description = description.toCharArray();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom.length() > 3) {
            System.out.println("setNom\n" + "\told: " + this.nom + "\n" + "\tnew: " + nom);
            this.nom = nom;
        } else {
            System.err.println("setNom error: \n" + "\t");
        }

    }

    public String[] getCriteres() {
        return criteres;
    }

    public void setCriteres(String[] criteres) {
        this.criteres = criteres;
    }

    public void addCriteres(String... criteres) {
        int longeur = this.criteres.length + criteres.length;
        String[] union = new String[longeur];
        int index = 0;
        for (String critere : this.criteres) {
            union[index] = critere;
            index++;
        }
        for (String critere : criteres) {
            union[index] = critere;
            index++;
            this.criteres = union;
        }
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    //getter et setter alt + insert
    //on a besoin des getter et setter, car les objets on été créés en privé
} 
