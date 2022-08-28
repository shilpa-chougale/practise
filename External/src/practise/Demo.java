package practise;

public class Demo {
	public static void main(String args[])
	{
		System.out.println("even no");
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			
				System.out.println(2*i);
			
		}
		
		for(int i=5;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		String s1="automation";
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		/*int num=1;
		while(num<=10)
		{
			if(num%2==0)
			System.out.println(num);
			num++;*/
		
		}
}
