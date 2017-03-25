
public class AssignTwo {
public static void main (String s[])
{
	//To write a program to print the result of the following expressions provided the integer variable a is
	//20 and b is 10.
	int a=20, b=10;
	System.out.println("The value of a = "+a+" and the value b is "+b);
	b=a-- - --a;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	int c=a--;
	System.out.println("c = "+c);
	int d=a>>2;
	System.out.println("d = "+d);
	
	int e=a&b;
	System.out.println("e = "+e);
}
}
