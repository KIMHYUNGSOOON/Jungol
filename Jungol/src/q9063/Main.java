package q9063;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] score=new int[5];
		sc.close();
		
		for(int i1=0;i1<5;i1++) {
			score [i1]=sc.nextInt();
			System.out.print(score[i1]+" ");
		}
	}
}
