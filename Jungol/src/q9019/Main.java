package q9019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int i4 = sc.nextInt();
		int i5 = sc.nextInt();
		sc.close();

		System.out.print(i1 + 3 + " ");
		System.out.print(i2 - 3 + " ");
		System.out.print(i3 * 3 + " ");
		System.out.print(i4 / 3 + " ");
		System.out.print(i5 % 3);
	}

}
