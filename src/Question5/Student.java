package Question5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class Student extends Person{

		private String grade;
		private static final String STATUS = "graduate";
		

		
		public Student(String name, String address, long phone, 
                        String email, String grade) {
			super(name, address, phone, email);
			this.grade = grade;
		}



		@Override
		public String toString() {
			return "Student [name=" + getName() + "]";
		}
}
