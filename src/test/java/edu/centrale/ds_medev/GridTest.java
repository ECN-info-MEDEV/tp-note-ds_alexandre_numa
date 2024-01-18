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
public class GridTest {
    
    public GridTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getSize method, of class Grid.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Grid grid = new Grid(10);
        
        assertEquals(10, grid.getSize());
    }

    /**
     * Test of setSize method, of class Grid.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        Grid grid = new Grid(10);
        
        grid.setSize(5);
        
        assertEquals(5, grid.getSize());
    }

    /**
     * Test of getCells method, of class Grid.
     */
    @Disabled
    @Test
    public void testGetCells() {
        System.out.println("getCells");
        Grid instance = null;
        Cell[][] expResult = null;
        Cell[][] result = instance.getCells();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCells method, of class Grid.
     */
    @Disabled
    @Test
    public void testSetCells() {
        System.out.println("setCells");
        Cell[][] cells = null;
        Grid instance = null;
        instance.setCells(cells);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayGrid method, of class Grid.
     */
    @Disabled
    @Test
    public void testDisplayGrid() {
        System.out.println("displayGrid");
        Grid instance = null;
        instance.displayGrid();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of markHit method, of class Grid.
     */
    @Disabled
    @Test
    public void testMarkHit() {
        System.out.println("markHit");
        Grid grid = new Grid(5);

        grid.markHit(1, 4);
        Cell[][] cells = grid.getCells();
        assertTrue((cells[1][4]).isHit());
    }

    /**
     * Test of markMiss method, of class Grid.
     */
    @Disabled
    @Test
    public void testMarkMiss() {
        System.out.println("markMiss");
        Grid grid = new Grid(5);

        grid.markMiss(1, 4);
        Cell[][] cells = grid.getCells();
        assertTrue((cells[1][4]).isMiss());
    }

    /**
     * Test of isOccupied method, of class Grid.
     */
    @Disabled
    @Test
    public void testIsOccupied() {
        System.out.println("isOccupied");
        Grid grid = new Grid(5);
        
        grid.getCells()[1][4].setOccupied(true);
        grid.getCells()[4][1].setOccupied(false);
        assertTrue(grid.getCells()[1][4].isOccupied());
        assertFalse(grid.getCells()[4][1].isOccupied());
    }

    /**
     * Test of setOccupied method, of class Grid.
     */
    @Disabled
    @Test
    public void testSetOccupied() {
        System.out.println("setOccupied");
        Grid grid = new Grid(5);
        
        grid.getCells()[1][4].setOccupied(true);
        grid.getCells()[4][1].setOccupied(false);
        assertTrue(grid.getCells()[1][4].isOccupied());
        assertFalse(grid.getCells()[4][1].isOccupied());
    }

    /**
     * Test of setShip method, of class Grid.
     */
    @Disabled
    @Test
    public void testSetShip() {
        System.out.println("setShip");
        Grid grid = new Grid(5);
        
        grid.setShip(1, 4, new Ship("Ship", 4, new Cell[4])); 
        
        assertEquals("Ship",grid.getCells()[1][4].getShip().getType());
        assertEquals(4,grid.getCells()[1][4].getShip().getLength());
    }
}

