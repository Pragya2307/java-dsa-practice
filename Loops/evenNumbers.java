import java.util.Scanner;

public class evenNumbers {
   public evenNumbers() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i = 2; i <= n; i ++) {
         if (i % 2 == 0) {
         System.out.println(i);
      }
      }

   }
}

