package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Main3 school1 = new Main3();

//		String name = sc.next();
//		String school = sc.next();
//		int grade = sc.nextInt();

		System.out.println("Name" + " : " + school1.name);
		System.out.println("School" + " : " + school1.school);
		System.out.println("Grade" + " : " + school1.grade);

		
		
//		Main school11 =new Main(name,school,grade)
//		school1.name = sc.next();
//		school1.school = sc.next();
//		school1.grade = sc.nextInt();
//		
//		System.out.println("Name" + " : " + school1.name);
//		System.out.println("School" + " : " + school1.school);
//		System.out.println("Grade" + " : " + school1.grade);
		sc.close();
	}
	

}

class Main3 {


	// TODO Auto-generated method stub
	String name ;
	String school ;
	int grade ;

}

