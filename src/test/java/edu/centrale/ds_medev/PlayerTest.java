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
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrid method, of class Player.
     */
    @Test
    public void testGetGrid() {
        System.out.println("getGrid");
        Player instance = null;
        Grid expResult = null;
        Grid result = instance.getGrid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrid method, of class Player.
     */
    @Test
    public void testSetGrid() {
        System.out.println("setGrid");
        Grid grid = null;
        Player instance = null;
        instance.setGrid(grid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpponentGrid method, of class Player.
     */
    @Test
    public void testGetOpponentGrid() {
        System.out.println("getOpponentGrid");
        Player instance = null;
        Grid expResult = null;
        Grid result = instance.getOpponentGrid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpponentGrid method, of class Player.
     */
    @Test
    public void testSetOpponentGrid() {
        System.out.println("setOpponentGrid");
        Grid opponentGrid = null;
        Player instance = null;
        instance.setOpponentGrid(opponentGrid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeShips method, of class Player.
     */
    @Test
    public void testPlaceShips() {
        System.out.println("placeShips");
        Player instance = null;
        instance.placeShips();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
