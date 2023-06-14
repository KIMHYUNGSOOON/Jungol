package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int ct=0;
		
		
		for(;;) {
			int num=sc.nextInt();
				if(num%3!=0&&num%5!=0) {
					ct++;
				}
				if(num==0) {
					break;
				}
		}
		System.out.println(ct);
	}

}
