package q9021;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		System.out.printf("최초값 a = %d, b = %d\n\n",a,b);
		System.out.printf("a++ = %d, ++b = %d\n",a,b+1);
		a++;
		++b;
		System.out.printf("실행후 a = %d, b = %d\n\n", a, b);
		System.out.print("a-- = 11, --b = 10\n");
		a--;
		--b;
		System.out.printf("실행후 a = %d, b = %d", a, b);
	}

}
