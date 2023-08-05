import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int fact=1;
		for(int i=1;i<=N;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
