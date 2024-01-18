/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.centrale.ds_medev;

/**
 *
 * @author alex4
 */
public class DS_Medev {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Test Sonar Cloud");
        
        Grid grid = new Grid(5);
        grid.displayGrid();
        
        
        Grid gridP1 = new Grid(5);
        Grid gridP2 = new Grid(5);
        
        Player P1 = new Player("P1", gridP1, gridP2);
        Player P2 = new Player("P2", gridP2, gridP1);
        
        P1.placeShips();
        P2.placeShips();
        
        P1.getGrid().displayGrid();
        
        boolean gameEnd = false;
        
        while(!gameEnd){
            P1.takeTurn();
            if (P1.hasWon(P2)){
                gameEnd = true;
                break;
            }
            P2.takeTurn();
            if (P2.hasWon(P1)){
                gameEnd = true;
                break;
            }
        }
        
        
    }
}
