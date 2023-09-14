import java.util.*;
public class CubeNumberApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		cubeNumber cn = new cubeNumber();
		System.out.println(cn.cuNumber( num));
		sc.close();

	}

}
