package demopkg;

public class Armstrong {
	public static void main(String[] args) {
		
		int num=153;
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
			System.out.println("Given no "+num+" is armstrong");
		}else
			System.out.println("no not armstrong");
	}
	

}
