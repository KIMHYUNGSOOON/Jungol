package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		switch (c) {

		case 'A': {
			System.out.println("Excellent");
			break;
		}
		case 'B': {
			System.out.println("Good");
			break;
		}
		case 'C': {
			System.out.println("Usually");
			break;
		}
		case 'D': {
			System.out.println("Effort");
			break;
		}
		case 'F': {
			System.out.println("Failure");
			break;
		}
		default: {
			System.out.println("error");
			sc.close();
			break;
		}
		}
	}

}
