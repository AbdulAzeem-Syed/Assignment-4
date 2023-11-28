/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4.Factory;

/**
 * Factory class demonstrating the factory design pattern
 * @author Abdul
 * @version 1.1
 */
public class Factory {
    /**
    *
    * Constructor for factory class
    */
    public Factory(){}
    /**
    *
    * Returns the respective object based on the given string
    * @param shapeType Type of shape
    * @return Respective shape based on shapeType
    */
    public FactoryShape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new FactoryCircle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new FactoryRectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new FactorySquare();
        }
        return null;
    }
}

/**
*
* FactoryRectangle class implementing shape for the factory pattern
*/
class FactoryRectangle implements FactoryShape {
    /**
    *
    * Prints draw message for square class in Factory class
    * @return draw string
    */
    @Override
    public String draw() {
        return "Factory rectangle printed";
    }
}

/**
*
* FactorySquare class implementing shape for the factory pattern
*/
class FactorySquare implements FactoryShape {
    /**
    *
    * Prints draw message for square class in Factory class
    * @return draw string
    */
    @Override
    public String draw() {
        return "Factory square printed";
    }
}

/**
*
* FactoryCircle class implementing shape for the factory pattern
*/
class FactoryCircle implements FactoryShape {
    /**
    *
    * Prints draw message for square class in Factory class
    * @return draw string
    */
    @Override
    public String draw() {
        return "Factory circle printed";
    }
}