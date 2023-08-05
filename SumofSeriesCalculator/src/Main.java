import java.util.Scanner;

public class Main {
	public static void calculateSumOfSeries(int n)
    {
    // your code here
	double sum=0.0;
	 for(double i=1;i<=n;i++)
	 {
     sum=sum+1/i;
	 }
	 System.out.println("Sum of series is "+sum);
    }
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=scan.nextInt();
    calculateSumOfSeries(n);
    }
}
