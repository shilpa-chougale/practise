package mypkg;

public class Pattern2 {
	public static void main(String args[])
	{
		System.out.println("pattern program");
		for(int r=1;r<5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r+""+c+" ");
			}
			System.out.println();
		}
		
		System.out.println("\npattern2");
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
			System.out.print(r+""+c+" ");	
			
			}
			System.out.println();
		}
		
		System.out.println("Pattern 3");
		for(int r=1;r<5;r++)
		{
			for(int c=5;c>=r;c-- )
			{
				System.out.print(" ");
			}
			for(int k=1;k<=r;k++)
			{
				System.out.print(r+""+k+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int x=1;x<=4;x++) {
			for(int y=4;y>x;y--) {
				System.out.print(" ");
			}
			for(int z=1; z<=x;z++) {
				System.out.print(x+""+z+"  ");
			}
			System.out.println();
	      }
		
		
		System.out.println("pattern7\n");

		for(int a=1;a<=5;a++) {
			for(int b=1; b<=5;b++) {
				if((a==1)||(a==5)||(b==1)||(b==5)) {
					System.out.print("* ");
				}
					else {System.out.print("  ");
				}
			}
			System.out.println();
		}

		

		System.out.println("pattern8\n");
		for(int a= 1; a<=3;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			for(int b=3; b>=a;b--) {
				if((b==3)||(a==b)){
				System.out.print("* ");
				}
				else {System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("pattern 9 ");
		for(int x=1;x<=4;x++) {
			for(int y=4;y>x;y--) {
				System.out.print(" ");
			}
			for(int z=1; z<=x;z++) {
				if((z==1)||(z==x)){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();


			


}
}