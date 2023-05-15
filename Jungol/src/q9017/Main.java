package q9017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두 개의 실수를 입력하시오.");
		Scanner sc =new Scanner(System.in);
		double d1 =sc.nextDouble();
		double d2 =sc.nextDouble();
		sc.close();
		
		System.out.printf("x = %.2f\ny = %.2f",d1,d2);
	}

}
