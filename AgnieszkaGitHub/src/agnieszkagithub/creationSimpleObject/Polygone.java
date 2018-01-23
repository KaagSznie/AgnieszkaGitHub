
package agnieszkagithub.creationSimpleObject;

public class Polygone {
    public Side[] sideList;
    
    public Polygone(int sideNr) {
        this.sideList = new Side[sideNr];
    }

    @Override // ALT+INSERT --> toString
    public String toString() {
        return "Polygone";
                
                //"Polygone{" + "sideList=" + sideList + '}';
    }
    
    public int getSideNr() {
        return sideList.length;
    }
    
    public Side center() {
        double x = 0 ;
        double y = 1;
        return new Side(x,y);
    }
  
}
