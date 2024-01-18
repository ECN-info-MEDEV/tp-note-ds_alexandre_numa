/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centrale.ds_medev;

/**
 *
 * @author alex4
 */
public class Ship {
    private String type;
    private int length; 
    private Cell[] cells;
    private boolean sunk;

    /**
     *
     * @param type
     * @param length
     * @param cells
     */
    public Ship(String type, int length, Cell[] cells) {
        this.type = type;
        this.length = length;
        this.cells = cells;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     *
     * @return
     */
    public Cell[] getCells() {
        return cells;
    }

    /**
     *
     * @param cells
     */
    public void setCells(Cell[] cells) {
        this.cells = cells;
    }

    /**
     *
     * @return
     */
    public boolean isSunk() {
        return sunk;
    }

    /**
     *
     * @param sunk
     */
    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }
    
    
    
}
