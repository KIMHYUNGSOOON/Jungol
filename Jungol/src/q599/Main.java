package q599;

import java.util.Scanner;

public class Main {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();

      char change;
      for (int i = 0; i < input.length(); i++) {
         change = input.charAt(i);
         if (change >= 65 && change <= 90) {
            System.out.print(change);
         } else if (change >= 97 && change <= 122) {
            System.out.print((char) (change - 32));

         }
         sc.close();

      }

   }

}