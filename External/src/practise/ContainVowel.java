package practise;

public class ContainVowel {
public static void main(String[] args) {
	String str="welcome";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			System.out.println("String having vowel at "+str.charAt(i)+" at index"+i);
	}
	
}}
