package mypkg;

public class Method1 {
	
public static void main(String args[])
{
	System.out.println("hello java;");
	add();
	
	Method1 m1=new Method1();
	m1.sub();
	//multiplication.multi();
}


public static void add()
{
	int i=20;
	int j=30;
	
	int y=i+j;
	System.out.println("addition ="+y);
}
public void sub()
{
int i=60;
int j=30;
int s=i-j;
System.out.println("Substaction="+s);
}
}