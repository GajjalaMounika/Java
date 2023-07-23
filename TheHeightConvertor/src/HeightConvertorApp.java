import java.util.Scanner;

public class HeightConvertorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double inches=scan.nextDouble();
        HeightConvertor converter = new HeightConvertor();
		System.out.printf("%.2f",converter.convertInchesToFeet(inches));
	}
}
