/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg4;

import assignment.pkg4.Factory.Factory;
import assignment.pkg4.Factory.FactoryShape;

/**
 * Base class to create objects for all the design patterns
 * @author Abdul
 * @version 1.1
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        
        Facade facade = new Facade();
        System.out.println(facade.drawCircle());
        System.out.println(facade.drawRectangle());
        System.out.println(facade.drawSquare());
        
        Factory factory = new Factory();
        FactoryShape factoryCircle = factory.getShape("CIRCLE");
        System.out.println(factoryCircle.draw());
        
        FactoryShape factoryRectangle = factory.getShape("RECTANGLE");
        System.out.println(factoryRectangle.draw());
        
        FactoryShape factorySquare = factory.getShape("SQUARE");
        System.out.println(factorySquare.draw());
    }   
    
}
