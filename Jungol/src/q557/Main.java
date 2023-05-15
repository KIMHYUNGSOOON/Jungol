package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] c = new char[10];

		for (int b = 0; b < c.length; b++) {
			c[b] = sc.next().charAt(0);
		}
		System.out.printf("%c %c %c", c[0], c[3], c[6]);
		sc.close();
	}

}
