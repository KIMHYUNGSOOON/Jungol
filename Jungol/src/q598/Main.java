package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (;;) {
			char cha = sc.next().charAt(0);

			if (cha >= 'A' && cha <= 'Z') {
				System.out.printf("%c\n", cha);
			} else if (cha >= 'a' && cha <= 'z') {
				System.out.printf("%c\n", cha);
			} else if (cha >= 48 && cha <= 57) {
				System.out.printf("%d\n", (int) cha);
			} else if (cha >= 97 && cha <= 122) {
				System.out.printf("%d\n", (int) cha);
			} else {
				sc.close();
				break;
			}
		}
	}

}
