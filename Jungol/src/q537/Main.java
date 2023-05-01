package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1 . while
		int n = sc.nextInt();
		int i = 1, sum = 0;
		while (i <= n)
			sum += i++;
		System.out.println(sum);
		sc.close();
	}
}