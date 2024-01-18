/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centrale.ds_medev;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alex4
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
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
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
    
}
