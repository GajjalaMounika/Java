import java.util.*;
public class StringJoiner {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str1=scan.nextLine();
	String str2=scan.nextLine();
	String res=joinStrings(str1,str2);
	System.out.println(res);
}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	
}
}
