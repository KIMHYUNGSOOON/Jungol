package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Main2 s1 = new Main2("Jejuelementary", 6);
		Main2 s2 = new Main2(school, grade);
		System.out.println(s1.grade + " grade in" + s1.school + " School");
		System.out.println(s2.grade + " grade in" + s1.school + " School");
	}

}
