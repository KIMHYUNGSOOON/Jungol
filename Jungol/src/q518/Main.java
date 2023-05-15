package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i1 =sc.nextInt();
		int i2 =sc.nextInt();
		int i3 =sc.nextInt();
		sc.close();
		int sum =i1+i2+i3;
		int avg =sum/3;
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		
	}

}
