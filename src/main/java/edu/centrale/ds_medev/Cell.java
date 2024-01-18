/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centrale.ds_medev;

/**
 * Classe Cellule qui correspond à une case du plateau de jeu
 * 
 * @author alex4
 */
public class Cell {
    
    // Attributs
    private int x;
    private int y;
    private boolean occupied;
    private boolean hit;
    private boolean miss;
    private Ship ship;

    // Constructeurs
    /**
     * Constructeur d'une cellule prédéfinie
     * @param x la position horizontale
     * @param y la position verticale
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        occupied = false;
        hit = false;
        miss = false;
    }

    // Getters and Setters 
    /**
     * 
     * @return le bateau sur la cellule
     */
    public Ship getShip() {
        return ship;
    }

    /**
     *
     * @param ship le bateau placé sur la cellule
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    /**
     *
     * @return si la cellule à reçu une attaque mais aucun bateau ne s'y trouvait
     */
    public boolean isMiss() {
        return miss;
    }

    /**
     *
     * @param miss le booléen qui indique que la cellule à reçu une attaque mais aucun bateau ne s'y trouvait
     */
    public void setMiss(boolean miss) {
        this.miss = miss;
    }
    
    /**
     *
     * @return si la cellule à reçu une attaque et qu'un bateau s'y trouvait
     */
    public boolean isHit() {
        return hit;
    }

    /**
     *
     * @param hit le booléen qui indique que la cellule à reçu une attaque et qu'un bateau s'y trouvait
     */
    public void setHit(boolean hit) {
        this.hit = hit;
    }

    /**
     *
     * @return si la cellule est occupé par un bateau
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     *
     * @param occupied le booléen qui indique que la cellule est occupé par un bateau
     */
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    /**
     *
     * @return la position en x de la cellule
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x la nouvelle en x position de la cellule 
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return la position en y de la cellule
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y la nouvelle en y position de la cellule 
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
}
