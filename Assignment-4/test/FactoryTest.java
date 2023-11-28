/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import assignment.pkg4.Factory.Factory;
import assignment.pkg4.Factory.FactoryShape;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdul
 */
public class FactoryTest {
    
    public FactoryTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void factorySquareTest() {
        Factory factory = new Factory();
        FactoryShape factorySquare = factory.getShape("SQUARE");
        assertEquals(factorySquare.draw(),"Factory square printed");
    }
    
    @Test
    public void factoryRectangleTest() {
        Factory factory = new Factory();
        FactoryShape factorySquare = factory.getShape("RECTANGLE");
        assertEquals(factorySquare.draw(),"Factory rectangle printed");
    }
    
    @Test
    public void factoryCircleTest() {
        Factory factory = new Factory();
        FactoryShape factorySquare = factory.getShape("CIRCLE");
        assertEquals(factorySquare.draw(),"Factory circle printed");
    }
}
