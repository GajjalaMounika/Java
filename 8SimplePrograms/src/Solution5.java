import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to print Numbers divisible by 3 and 5");
		int n=scan.nextInt();
		displaydivisibleby3and5(n);
	}
	public static void  displaydivisibleby3and5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println(i);
			}
		}
}
}
