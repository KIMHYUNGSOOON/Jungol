package q9022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i1 =sc.nextInt();
		int i2 =sc.nextInt();
		sc.close();
		int a =++i1;
		int b =i2--;
		int sum =a+b;
		
		System.out.printf("a = %d, b = %d, c = %d",a,b,sum);
	}

}
