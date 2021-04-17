package Question6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class Triangle extends GeometricObject{

	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(String color, boolean isFilled, double s1, double s2, double s3) {
		super(color, isFilled);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return (s1+s2+s3); // perimeter = side1+side2+side3 
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		double p = (calcPerimeter()/2);
		return Math.sqrt(Math.abs(p*(p-s1)*(p-s2)*(p-s3))); // Heron's formula
	}
}

