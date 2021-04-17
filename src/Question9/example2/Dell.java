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
public class Dell implements Laptop{

    @Override
    public void camera() {
        System.out.println("This is camera in Dell class overriden from"
                + " Laptop interface");
    }

    @Override
    public void fingerPrint() {
        System.out.println("This is FingerPrint in Dell class Overriden from"
                + " Laptop Interface");
    }
    
    
    
}
