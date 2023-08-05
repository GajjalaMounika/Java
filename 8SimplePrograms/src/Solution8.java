import java.util.Scanner;

public class Solution8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		displayOdddivisibleby5(n);
	}
	public static void displayOdddivisibleby5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0&&i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
