package q000;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		int s=num*num;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.printf("%d ",i*num+j+1);
			}

		}
		sc.close();
		
	}

}