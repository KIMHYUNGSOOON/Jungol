package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int num = sc.nextInt();
			sc.close();
			if (num == -1) {
				break;
			} else if (num % 3 == 0) {
				System.out.println(num / 3);
			} else {

			}
		}
	}

}
