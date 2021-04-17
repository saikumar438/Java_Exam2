package Question4.example2;


import Question4.example2.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class LaptopDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Output for Question 4 by Saikumar Mylavarapu"); 
        Laptop obj = new Dell(); // Polymorphic substitution
        
        obj.display(); // Late binding Polymorphism displasy method is not 
 //in Dell class compiler will get this method from super class (inheritance)
        obj.keyBoard();  // keyboard method from Dell class
        System.out.println("**************************");
        Laptop obj2 = new HPLaptop(); // polymorphic substitution
        obj2.display(); // display method from HPLaptop class
        obj2.keyBoard(); // Late binding Polymorphism displasy method is not 
//in HPLaptop class compiler will get this method from super class (Inheritance)
            
    }
    
}
