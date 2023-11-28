/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4;

/**
 * Singleton class demonstrating the singleton design pattern
 * @author Abdul
 * @version 1.1
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    /**
    *
    * Singleton object constructor, kept as private to implement singleton pattern
    */
    private Singleton (){}
    
    /**
    *
    * Return the object instance of the singleton class
    * @return the object instance of singleton
    */
    public static Singleton getInstance() {
        return instance;
    }
    
    /**
    *
    * Print the given message for the singleton class
    */
    public void showMessage(){
        System.out.println("Singleton object printed");
    }
}
