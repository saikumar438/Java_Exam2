package Question1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Saikumar Mylavarapu
 */
public class Duplicates {

    public static void removeDuplicate(ArrayList<Integer> list)
	{
		ArrayList<Integer> tempList = new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
		{
			if(!tempList.contains(list.get(i)))
			{
				tempList.add(list.get(i));
			}
		}
		
		System.out.print("The distinct integers are ");
		for(int i=0;i<tempList.size();i++)
		{
			System.out.print(tempList.get(i)+ " ");
		}
	}

	public static void main(String args[])
	{
		ArrayList<Integer> duplicateList = new ArrayList<>();
             System.out.println("Output for Question 1 by Saikumar Mylavarapu");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ten integers: ");
		for(int i=0;i<10;i++)
		{
			duplicateList.add(sc.nextInt());
		}
		removeDuplicate(duplicateList);
	}
        

}
