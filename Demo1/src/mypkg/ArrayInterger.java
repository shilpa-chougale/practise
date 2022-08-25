package mypkg;

public class ArrayInterger {
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		
		a[0][0]=10;
		
		a[1][0]=30;
		a[1][1]=40;
		
		
		for(int i=0;i<2;i++)//0	 1	
		{
			for(int j=0;j<2;j++)//0 	1	2
			{
				System.out.print(a[i][j]+"    ");
		
			}
			System.out.println();
		}
		
		
		System.out.println("Array ended");
		
	}

}

