package demopkg;

import java.util.Scanner;

public class String_prg {

	public static void main(String args[])
	{
		String s1="Kolhapur";
		String s2="District";
		char c=s1.charAt(3);
		
		
		System.out.println("using CharAt function=="+s1+"\t 3rd index="+c);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String:");
		String s4=sc.nextLine();
		System.out.print("Character of 5th index is= "+s4.charAt(5));
		
		
		System.out.println("\nConcating two String");
		System.out.println("Enter 1st String =");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd String =");
		String str2=sc.nextLine();
		//String str3=str1.concat(str2);
		System.out.println("Concatination="+str1.concat(str2));
		
		boolean result=str1.contains("shilpa");
		System.out.println("contains method="+result);
		
		boolean result2=str1.equals(str2);
		System.out.println("equals method="+result2);
		
		
		
	}
}
