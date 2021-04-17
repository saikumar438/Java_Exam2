package Question6;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author S542300
 */
public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Output for Question 6 by Saikumar Mylavarapu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of a triangle :");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        while (s1 + s2 <= s3 || s2 + s3 <= s1 || s1 + s3 <= s2) {
            System.out.println("Please enter the values again, "
                    + "the side 1 and side 2 are not greater than side 3");
            System.out.println("Enter sides of a triangle :");
            s1 = sc.nextDouble();
            s2 = sc.nextDouble();
            s3 = sc.nextDouble();

        }

        Triangle obj = new Triangle("Red", true, s1, s2, s3);
        System.out.println("The Area is :" + obj.calcArea());
        System.out.println("Perimeter :" + obj.calcPerimeter());
        System.out.println("Color : " + obj.getColor());
        System.out.println("Is Filled : " + obj.isFilled());

    }

}
