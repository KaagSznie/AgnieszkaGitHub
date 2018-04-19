
package CombatNaval;

import java.util.ArrayList;

public abstract class BattleGrid {
    
    protected int size;
    protected ArrayList<Ship> ships = new ArrayList<>();
    // remplace avantageusement : Ship[] shipList = new Ship[100];
    protected ArrayList<Bomb> bombs = new ArrayList<>();

    public BattleGrid(int size) {
        this.size = size;
    }
    
    
    public CellState[][] getCellsState() {
        CellState[][] cells = new CellState[size][size];
        for(int l=0; l<size; l++) {
            for(int c=0; c<size; c++) {
                cells[l][c] = CellState.WATER;
            }
        }
        return cells;
    }
    
    FireResult fire(int x, int y) {
        return FireResult.WATER;
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
