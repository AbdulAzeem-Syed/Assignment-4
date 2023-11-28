/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import assignment.pkg4.Facade;
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
public class FacadeTest {
    
    public FacadeTest() {
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
        Facade facade = new Facade();
        assertEquals(facade.drawSquare(),"Facade square printed");
    }
    
    @Test
    public void factoryRectangleTest() {
        Facade facade = new Facade();
        assertEquals(facade.drawRectangle(),"Facade rectangle printed");
    }
    
    @Test
    public void factoryCircleTest() {
        Facade facade = new Facade();
        assertEquals(facade.drawCircle(),"Facade circle printed");
    }
}
