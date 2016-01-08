/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusive_hmw_05;

import java.util.Scanner;


public class fibonacci {

    public static long fibonacci(long number) {
    if ((number == 0) || (number == 1)) // base cases
      return number;
    else
      // recursion step
      return fibonacci(number - 1) + fibonacci(number - 2);
  }

  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
   System.out.println("Bir Sayı Giriniz");
       
        int index=s.nextInt();
        System.out.println("***************************");
    for (int counter = 0; counter <= index; counter++)
      System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
  }
}
