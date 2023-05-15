package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("yard? ");
		Scanner sc = new Scanner(System.in);
		double yard = sc.nextDouble();
		double cm = 91.44 * yard;
		sc.close();

		System.out.printf("%.1fyard = %.1fcm", yard, cm);
	}

}
