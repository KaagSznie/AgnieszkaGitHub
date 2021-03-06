/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombatNaval;

/**
 *
 * @author Admin
 */
public class TestBattleModel {
    public static void main(String[] args) throws Exception{
        BattleModel battleModel = new BattleModel(4);
        battleModel.createShip(1, Ship.Orientation.HORIZONTAL, 0, 0);
        battleModel.createShip(1, Ship.Orientation.HORIZONTAL, 2, 2);
        battleModel.createShip(1, Ship.Orientation.HORIZONTAL, 4, 4);
        battleModel.setPlay();
        
        CellState c = CellState.BOMB_WATER;
        CellState[][] cells = new CellState[2][2];
        cells[0][0] = CellState.BOMB_WATER;
        cells[0][1] = CellState.SHIP;
        cells[1][0] = CellState.SUNK;
        cells[1][1] = CellState.TOUCH;
        System.out.println("Fire 0,0");
        battleModel.fire(0, 0);
        System.out.println("Done? " + battleModel.isDone());
        System.out.println("Enemi");
        showCells(battleModel.getEnemiCellsState());
        System.out.println("Friend");
        showCells(battleModel.getFriendCellsState());
    }
    
    private static void showCells(CellState[][] cells) {
        StringBuilder sb = new StringBuilder();
        for(int l=0; l<cells.length; l++) {
            for(int c=0; c<cells[l].length; c++) {
                sb.append(convertCellState(cells[l][c]));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    
    private static char convertCellState(CellState cellState) {
        switch(cellState) {
            case BOMB_WATER:
                return 'B';
            case SHIP:
                return 'S';
            case SUNK:
                return 'U';
            case TOUCH:
                return 'T';
            case WATER:
                return 'W';
        }
        return '0';
    }
}
