package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num[]=new int[10];
		int sum1=0;
		int sum2=0;
		int a=0;
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();			
			if(i%2==0) {
				sum1+=num[i];
				a++;
			}
		}
		for(int j=0;j<num.length;j++) {
			if(j%2!=0) {
				sum2+=num[j];
			}
		}
		sc.close();
		System.out.println("sum : "+sum2);
		System.out.printf("avg : %.1f",(double)sum1/a);
	}

}
