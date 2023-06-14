package q575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		num(num1, num2);
	}

	static void num(int num1, int num2) {
		double result = Math.pow(num1, num2);

		System.out.printf("%.0f", result);
	}

}
