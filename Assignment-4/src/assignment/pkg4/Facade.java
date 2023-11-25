/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4;

/**
 * Facade class demonstrating the facade design pattern
 * @author Abdul
 * @version 1.1
 */
public class Facade {
    private FacadeShape circle;
    private FacadeShape rectangle;
    private FacadeShape square;
    
    /**
    *
    * Constructor for the Facade class, initializing all the objects to implement facade pattern
    */
    public Facade() {
        circle = new FacadeCircle();
        rectangle = new FacadeRectangle();
        square = new FacadeSquare();
    }
    
    /**
    *
    * Prints draw message for circle class in Facade class
    */
    public void drawCircle(){
        circle.draw();
    }
    
    /**
    *
    * Prints draw message for rectangle class in Facade class
    */
    public void drawRectangle(){
        rectangle.draw();
    }
    
    /**
    *
    * Prints draw message for square class in Facade class
    */
    public void drawSquare(){
        square.draw();
    }
}

/**
*
* Interface for implementing shape
*/
interface FacadeShape {
    void draw();
}

/**
*
* FacadeRectangle class implementing shape for the facade pattern
*/
class FacadeRectangle implements FacadeShape {
    
    @Override
    public void draw() {
        System.out.println("Facade rectangle printed");
    }
}

/**
*
* FacadeSquare class implementing shape for the facade pattern
*/
class FacadeSquare implements FacadeShape {
    
    @Override
    public void draw() {
        System.out.println("Facade square printed");
    }
}

/**
*
* FacadeCircle class implementing shape for the facade pattern
*/
class FacadeCircle implements FacadeShape {
    
    @Override
    public void draw() {
        System.out.println("Facade circle printed");
    }
}