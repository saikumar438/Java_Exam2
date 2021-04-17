package Question5;


import java.util.Date;

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
             System.out.println("Output for Question 5 by Saikumar Mylavarapu");
		Person personObj = new Person("Sachin","2-3 old mumbai",
                        99999999,"sachintendulkar@gmail.com");
		Student studentObj = new Student("Kohli","12-15 Delhi",
                        88888888,"viratkohli@gmail.com","A");
		Date dateHired = new Date(2008,10,28);
		Date dateHiredFaculty = new Date(2015,12,06);
		Employee employeeObj = new Employee("RaviShastri","912 W "
                        + "mumbai",7777777,"ravishastri@gmail.com","BCCI",
                        100000,dateHired);
		Faculty facultyObj = new Faculty("SanjayBangar",
                        "8-1-5 Gujarat",6666666,"Sanjaybangar@gmail.com","BCCI",
                        50000,dateHiredFaculty,8,1);
		Staff staffObj = new Staff("Sridhar","20-14 hyderabad",
                        555555555,"rsridhar@gmail.com","BCCI",25000,dateHired,
                        "Fielding Coach");
		
		System.out.println(personObj);
		System.out.println(studentObj);
		System.out.println(employeeObj);
		System.out.println(facultyObj);
		System.out.println(staffObj);
	}

}

