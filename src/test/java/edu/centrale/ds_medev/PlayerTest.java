/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centrale.ds_medev;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author nunuc
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        // Initialisation du joueur avec une grille fictive pour les tests
        Grid grid = new Grid(5); 
        Grid opponentGrid = new Grid(5);
        Player player = new Player("Jean", grid, opponentGrid);
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Grid grid = new Grid(5); 
        Grid opponentGrid = new Grid(5);
        Player player = new Player("Jean", grid, opponentGrid);
        
        assertEquals("Jean", player.getName());        
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Grid grid = new Grid(5); 
        Grid opponentGrid = new Grid(5);
        Player player = new Player("Jean", grid, opponentGrid);
        
        player.setName("Pierre");
        
        assertEquals("Pierre", player.getName());  
    }

    /**
     * Test of getGrid method, of class Player.
     */
//    @Disabled
//    @Test
//    public void testGetGrid() {
//        System.out.println("getGrid");
//        Grid grid = new Grid(5); 
//        Grid opponentGrid = new Grid(5);
//        Player player = new Player("Jean", grid, opponentGrid);
//        
//        assertEquals(grid, player.getGrid()); 
//    }

    /**
     * Test of setGrid method, of class Player.
     */
//    @Disabled
//    @Test
//    public void testSetGrid() {
//        System.out.println("setGrid");
//        Grid grid = new Grid(5); 
//        Grid opponentGrid = new Grid(5);
//        Player player = new Player("Jean", grid, opponentGrid);
//        
//        Grid grid1 = new Grid(4);
//        player.setGrid(grid1);
//        
//        assertEquals(grid1, player.getGrid()); 
//    }

    /**
     * Test of getOpponentGrid method, of class Player.
     */
//    @Disabled
//    @Test
//    public void testGetOpponentGrid() {
//        System.out.println("getOpponentGrid");
//        Grid grid = new Grid(5); 
//        Grid opponentGrid = new Grid(5);
//        Player player = new Player("Jean", grid, opponentGrid);
//        
//        for (int i = 0; i<grid.getSize(); i++) {
//            for (int j = 0; j<grid.getSize(); j++){
//            assertEquals(grid.getCells()[i][j].getX(), player.getOpponentGrid().getCells()[i][j].getX());
//            assertEquals(grid.getCells()[i][j].getY(), player.getOpponentGrid().getCells()[i][j].getY());
//            }
//        }     
//    }

    /**
     * Test of setOpponentGrid method, of class Player.
     */
//    @Disabled
//    @Test
//    public void testSetOpponentGrid() {
//        System.out.println("setOpponentGrid");
//        Grid grid = new Grid(5); 
//        Grid opponentGrid = new Grid(5);
//        Player player = new Player("Jean", grid, opponentGrid); 
//        
//        Grid grid1 = new Grid(4);
//        player.setOpponentGrid(grid1);
//        
//        assertEquals(grid1, player.getOpponentGrid()); 
//    }

    /**
     * Test of placeShips method, of class Player.
     */
//    @Disabled
//    @Test
//    public void testPlaceShips() {
//        System.out.println("placeShips");
//        Grid grid = new Grid(5); 
//        Grid opponentGrid = new Grid(5);
//        Player player = new Player("Jean", grid, opponentGrid); 
//        
//        player.placeShips();
//
//        assertNotNull(player.getCarrier().getCells());
//        assertNotNull(player.getBattleship().getCells());
//        assertNotNull(player.getDestroyer().getCells());
//
//        // Vérifier que les cellules occupées correspondent à la taille des navires
//        assertEquals(player.getCarrier().getLength(), countOccupiedCells(player.getCarrier()));
//        assertEquals(player.getBattleship().getLength(), countOccupiedCells(player.getBattleship()));
//        assertEquals(player.getDestroyer().getLength(), countOccupiedCells(player.getDestroyer()));
//    }

    /**
     * Test of placeShipOnGrid method, of class Player.
     */
//    @Disabled
//    @Test
//    public void testPlaceShipOnGrid() {
//        System.out.println("placeShipOnGrid");
//        Grid grid = new Grid(5); 
//        Grid opponentGrid = new Grid(5);
//        Player player = new Player("Jean", grid, opponentGrid); 
//        Ship ship = new Ship("TestShip", 3, new Cell[3]);
//
//        player.placeShipOnGrid(ship);
//
//        // Vérifier que le navire a été placé sur la grille du joueur
//        assertNotNull(ship.getCells());
//
//        // Vérifier que les cellules occupées correspondent à la taille du navire
//        assertEquals(ship.getLength(), countOccupiedCells(ship));
//    }

//    @Disabled
//    @Test
//    public void testIsValidPlacement() {
//        System.out.println("isValidPlacement");
//        Grid grid = new Grid(5); 
//        Grid opponentGrid = new Grid(5);
//        Player player = new Player("Jean", grid, opponentGrid);     
//        
//        assertTrue(player.isValidPlacement(0, 0));
//        assertTrue(player.isValidPlacement(1, 4));
//        assertFalse(player.isValidPlacement(-1, 0));
//        assertFalse(player.isValidPlacement(11, 5));
//
//        // Vous pouvez ajouter plus de cas de test en fonction de votre implémentation.
//    }
    
//    @Disabled
//    private int countOccupiedCells(Ship ship) {
//        int count = 0;
//        for (Cell cell : ship.getCells()) {
//            if (cell.isOccupied()) {
//                count++;
//            }
//        }
//        return count;
//    }
}

