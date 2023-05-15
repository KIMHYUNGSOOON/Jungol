package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		
		System.out.printf("%d * %d = %d\n", i, i2, i * i2);
		System.out.printf("%d / %d = %d", i, i2, i / i2);
		sc.close();
	}
}
