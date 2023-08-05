import java.util.Scanner;

public class Sloution3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to print Numbers divisible by 5");
		int n=scan.nextInt();
		displaydivisibleby5(n);
	}
	public static void  displaydivisibleby5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
}
}