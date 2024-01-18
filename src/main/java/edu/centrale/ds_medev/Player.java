/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.centrale.ds_medev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alex4
 */
public class Player {
    
    private String name;
    private Grid grid;
    private Grid opponentGrid;
    
    private Ship carrier;
    private Ship battleship;
    private Ship destroyer;

    public Player(String name, Grid grid, Grid opponentGrid) {
        this.name = name;
        this.grid = grid;
        this.opponentGrid = opponentGrid;
        carrier = new Ship("Carrier", 5, new Cell[5]);
        battleship = new Ship("Battleship", 4, new Cell[4]);
        destroyer = new Ship("Destroyer", 3, new Cell[3]);
        
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

    public Ship getCarrier() {
        return carrier;
    }

    public void setCarrier(Ship carrier) {
        this.carrier = carrier;
    }

    public Ship getBattleship() {
        return battleship;
    }

    public void setBattleship(Ship battleship) {
        this.battleship = battleship;
    }

    public Ship getDestroyer() {
        return destroyer;
    }

    public void setDestroyer(Ship destroyer) {
        this.destroyer = destroyer;
    }
    
    
    
    public void placeShips() {
        
        System.out.println(name + ", placez vos navires sur la grille.");

        placeShipOnGrid(carrier);
        placeShipOnGrid(battleship);
        placeShipOnGrid(destroyer);
    }
    
    public void placeShipOnGrid(Ship ship) {
        System.out.println("Placez votre " + ship.getType() + " (taille " + ship.getLength() + "x1)");

        Scanner scanner = new Scanner(System.in);

        boolean validPlacement = false;
        
        Cell[] cells = new Cell[ship.getLength()];

        while (!validPlacement) {
            validPlacement = true;
            System.out.print("Entrez la position (ligne et colonne): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.print("Choissir la direction :\n0: Vertical (vers le bas)\n1: Horizontal (vers la droite)");

            int direction = scanner.nextInt();

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
            
            if (validPlacement) {
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
        }
    }
    
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
    
    
}
