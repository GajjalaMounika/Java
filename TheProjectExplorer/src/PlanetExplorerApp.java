import java.util.*;
public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double radious=scan.nextDouble();		
		PlanetExplorer explorer = new PlanetExplorer();

		System.out.println(explorer.calculateSurfaceArea(radious));
	}
}
