/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centrale.ds_medev;


/**
 *
 * @author alex4
 */
public class Grid {
    private int size;
    private Cell[][] cells;

    public Grid(int size) {
        this.size = size;
        cells = new Cell[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                cells[i][j] = new Cell(i,j);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
    
    public void displayGrid(){
        String display = "";
        for (Cell[] line : this.cells){
            for (Cell c: line){
                display += ".";
            }
            display += "\n";
        }
        System.out.println(display);
    }
    
    public void markHit(int x,int y){
        cells[x][y].setHit(true);
    }
    
    public void markMiss(int x, int y){
        cells[x][y].setMiss(true);
    }
    
    public boolean isOccupied(int x,int y){
        return cells[x][y].isOccupied();
    }
    
}
