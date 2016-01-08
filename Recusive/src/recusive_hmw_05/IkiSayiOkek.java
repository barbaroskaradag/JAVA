/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusive_hmw_05;

import java.util.Scanner;
import static recusive_hmw_05.IkiSayiObebi.obeb;

/**
 *
 * @author ahmet.yazici
 */
public class IkiSayiOkek {
    public static int bulOkek(int pSayi1, int pSayi2)
    {
        int say = 2;
        int sonuc;
        while(true)
        {
            if((say % pSayi1 == 0)&&(say % pSayi2 == 0))
            {
                sonuc = say;
                break;
            }
            say++;
        }
        return sonuc;
    }
    
    public static void main(String[] args) {
Scanner gir=new Scanner(System.in);
System.out.println("küçük sayıyı giriniz:");
int sayi1=gir.nextInt();
System.out.println("ikinci sayıyı giriniz:");
int sayi2=gir.nextInt();
System.out.println(bulOkek(sayi1,sayi2));
 
}
}
