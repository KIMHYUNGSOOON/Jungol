package q196;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Main2 m2 = new Main2();
		m2.name = sc.next();
		m2.tel = sc.next();
		m2.addr = sc.next();

		Main3 m3 = new Main3();
		m3.name = sc.next();
		m3.tel = sc.next();
		m3.add = sc.next();

		System.out.println();
		System.out.println("name : " + m3.name);
		System.out.println("tel : " + m3.tel);
		System.out.println("addr : " + m3.add);
	}

}