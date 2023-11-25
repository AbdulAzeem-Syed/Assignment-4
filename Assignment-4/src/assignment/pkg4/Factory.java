/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4;

/**
 *
 * @author Abdul
 */
public class Factory {
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

interface FactoryShape {
    void draw();
}

class FactoryRectangle implements FactoryShape {
    @Override
    public void draw() {
        System.out.println("Factory rectangle printed");
    }
}

class FactorySquare implements FactoryShape {
    @Override
    public void draw() {
        System.out.println("Factory square printed");
    }
}

class FactoryCircle implements FactoryShape {
    @Override
    public void draw() {
        System.out.println("Factory circle printed");
    }
}