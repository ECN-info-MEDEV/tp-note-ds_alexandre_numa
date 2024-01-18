/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.centrale.ds_medev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Classe Joueur
 * @author alex4
 */
public class Player {
    
    // Attributs
    private String name;
    private Grid grid;
    private Grid opponentGrid;
    
    private Ship carrier;
    private Ship battleship;
    private Ship destroyer;

    // Constructeurs
    /**
     *
     * @param name nom du joueur
     * @param grid grille du joueur
     * @param opponentGrid grille adverse
     */
    public Player(String name, Grid grid, Grid opponentGrid) {
        this.name = name;
        this.grid = grid;
        this.opponentGrid = opponentGrid;
        carrier = new Ship("Carrier", 5, new Cell[5]);
        battleship = new Ship("Battleship", 4, new Cell[4]);
        destroyer = new Ship("Destroyer", 3, new Cell[3]);
        
    }

    // Getters and Setters 
    /**
     *
     * @return le nom du joueur
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name le nouveau nom du joueur
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return la grille du joueur
     */
    public Grid getGrid() {
        return grid;
    }

    /**
     *
     * @param grid la nouvelle grille du joueur
     */
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     *
     * @return la grille adverse
     */
    public Grid getOpponentGrid() {
        return opponentGrid;
    }

    /**
     *
     * @param opponentGrid la nouvelle grille adverse
     */
    public void setOpponentGrid(Grid opponentGrid) {
        this.opponentGrid = opponentGrid;
    }

    /**
     *
     * @return le porte avion
     */
    public Ship getCarrier() {
        return carrier;
    }

    /**
     *
     * @param carrier le nouveau porte avion
     */
    public void setCarrier(Ship carrier) {
        this.carrier = carrier;
    }

    /**
     *
     * @return le cuirassé 
     */
    public Ship getBattleship() {
        return battleship;
    }

    /**
     *
     * @param battleship le nouveau cuirassé
     */
    public void setBattleship(Ship battleship) {
        this.battleship = battleship;
    }

    /**
     *
     * @return le destroyer
     */
    public Ship getDestroyer() {
        return destroyer;
    }

    /**
     *
     * @param destroyer le nouveau destroyer
     */
    public void setDestroyer(Ship destroyer) {
        this.destroyer = destroyer;
    }
    
    // Méthodes
    
    /**
     * Ajout des bateaux du joueur sur sa grille 
     */
    public void placeShips() {
        
        System.out.println(name + ", placez vos navires sur la grille.");

        placeShipOnGrid(carrier);
        placeShipOnGrid(battleship);
        placeShipOnGrid(destroyer);
    }
    
    /**
     * Ajour d'un bateau sur la grille 
     * @param ship le bateau a rajouté 
     */
    public void placeShipOnGrid(Ship ship) {
        System.out.println("Placez votre " + ship.getType() + " (taille " + ship.getLength() + "x1)");

        Scanner scanner = new Scanner(System.in);

        boolean validPlacement = false;
        
        Cell[] cells = new Cell[ship.getLength()];
        
        int x = 0;
        int y = 0;
        int direction = 0;

        while (!validPlacement) {
            validPlacement = true;
            System.out.print("Entrez la position (ligne et colonne): ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            System.out.print("Choissir la direction :\n0: Vertical (vers le bas)\n1: Horizontal (vers la droite)");

            direction = scanner.nextInt();

            for (int i=0; i<ship.getLength(); i++){
                if (direction == 0){
                    if (!isValidPlacement(x+i,y)){
                        validPlacement = false;
                        int temp = x+i;
                        System.out.println("La case (" + temp + "," + y + ") est déja occupée ou hors limite");
                    }
                } else {
                    if (!isValidPlacement(x,y+i)){
                        validPlacement = false;
                        int temp = y+i;
                        System.out.println("La case (" + x + "," + temp + ") est déja occupée ou hors limite");
                    }
                }
            }
            
            
        }
       
        for (int j=0; j<ship.getLength(); j++){
            if (direction == 0){
                grid.setOccupied(x+j, y);
                grid.setShip(x+j, y, ship);
                cells[j] = new Cell(x+j,y);
                cells[j].setOccupied(true);


            } else {
                grid.setOccupied(x, y+j);
                grid.setShip(x, y+j, ship);
                cells[j] = new Cell(x,y+j);
                cells[j].setOccupied(true);
            }
        }

        ship.setCells(cells);
            
    }
    
    /**
     * Test si le placement en (x, y) est valide
     * @param x 
     * @param y
     * @return si le placement est valide
     */
    public boolean isValidPlacement(int x, int y) {
        // Vérifier si la position est dans les limites de la grille
        if (x < 0 || x >= grid.getSize() || y < 0 || y >= grid.getSize()) {
            return false;
        }

        // Vérifier si la cellule est déjà occupée par un autre navire
        if (grid.isOccupied(x, y)) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Méthode d'un tour de jeu
     */
    public void takeTurn(){
        System.out.println("Choisir la case à attquer :");

        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if (grid.isOccupied(x, y)){
            if (opponentGrid.isHit(x, y)){
                System.out.println("Raté ! Cette casse était déjà touchée");
            } else {
                System.out.println("Bravo ! Vous avez touché un bateau");
                opponentGrid.markHit(x, y);
                Ship ship = opponentGrid.getCells()[x][y].getShip();
                boolean sunk = true;
                for (Cell c: ship.getCells()){
                    if (!c.isHit()){
                        sunk = false;
                    }
                }
                if (sunk){
                    switch (ship.getType()){
                        case "Carrier":
                            carrier.setSunk(true);
                            break;
                        case "Battleship":
                            battleship.setSunk(true);
                            break;
                        case "Destroyer":
                            destroyer.setSunk(true);
                            break;
                    }
                }
            }
           
        } else {
            System.out.println("Raté ! Il n'y a rien sur cette case");
            opponentGrid.markMiss(x, y);
        }
         
    }
    
    /**
     * Méthode test de fin de partie 
     * @param opponent joueur adverse
     * @return si le joueur a gagné
     */
    public boolean hasWon(Player opponent){
        return opponent.carrier.isSunk() && opponent.battleship.isSunk() && opponent.destroyer.isSunk();
        
    }
    
}
