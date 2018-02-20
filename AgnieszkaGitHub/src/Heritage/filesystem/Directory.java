
package Heritage.filesystem;

public class Directory extends Node {
    int nrFiles = 0;
    
    public Directory(String name) {
        super(name); // vient du constructeur de la classe mère; il doit être à la première ligne
    }

    @Override
    public String toString() {
        return "Directory{" + "nrFiles=" + nrFiles + ",nom=" + name + '}';
    }  
}
