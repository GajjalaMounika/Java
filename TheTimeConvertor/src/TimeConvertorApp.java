import java.util.Scanner;

public class TimeConvertorApp{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int min=scan.nextInt();
  		System.out.println(TimeConvertor.convertToHours(min));
}
}
