/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class MoveFowardTest {
    
    public MoveFowardTest() {
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
     public void moveFowardPressRightPedalTest() {
         MoveForward fowardMovement = new MoveForward();
         fowardMovement.subState = "Decelerate";
         assertTrue(fowardMovement.pressRightPedal(3));
     }
     
     @Test
     public void moveFowardPressRightPedalForTimeTest() {
         MoveForward fowardMovement = new MoveForward();
         fowardMovement.pressRightPedalForTime(5);
         assertEquals("Constant Speed", fowardMovement.subState);
     }
}
