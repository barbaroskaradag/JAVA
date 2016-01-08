package recusive_hmw_05;

import java.util.Scanner;

public class pover {

    
    public static void main(String[] args) {
          Scanner s1=new Scanner(System.in);
          Scanner s2=new Scanner(System.in);
            System.out.println("Bir Sayı Giriniz");
       
        int sayi1=s1.nextInt();
        System.out.println("Bir Sayı Daha Giriniz");
        
        int sayi2=s2.nextInt();
        System.out.println("***************************");
        
        System.out.println(sayi1+" 'nin"+sayi2+". üslü ="+powerN(sayi1, sayi2));
   
    }
    
    
    public static int powerN(int base, int n) {

        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return base * base;
        } else {
            return base * powerN(base, n - 1);
        }

    }
}
