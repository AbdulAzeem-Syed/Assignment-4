/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg4;

/**
 *
 * @author Abdul
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
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
        
        Factory factory = new Factory();
        FactoryShape factoryCircle = factory.getShape("CIRCLE");
        factoryCircle.draw();
        
        FactoryShape factoryRectangle = factory.getShape("RECTANGLE");
        factoryRectangle.draw();
        
        FactoryShape factorySquare = factory.getShape("SQUARE");
        factorySquare.draw();
    }   
    
}
