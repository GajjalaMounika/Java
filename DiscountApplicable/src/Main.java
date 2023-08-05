import java.util.*;
public class Main {
	public static void checkDiscount(double purchaseAmount)

	{ 
		// your code here
		if(purchaseAmount>100)

		{
			System.out.println("Discount Applicable");
		}
	}

	public static void main(String[] args)

	{
     Scanner scan=new Scanner(System.in);
     double purchaseAmount=scan.nextDouble();
     checkDiscount(purchaseAmount);
	}
}
