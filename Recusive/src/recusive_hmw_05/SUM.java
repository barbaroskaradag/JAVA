
package recusive_hmw_05;

import java.util.Scanner;


public class SUM {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
   System.out.println("Bir Sayı Giriniz");
   int deger=s.nextInt();
        System.out.println("Toplam Sayi Degeri :"+deger+" Numarası "+new SUM().sum(deger));
    }
    public int sum(int num)
    {
    if(num==0)
        return 0;
    else
        return (num+sum(num-1));
    }
}
