package q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("두 수를 입력하시오. ");
		Scanner sc=new Scanner(System.in);
		int i1 =sc.nextInt();
		int i2 =sc.nextInt();
		sc.close();
		int sum1 = i1 + i2;
		int sum2 = i1 * i2;
		
		System.out.printf("두 수를 입력하시오. %d + %d = %d\n",i1,i2,sum1);
		System.out.printf("%d * %d = %d",i1,i2,sum2);
	}

}
