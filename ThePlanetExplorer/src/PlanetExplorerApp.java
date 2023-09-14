import java.util.*;
public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		SurfaceArea Sa = new SurfaceArea();
		System.out.println(Sa.calculateSurfaceArea(radius));

	}

}
