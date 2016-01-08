
package recusive_hmw_05;

import java.util.Scanner;
import static recusive_hmw_05.fibonacci.fibonacci;


public class faktoriyel {
    static int factorial(int N) {
  if (N == 0) return 1;

  return N*factorial(N-1);

}
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
   System.out.println("Bir Sayı Giriniz");
       
        int index=s.nextInt();
        System.out.println("***************************");
    for (int counter = 0; counter <= index; counter++)
      System.out.printf("Faktoriyel of %d is: %d\n", counter, factorial(counter));
  }
    }

