import java.util.Scanner;

public class Seriesprinter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter N to print the Numbers in the series");
	int n=scan.nextInt();
	fibonacciSeries fibonacciSeries=new fibonacciSeries();
	fibonacciSeries.fibonacciSeries(n);
    
	
}
}
