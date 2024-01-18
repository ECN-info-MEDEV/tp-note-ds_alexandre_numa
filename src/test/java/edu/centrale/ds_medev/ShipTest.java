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
public class ShipTest {
    
    public ShipTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getType method, of class Ship.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Cell[] cells = new Cell[4];
        Ship ship = new Ship("default", 4, cells);
        
        assertEquals("default", ship.getType());
    }

    /**
     * Test of setType method, of class Ship.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        Cell[] cells = new Cell[4];
        Ship ship = new Ship("default", 4, cells);
        
        ship.setType("default0");
        
        assertEquals("default0", ship.getType());
    }

    /**
     * Test of getLength method, of class Ship.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Cell[] cells = new Cell[4];
        Ship ship = new Ship("default", 4, cells);
        
        assertEquals(4, ship.getLength());
    }

    /**
     * Test of setLength method, of class Ship.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        Cell[] cells = new Cell[4];
        Ship ship = new Ship("default", 4, cells);
        
        ship.setLength(5);
        
        assertEquals(5, ship.getLength());
    }

    /**
     * Test of getCells method, of class Ship.
     */
    @Test
    public void testGetCells() {
        System.out.println("getCells");
        Cell[] cells = new Cell[4];
        Ship ship = new Ship("default", 4, cells);
        
        assertEquals(cells, ship.getCells());
    }

    /**
     * Test of setCells method, of class Ship.
     */
    @Test
    public void testSetCells() {
        System.out.println("setCells");
        Cell[] cells = new Cell[4];
        Ship ship = new Ship("default", 4, cells);
        
        cells[2].setX(5);
        
        ship.setCells(cells);
        
        assertEquals(cells, ship.getCells());
    }
    
}
