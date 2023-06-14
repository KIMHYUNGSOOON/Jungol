package q572;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num2=sc.nextInt();
		sc.close();
		
		Main2 m=new Main2();
		
		System.out.printf("%.2f",num2*num2*m.num);
		
	}

}
