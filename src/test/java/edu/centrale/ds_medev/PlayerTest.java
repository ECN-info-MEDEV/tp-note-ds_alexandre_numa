/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centrale.ds_medev;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nunuc
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
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
        Player player = new Player("Jean", new Grid(5), new Grid(5));
        
        assertEquals("Jean", player.getName());        
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Player player = new Player("Jean", new Grid(5), new Grid(5));
        
        player.setName("Pierre");
        
        assertEquals("Pierre", player.getName());  
    }

    /**
     * Test of getGrid method, of class Player.
     */
    @Test
    public void testGetGrid() {
        System.out.println("getGrid");
        Player player = new Player("Jean", new Grid(5), new Grid(5));
        
        Grid grid = new Grid(5);
        
        assertEquals(grid, player.getGrid()); 
    }

    /**
     * Test of setGrid method, of class Player.
     */
    @Test
    public void testSetGrid() {
        System.out.println("setGrid");
        Player player = new Player("Jean", new Grid(5), new Grid(5));
        
        Grid grid = new Grid(4);
        player.setGrid(grid);
        
        assertEquals(grid, player.getGrid()); 
    }

    /**
     * Test of getOpponentGrid method, of class Player.
     */
    @Test
    public void testGetOpponentGrid() {
        System.out.println("getOpponentGrid");
        Player player = new Player("Jean", new Grid(5), new Grid(5));
        
        Grid grid = new Grid(5);
        
        assertEquals(grid, player.getOpponentGrid()); 
    }

    /**
     * Test of setOpponentGrid method, of class Player.
     */
    @Test
    public void testSetOpponentGrid() {
        System.out.println("setOpponentGrid");
        Player player = new Player("Jean", new Grid(5), new Grid(5));
        
        Grid grid = new Grid(4);
        player.setOpponentGrid(grid);
        
        assertEquals(grid, player.getOpponentGrid()); 
    }

    /**
     * Test of placeShips method, of class Player.
     */
    @Test
    public void testPlaceShips() {
        // Vérifier que les navires sont correctement placés
        player.placeShips();

        // Ajoutez ici des assertions pour vérifier que les navires sont correctement placés sur la grille.
        // Par exemple, vous pouvez vérifier que les cellules occupées correspondent à la taille des navires.
    }

    /**
     * Test of placeShipOnGrid method, of class Player.
     */
    @Test
    public void testPlaceShipOnGrid() {
        // Créez un navire fictif pour les tests
        Ship ship = new Ship("TestShip", 3, new Cell[3]);

        // Appelez la méthode pour placer le navire sur la grille
        Player.placeShipOnGrid(ship);

        // Ajoutez ici des assertions pour vérifier que le navire est correctement placé sur la grille.
        // Par exemple, vérifiez que les cellules occupées correspondent à la taille du navire.
    }

    @Test
    public void testIsValidPlacement() {
        // Testez la méthode avec différentes positions valides et invalides
        assertTrue(player.isValidPlacement(0, 0));
        assertTrue(player.isValidPlacement(5, 5));
        assertFalse(player.isValidPlacement(-1, 0));
        assertFalse(player.isValidPlacement(11, 5));

        // Vous pouvez ajouter plus de cas de test en fonction de votre implémentation.
    }
    
}
