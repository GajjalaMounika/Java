import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to print Numbers divisible by 3");
		int n=scan.nextInt();
		displaydivisibleby3(n);
	}
	public static void  displaydivisibleby3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}

}
