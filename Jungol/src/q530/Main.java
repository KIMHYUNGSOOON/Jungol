package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 20 - a;
		sc.close();
		if (a >= 20) {
			System.out.println("adult");
		} else {
			System.out.println(b + " years later");
		}
	}
}