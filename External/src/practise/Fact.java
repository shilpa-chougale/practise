package practise;

public class Fact {
	public static void main(String[] args) {
		int no=5;
		int fact=1;
		
		
		for(int i=no;i>=1;i--)  //5   4   3     2   1
		{
			fact=fact*i;   //5     5*4     20*3    60*2    120*1
		}
		System.out.println(fact);
		
		
		
		
		
		String s1="greek@for@greeksss";
		System.out.println(s1);
		String[] s2=s1.split("@");
		for(int i=0;i<=s2.length-1;i++)
		{
			System.out.println(s2[i]);
		}
		
		
	}
	
	
	
	

}
