package q617;

import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable {
	private String name;
	private String tall;

	public Person(String name, String tall) {
		this.name = name;
		this.tall = tall;
	}

	public void print() {
		System.out.println(name + " " + tall);
	}
	public char getFirstName() {
		return name.charAt(0);
	}
	public int compareTo(Object o) {
		Person p = (Person)o;
		if (this.getFirstName() < p.getFirstName()) {
			return -1;
		} else if (this.getFirstName() == p.getFirstName()) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			String tall = sc.next();
			p[i] = new Person(name, tall);
		}
		sc.close();

		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

		Arrays.sort(p);
	}
}