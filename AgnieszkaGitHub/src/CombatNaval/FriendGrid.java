
package CombatNaval;

class FriendGrid extends BattleGrid { 
   public FriendGrid(int size) {
        super(size);
    }
    
    void createShip(int size, Ship.Orientation orientation, int x, int y) {
        ShipType type = new ShipType(size);
        Ship ship = new Ship(type, orientation, x, y);
        ships.add(ship);
    }
    
}
