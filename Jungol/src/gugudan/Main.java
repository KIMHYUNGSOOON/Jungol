package gugudan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		
		for(int i=s;i<=e;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
			}
		}
		sc.close();
	}

}
