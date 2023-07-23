import java.util.*;
public class SimpleIntrestApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principle amount");
		double principle=scan.nextDouble();
		System.out.println("enter rate of interest");
		double rate=scan.nextDouble();
		System.out.println("enter time in years");
		double time=scan.nextDouble();
		SimpleIntrest SimpleInterest=new SimpleIntrest();
		System.out.printf("%.2f",SimpleInterest.calculateSimpleInterest(principle, rate, 
		time));
		scan.close();
		}
}
