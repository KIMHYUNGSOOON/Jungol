package q556;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//part1
//		int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		for (int a = 0; a < i.length; a++) {
//			System.out.print(i[a] + " ");
//		}
		
		//part2
		int[]num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
