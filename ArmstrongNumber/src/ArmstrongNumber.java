import java.lang.Math;
public class ArmstrongNumber {
public double armstrong(int n)
{
	int OriginalNo=n;
	double n2=0;
	while(n!=0)
	{
		int rem=n%10;
		double n1=Math.pow(rem,3);
		n2=n1+n2;
		n=n/10;
	}
	return n2;
}
}
