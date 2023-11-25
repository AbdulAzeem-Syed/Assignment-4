/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4;

/**
 *
 * @author Abdul
 */
public class Facade {
    private FacadeShape circle;
    private FacadeShape rectangle;
    private FacadeShape square;
    
    public Facade() {
        circle = new FacadeCircle();
        rectangle = new FacadeRectangle();
        square = new FacadeSquare();
    }
    
    public void drawCircle(){
        circle.draw();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
        
    public void drawSquare(){
        square.draw();
    }
}

interface FacadeShape {
    void draw();
}

class FacadeRectangle implements FacadeShape {
    
    @Override
    public void draw() {
        System.out.println("Facade rectangle printed");
    }
}

class FacadeSquare implements FacadeShape {
    
    @Override
    public void draw() {
        System.out.println("Facade square printed");
    }
}

class FacadeCircle implements FacadeShape {
    
    @Override
    public void draw() {
        System.out.println("Facade circle printed");
    }
}