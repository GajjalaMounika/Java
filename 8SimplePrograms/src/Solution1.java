import java.util.Scanner;

public class Solution1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number to print Numbers divisible by 2");
	int n=scan.nextInt();
	displayEven(n);
}
public static void displayEven(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
