package Question9.example2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public interface Laptop {
    
    
    public default void display()
    {
        System.out.println("Display in laptop interface ");
    }
    public abstract void camera();
    public abstract void fingerPrint();
}
