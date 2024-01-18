/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alex4
 */
public class Player {
    
    private String name;
    private Grid grid;
    private Grid opponentGrid;

    public Player(String name, Grid grid, Grid opponentGrid) {
        this.name = name;
        this.grid = grid;
        this.opponentGrid = opponentGrid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Grid getOpponentGrid() {
        return opponentGrid;
    }

    public void setOpponentGrid(Grid opponentGrid) {
        this.opponentGrid = opponentGrid;
    }
    
    
}
