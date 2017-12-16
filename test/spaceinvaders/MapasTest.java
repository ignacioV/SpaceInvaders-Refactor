/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bambalera
 */
public class MapasTest {
    Mapas instance = null;
    public MapasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Mapas(3, 5);
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of getAukstis method, of class Mapas.
     */
    @Test
    public void testGetAukstis() {
        System.out.println("getAukstis");
        //Mapas instance = null;
        int expResult = 3;
        int result = instance.getAukstis();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPlotis method, of class Mapas.
     */
    @Test
    public void testGetPlotis() {
        System.out.println("getPlotis");
        //Mapas instance = null;
        int expResult = 5;
        int result = instance.getPlotis();
        assertEquals(expResult, result);
        
    }
    
}
