/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centrale.ds_medev;

/**
 * Classe Bateau 
 * @author alex4
 */
public class Ship {
    
    // Attributs 
    private String type;
    private int length; 
    private Cell[] cells;
    private boolean sunk;

    // Constructeurs 
    /**
     *
     * @param type Type de bateau (porte avion, cuirassé ou destroyer)
     * @param length taille du bateau
     * @param cells tableau des cellules occupé par le bateau
     */
    public Ship(String type, int length, Cell[] cells) {
        this.type = type;
        this.length = length;
        this.cells = cells;
    }

    // Getters and Setters 
    /**
     *
     * @return le type du bateau
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type le nouveau type du bateau
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return la taille du bateau
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @param length la nouvelle taille du bateau
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     *
     * @return le tableau des cellules occupées par le bateau
     */
    public Cell[] getCells() {
        return cells;
    }

    /**
     *
     * @param cells le nouveau tableau des cellules occupées par le bateau
     */
    public void setCells(Cell[] cells) {
        this.cells = cells;
    }

    /**
     *
     * @return si le bateau a coulé 
     */
    public boolean isSunk() {
        return sunk;
    }

    /**
     *
     * @param sunk indique si le bateau a coulé 
     */
    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }
    

    
}
