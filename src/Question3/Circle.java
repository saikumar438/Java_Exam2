package Question3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class Circle {
    
    private double radius;
	private double area;
	
	
	public Circle(double radius, double area) {
		this.radius = radius;
		this.area = area;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
	@Override
	public String toString() {
		return "Circle [radius= " + radius + ", area= " + area + "]";
	}
	
}
