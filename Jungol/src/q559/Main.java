package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int class1=sc.nextInt();
		int class2=sc.nextInt();
		sc.close();
		
		double score[]= {85.6,79.5,83.1,80.0,78.2,75.0};
//		for(int i=class1;i<=class2;i++) {
//			System.out.println(score[class1-1]);
//			System.out.println(score[class2-1]);
			System.out.println(score[class1-1]+score[class2-1]);
		}
	}

//}
