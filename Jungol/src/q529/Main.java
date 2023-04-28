package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tall = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		int result1 = weight + 100 - tall;

		System.out.println(result1);
		if (0 < result1) {
			System.out.println("Obesity");
		}
	}
}
