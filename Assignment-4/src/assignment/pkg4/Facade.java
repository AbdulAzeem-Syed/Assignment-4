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
    * @return draw string
    */
    public String drawCircle(){
        return circle.draw();
    }
    
    /**
    *
    * Prints draw message for rectangle class in Facade class
    * @return draw string
    */
    public String drawRectangle(){
        return rectangle.draw();
    }
    
    /**
    *
    * Prints draw message for square class in Facade class
    * @return draw string
    */
    public String drawSquare(){
        return square.draw();
    }
}

/**
*
* Interface for implementing shape
*/
interface FacadeShape {
    String draw();
}

/**
*
* FacadeRectangle class implementing shape for the facade pattern
*/
class FacadeRectangle implements FacadeShape {
    
    @Override
    public String draw() {
        return "Facade rectangle printed";
    }
}

/**
*
* FacadeSquare class implementing shape for the facade pattern
*/
class FacadeSquare implements FacadeShape {
    
    @Override
    public String draw() {
        return "Facade square printed";
    }
}

/**
*
* FacadeCircle class implementing shape for the facade pattern
*/
class FacadeCircle implements FacadeShape {
    
    @Override
    public String draw() {
        return "Facade circle printed";
    }
}