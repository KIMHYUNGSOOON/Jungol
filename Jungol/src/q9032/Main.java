package q9032;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		}
	}

}
