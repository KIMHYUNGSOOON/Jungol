package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		sc.close();
		
//		int a=i1++ ,b=--i2,sum=a*b;
//		i1++;
//		i2--;
		int sum = i1++ * --i2;
		
		System.out.println(i1+" "+i2+" "+(sum));
	}
}