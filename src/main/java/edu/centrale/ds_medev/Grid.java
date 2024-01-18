/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centrale.ds_medev;

import java.util.Set;


/**
 * Grille carré de cellules : plateau de jeu 
 * @author alex4
 */
public class Grid {
    
    // Attributs
    private int size;
    private Cell[][] cells;

    // Constructeurs
    /**
     * Constructeur d'une grille à la taille prédéfinie
     * @param size taille de la grille 
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

    // Getters and Setters 
    /**
     * 
     * @return la taille de la grille 
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size la nouvelle taille de la grille 
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @return la matrice des cellules qui composent la grille 
     */
    public Cell[][] getCells() {
        return cells;
    }

    /**
     *
     * @param cells la nouvelle matrice de cellule
     */
    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
    
    // Méthodes
    
    /**
     * Méthode d'affichage de la grille avec les bateaux et les Hit et Miss
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
     * Marquage de la grille si le tir en (x, y) a manqué la cible
     * @param x
     * @param y
     */
    public void markHit(int x,int y){
        cells[x][y].setHit(true);
    }
    
    /**
     * Marquage de la grille si le tir en (x, y) a touché la cible
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
     * @return si le tir en (x, y) a touché la cible 
     */
    public boolean isHit(int x, int y){
        return cells[x][y].isHit();
    }
    
    /**
     *
     * @param x
     * @param y
     * @return si la cellule en (x, y) est occupé
     */
    public boolean isOccupied(int x,int y){
        return cells[x][y].isOccupied();
    }
    
    /**
     * Ajout d'un indicateur (Occupied) sur la grille en (x, y)
     * @param x
     * @param y
     */
    public void setOccupied(int x, int y){
        cells[x][y].setOccupied(true);
        
    }
    
    /**
     * Ajout d'un bateau sur la grille en (x, y)
     * @param x
     * @param y
     * @param ship 
     */
    public void setShip(int x, int y, Ship ship){
        cells[x][y].setShip(ship);
    }
    
}
