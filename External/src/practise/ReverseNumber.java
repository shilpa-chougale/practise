package practise;

public class ReverseNumber {
	public static void main(String arg[])
	{
		int no=1234;
		int rem=0;
		int result=0;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			result=result*10+rem;
		}
		System.out.println("reverseNo=="+result);
		
		ReverseNumber obj=new ReverseNumber();
		obj.fact();
		obj.fibo();
		obj.evenodd();
		obj.multiwithoutOprator();
		obj.reverseString();
		obj.armstrong();
	}
	
	public void fact() {
		int no=4;
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public void fibo() {
		int no1=0,no2=1,no3,count=10;
		System.out.println("fibonacci series==");
		System.out.print(no1+","+no2);
		for(int i=2;i<count;i++)
		{
			no3=no1+no2;
			System.out.print(","+no3);
			no1=no2;
			no2=no3;
		}	
	}
	public void evenodd() {
		int no=22;
		if(no%2==0)
		{
			System.out.println("no is even");
		}
		else
			System.out.println("no is odd");	
	}
	public void multiwithoutOprator() {
		int a=10;
		int b=4;
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			 sum=sum+b;
		}
		System.out.println("Multiplication=="+sum);
	}
	public void reverseString() {
		String s1="Shilpa";
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println("Reverse String=="+reverse);
		
		for(int i=0;i<s1.length();i=i+2)
			System.out.println(s1.charAt(i));
	}
	public void armstrong() {
		int no=153;
		int temp=no;
		int rem=0;
		int result=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			result=result+(rem*rem*rem);
			temp=temp/10;
		}
		if(result==no)
		{
			System.out.println("no is Armstrong");
		}
		else
			System.out.println("no not Armstrong");
		
	}
	
	
	
	
}
