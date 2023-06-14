package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int max = (num1 > num2) ? num1 : num2;
		int min = (num1 < num2) ? num1 : num2;
		System.out.println(max - min);

	}

}
