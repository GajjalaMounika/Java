import java.util.*;
public class SurfaceAreaOfSphereApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius");
		double radius=scan.nextDouble();
		 PlanetExplorer PlanestExplorer=new PlanetExplorer();
		 System.out.printf("%.2f",PlanestExplorer.calculateSurfaceArea(radius));
		 scan.close();
		}
}
