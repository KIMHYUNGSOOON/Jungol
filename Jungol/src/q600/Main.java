package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		int cnt=1;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==32) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
