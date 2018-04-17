
package CombatNaval;

import java.util.ArrayList;

public class BattleGrid {
    
    private int size;
    ArrayList<Ship> ships = new ArrayList<>();
    // remplace avantageusement : Ship[] shipList = new Ship[100];
    ArrayList<Bomb> bombs = new ArrayList<>();

    public BattleGrid(int size) {
        this.size = size;
    }

    public CellState[][] getCellState(){
    }
    
    public FireResult fire(int x, int y){
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }
    
    
}
