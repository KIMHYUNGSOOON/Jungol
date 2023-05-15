package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("키를 입력하세요. ");
		System.out.print("몸무게를 입력하세요. ");
		System.out.print("이름을 입력하세요. ");
		Scanner sc=new Scanner(System.in);
		int i1 =sc.nextInt();
		double d1 =sc.nextDouble();
		char c1=sc.next().charAt(0);
		sc.close();
		
		System.out.printf("키 = %d\n몸무게 = %.1f\n이름 = %c",i1,d1,c1);
		
	}

}
