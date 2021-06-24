package Day22;

import java.util.Scanner;

public class PointMainMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Point x and Y");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Point p = new Point();
		p.setX(a);
		p.setY(b);
		System.out.println(p.toString());
	}

}
