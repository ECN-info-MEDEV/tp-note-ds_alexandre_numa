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
public class CellTest {
    
    public CellTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of isMiss method, of class Cell.
     */
    @Test
    public void testIsMiss() {
        System.out.println("isMiss");
        Cell cell = new Cell(0,50);
        
        cell.setMiss(true);
        
        assertEquals(true, cell.isMiss());
    }

    /**
     * Test of setMiss method, of class Cell.
     */
    @Test
    public void testSetMiss() {
        System.out.println("setMiss");
        Cell cell = new Cell(0,50);
        
        cell.setMiss(false);
        
        assertEquals(false, cell.isMiss());
    }

    /**
     * Test of isHit method, of class Cell.
     */
    @Test
    public void testIsHit() {
        System.out.println("isHit");
        Cell cell = new Cell(0,50);
        
        cell.setHit(true);
        
        assertEquals(true, cell.isHit());
    }

    /**
     * Test of setHit method, of class Cell.
     */
    @Test
    public void testSetHit() {
        System.out.println("setHit");
        Cell cell = new Cell(0,50);
        
        cell.setHit(false);
        
        assertEquals(false, cell.isHit());
    }

    /**
     * Test of isOccupied method, of class Cell.
     */
    @Test
    public void testIsOccupied() {
        System.out.println("isOccupied");
        Cell cell = new Cell(0,50);
        
        cell.setOccupied(true);
        
        assertEquals(true, cell.isOccupied());
    }

    /**
     * Test of setOccupied method, of class Cell.
     */
    @Test
    public void testSetOccupied() {
        System.out.println("setOccupied");
        Cell cell = new Cell(0,50);
        
        cell.setOccupied(false);
        
        assertEquals(false, cell.isOccupied());
    }

    /**
     * Test of getX method, of class Cell.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Cell cell = new Cell(0,50);

        assertEquals(0, cell.getX());
    }

    /**
     * Test of setX method, of class Cell.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        Cell cell = new Cell(0,50);
        
        cell.setX(20);

        assertEquals(20, cell.getX());
    }

    /**
     * Test of getY method, of class Cell.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Cell cell = new Cell(0,50);

        assertEquals(50,cell.getY());
    }

    /**
     * Test of setY method, of class Cell.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        Cell cell = new Cell(0,50);
        
        cell.setY(20);

        assertEquals(20,cell.getY());
    }

    /**
     * Test of getShip method, of class Cell.
     */
    @Test
    public void testGetShip() {
        System.out.println("getShip");
        Cell cell = new Cell(0,50);
        
        cell.setShip(new Ship("Ship", 4, new Cell[4])); 
        
        assertEquals("Ship",cell.getShip().getType());
        assertEquals(4,cell.getShip().getLength());
    }

    /**
     * Test of setShip method, of class Cell.
     */
    @Test
    public void testSetShip() {
        System.out.println("setShip");
        Cell cell = new Cell(0,50);
        
        cell.setShip(new Ship("Ship", 4, new Cell[4])); 
        
        assertEquals("Ship",cell.getShip().getType());
        assertEquals(4,cell.getShip().getLength());
    }
}
