import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d=scan.nextInt();
multiply(a,b,c,d);
	
	

}
public static void multiply(int a,int b,int c,int d)
{
	if(a==b)
	{
		System.out.println(c+d-a);
	}
	else if(a==c)
	{
		System.out.println(a+d-c);
	}
	else if(a==d)
		{
			System.out.println(c+b-d);
		}
	else if(c==b)
	{
		System.out.println(a+d-c);
	}
	else if(d==b)
	{
		System.out.println(c+a-b);
	}
	else if(d==c)
	{
		System.out.println(b+a-d);
	}
	else
	{
		System.out.println(a+b+c+d);
	}
}
}
