package q9041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (;;) {

			System.out.print("점수를 입력하세요. ");
			int i = sc.nextInt();
			if (80 <= i && i <= 100) {
				System.out.println("축하합니다. 합격입니다.");
			} else if (i >= 0 && i < 80) {
				System.out.println("죄송합니다. 불합격입니다.");
			} else {
				sc.close();
				break;
			}
		}
	}

}
