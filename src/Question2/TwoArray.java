package Question2;


import java.util.Scanner;

/**
 *
 * @author S542300
 */
public class TwoArray {
    
    public static boolean equals(int[][] m1, int[][] m2) {
		int count=0;
		
		for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               if(m1[i][j]==m2[i][j]) 
               {
                   count++;
               }

            }

        }
        if(count==9){
                return true;
        }
        
        
        return false;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[][]=new int[3][3];
		int m2[][]=new int[3][3];
		
		Scanner sc =new Scanner(System.in);
            System.out.println("Output for Question 2 by Saikumar Mylavarapu");
		System.out.println("Enter list1: ");
		
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter list2: ");
		
		for(int i=0;i<m2.length;i++)
		{
			for(int j=0;j<m2[i].length;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		
		
		
		if(equals(m1,m2))
		{
			System.out.println("The two arrays are strictly identical");
		}
		else {
			System.out.println("The two arrays are not strictly identical");
		}
	}

}
