/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centrale.ds_medev;

/**
 *
 * @author alex4
 */
public class Cell {
    private int x;
    private int y;
    private boolean occupied;
    private boolean hit;
    private boolean miss;
    private Ship ship;

    /**
     *
     * @param x
     * @param y
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        occupied = false;
        hit = false;
        miss = false;
    }

    /**
     *
     * @return
     */
    public Ship getShip() {
        return ship;
    }

    /**
     *
     * @param ship
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    /**
     *
     * @return
     */
    public boolean isMiss() {
        return miss;
    }

    /**
     *
     * @param miss
     */
    public void setMiss(boolean miss) {
        this.miss = miss;
    }
    
    /**
     *
     * @return
     */
    public boolean isHit() {
        return hit;
    }

    /**
     *
     * @param hit
     */
    public void setHit(boolean hit) {
        this.hit = hit;
    }

    /**
     *
     * @return
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     *
     * @param occupied
     */
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
}
