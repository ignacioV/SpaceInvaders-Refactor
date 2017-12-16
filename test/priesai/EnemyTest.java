/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priesai;

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
public class EnemyTest {
    int plotis = 5;
    int aukstis =5;
    int life=3;
    BossEnamy instance = new BossEnamy(plotis, aukstis, life);
    
    public EnemyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of move method, of class Enemy.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        instance = new BossEnamy(plotis, aukstis, 0);
        
        int expRez = instance.getX()+1;
        
        instance.move();
        assertEquals(instance.getX(), expRez);
        
    }

    

    /**
     * Test of getGyvybes method, of class Enemy.
     */
    @Test
    public void testGetGyvybes() {
        System.out.println("getGyvybes");
        
        int expResult = 3;
        int result = instance.getGyvybes();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setGyvybes method, of class Enemy.
     */
    @Test
    public void testSetGyvybes() {
        System.out.println("setGyvybes");
        int gyvybes = 10;
        
        instance.setGyvybes(gyvybes);
        
        assertEquals(instance.getGyvybes(), gyvybes);
        
    }

    /**
     * Test of getAtvaizdas method, of class Enemy.
     */
    @Test
    public void testGetAtvaizdas() {
        System.out.println("getAtvaizdas");
        
        char expResult = 'B';
        char result = instance.getAtvaizdas();
        assertEquals(expResult, result);
        
    }
    
}
