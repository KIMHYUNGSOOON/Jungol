package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		boolean c = (num1 != 0);
		boolean d = (num2 != 0);

//		System.out.println(c+" "+d);
		System.out.print((c && d) + " " + (c || d));

//		if(num1==0&&num2==0) {
//			System.out.println(false+" "+false);
//		}else if(num1==0&&num2!=0) {
//			System.out.println(false+" "+true);
//		}else if(num1!=0&&num2==0) {
//			System.out.println(true+" "+false);
//		}else if(num1!=0&&num2!=0) {
//			System.out.println(true+" "+true);
//		}

//		System.out.print(num1==0?false:true+" ");
//		System.out.print(num2==0?false:true);

	}

}
