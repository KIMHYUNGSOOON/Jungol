package q9022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();
		++i1;
		int sum = i1 + i2;
		i2--;

		System.out.printf("a = %d, b = %d, c = %d", i1, i2, sum);
	}

}
