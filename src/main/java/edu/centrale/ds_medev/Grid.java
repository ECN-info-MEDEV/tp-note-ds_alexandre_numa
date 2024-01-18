/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centrale.ds_medev;

import java.util.Set;


/**
 *
 * @author alex4
 */
public class Grid {
    private int size;
    private Cell[][] cells;

    /**
     *
     * @param size
     */
    public Grid(int size) {
        this.size = size;
        cells = new Cell[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                cells[i][j] = new Cell(i,j);
            }
        }
    }

    /**
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @return
     */
    public Cell[][] getCells() {
        return cells;
    }

    /**
     *
     * @param cells
     */
    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
    
    /**
     *
     */
    public void displayGrid(){
        String display = "";
        for (Cell[] line : this.cells){
            for (Cell c: line){
                if(c.isOccupied()){
                    Ship ship = c.getShip();
                    switch (ship.getType()){
                        case "Carrier":
                            display += "C";
                            break;
                        case "Battleship":
                            display += "B";
                            break;
                        case "Destroyer":
                            display += "D";
                            break;
                        default:
                            display += ".";
                            break;
                    }
                            
                } else if (c.isMiss()){
                    display += "o";
                } else if (c.isHit()){
                    display += "x";
                } else {
                    display += ".";
                }  
            }
            display += "\n";
        }
        System.out.println(display);
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public void markHit(int x,int y){
        cells[x][y].setHit(true);
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public void markMiss(int x, int y){
        cells[x][y].setMiss(true);
    }
    
    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean isHit(int x, int y){
        return cells[x][y].isHit();
    }
    
    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean isOccupied(int x,int y){
        return cells[x][y].isOccupied();
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public void setOccupied(int x, int y){
        cells[x][y].setOccupied(true);
        
    }
    
    /**
     *
     * @param x
     * @param y
     * @param ship
     */
    public void setShip(int x, int y, Ship ship){
        cells[x][y].setShip(ship);
    }
    
}
