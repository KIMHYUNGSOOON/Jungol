package q9066;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char [] ch=new char[26];
		
		for(char i=0;i<=26;i++) {
			ch [i]=sc.next().charAt(0);
			System.out.print(ch[i]);
		}
		sc.close();
	}

}
