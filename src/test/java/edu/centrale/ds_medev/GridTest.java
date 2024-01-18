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
}

