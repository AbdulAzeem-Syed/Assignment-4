/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4;

/**
 *
 * @author Abdul
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    
    private Singleton (){}
    
    public static Singleton getInstance() {
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Singleton object printed");
    }
}
