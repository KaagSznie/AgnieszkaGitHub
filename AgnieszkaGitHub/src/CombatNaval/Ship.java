/*
https://moodle.epfc.eu/mod/page/view.php?id=25986
*/
package CombatNaval;

/**
 * (2) Créez la classe Ship
2.1 définir le type Orientation:
public enum Orientation { HORIZONTAL, VERTICAL }
2.2 définir les attributs
ShipType type
int x
int y
Orientation orientation
2.3. les méthodes
Ship(ShipType type, Orientation orientation, int x, int y)
getter
 */
public class Ship {
    
    public enum Orientation { HORIZONTAL, VERTICAL };
    
    ShipType type;
    int x;
    int y;
    Orientation orientation;
    
    public Ship(ShipType type,  Orientation orientation, int x, int y) {
        this.type = type;
        this.orientation = orientation;
        this.x = x;
        this.y = y;
    }
    
    public ShipType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}

    