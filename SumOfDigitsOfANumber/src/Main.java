import java.util.*;
public class Main {
	public static void calculateSumOfDigits(int n) {
        // your code here
        int sum=0;
        while(n!=0)
        {
        	int rem=n%10;
        	sum=sum+rem;
        	n=n/10;
		}
        System.out.println("Sum of Digits of a number is "+sum);
	}
		public static void main(String[] args)
		{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=scan.nextInt();
        calculateSumOfDigits(n);
        }
}
