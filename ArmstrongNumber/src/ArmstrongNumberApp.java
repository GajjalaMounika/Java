import java.util.Scanner;

public class ArmstrongNumberApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	ArmstrongNumber armstrong=new ArmstrongNumber();
	double n2=armstrong.armstrong(n);
	System.out.println(n2);
	if(n2==n)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong Number");
	}
	}
}
