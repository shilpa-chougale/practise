package mypkg;

public class Pattern1 {

	public static void main(String args[])
	{
		System.out.println("Pattern program");
	for(int i=1;i<=5;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("pattern 1");
	for(int r=1;r<=4;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	System.out.println("pattern 2");
	for(int r=1;r<=4;r++)
	{
		for(int c=4;c>=r;c--)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	
	System.out.println("parren");
	for(int r=1;r<=4;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	for(int r=1;r<=4;r++)
	{
		for(int c=3;c>=r;c--)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	System.out.println("pattern 3");
	for(int r=4;r>=1;r--)
	{
		for(int c=3;c>=r;c--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=r;c++)
		{
				System.out.print("*");
		}
			System.out.println();
		
	}
	
	System.out.println("Pattern4");
	for(int i=1;i<=4;i++)
	{
		for(int k=3;k>=i;k--)
			System.out.print(" ");
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("Pattern 5");
	for(int r=4;r>=1;r--)
	{
		for(int k=3;k>=r;k--)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=r;j++)
		{	System.out.print("*");}
		System.out.println();
	}
	for(int r=2;r<=4;r++)
	{
		for(int k=3;k>=r;k--)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=r;j++)
		{	System.out.print("*");}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
