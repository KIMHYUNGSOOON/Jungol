package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		sc.close();
		if (d > 88.45) {
			System.out.println("Heavyweight");
		} else if (d > 72.57) {
			System.out.println("Cruiserweight");
		} else if (d > 61.23) {
			System.out.println("Middleweight");
		} else if (d > 50.80) {
			System.out.println("Lightweight");
		} else {
			System.out.println("Flyweight");
		}
	}

}
