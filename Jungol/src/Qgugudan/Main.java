package Qgugudan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		for (int i = s;  i<= e; i++) {
			for (int i2 = 1; i2 <= 9; i2++) {
				System.out.println(i + " x " + i2 + " = " + (i * i2));
			}
		}
	}
}
