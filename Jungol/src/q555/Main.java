package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		char[] ar = new char[10];
//		ar[0] = sc.next().charAt(0);
		char[] a = new char[10];
		for (int b = 0; b < a.length; b++) {
			a[b] = sc.next().charAt(0);
			System.out.printf("%c", a[b]);
		}
		sc.close();
	}
}