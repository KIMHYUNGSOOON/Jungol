package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();
		int sum1 = i1 + 100;
		int sum2 = i2 % 10;

		System.out.printf("%d %d", sum1, sum2);
	}

}
