import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to print Numbers divisible by 2 and 5");
		int n=scan.nextInt();
		displaydivisibleby2and5(n);
	}
	public static void  displaydivisibleby2and5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0&&i%5==0)
			{
				System.out.println(i);
			}
		}
}
}
