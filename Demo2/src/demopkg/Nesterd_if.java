package demopkg;

import java.util.Scanner;

public class Nesterd_if {
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value of A== ");
		a=sc.nextInt();
		if (a>20)
		{
			System.out.println("Value of A is Greater than 20");
			if (a<10)
			{
				System.out.println("Value of A is Less than 10");
				
			}
			if (a<15)
			{
				System.out.println("A is less than 15");
			}
			else 
			{
				System.out.println("VAlue of A is greater than 10 and 15");
				
			}
			
		}
		else 
		{
			System.out.println("exit the program");
		}
		
		
				
	}

}
