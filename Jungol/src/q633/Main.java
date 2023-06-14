package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("Seoul\n");
			} else if (num == 2) {
				System.out.println("Washington\n");
			} else if (num == 3) {
				System.out.println("Tokyo\n");
			} else if (num == 4) {
				System.out.println("Beijing\n");
			} else {
				System.out.println("none");
				sc.close();
				break;
			}
		}
	}

}
