package practiseprogrom;

public class Factorial {

	public static void main(String[] args) {
		Factorial  obj=new  Factorial ();
		obj.fact();
		obj.reverse();
		obj.palindrome();
		obj.fibo();
		obj.str();
		obj.armstrong();
		
		
	}
	public void fact()
	{
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			 fact=fact*i;
		}
		System.out.println(fact);
	}
	public void reverse()
	{
	int num=1234;
	int reverse=0;
	
	while(num!=0) {
		int rem=num%10;
		num=num/10;
		reverse=reverse*10+rem;
	}
	System.out.println("reverse no=="+reverse);
	}
	
	public void palindrome()
	{
		int num=1231;
		int reverse=0;
		int orgno=num;
		
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			reverse=reverse*10+rem;
		}
		System.out.println("reverse=="+reverse);
		if(reverse==orgno)
		{
			System.out.println("no is palindrome");
		}else
			System.out.println("no not palindrome");
	}
	public void fibo()
	{
		int no1=0,no2=1,no3,count=10;
		
		System.out.print(no1);
		System.out.print(" ,"+no2);
		for(int i=2;i<count;i++)
		{
			no3=no1+no2;
			System.out.print(", "+no3);
			no1=no2;
			no2=no3;
			
		}
	}
	public void str()
	{
		String str="shilpa";
	System.out.println("String=="+str);
	for(int i=0;i<str.length();i++)
	{
		System.out.println(str.charAt(i));
	}
	System.out.print("reverse sting of "+str+"==");
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
	}
	public void armstrong()
	{
		int num=151;//153,371
		int temp=num;
		int rem=0;
		int result=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			result=result+rem*rem*rem;
			temp=temp/10;
			
		}
		if(result==num)
		{
			System.out.println("\ngiven no=="+num+" is an armstrong no");
		}else
			System.out.println("given no=="+num+" is not an armstrong no");
	}
	
}
