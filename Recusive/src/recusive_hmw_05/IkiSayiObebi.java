/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusive_hmw_05;

import java.util.Scanner;

/**
 *
 * @author ahmet.yazici
 */
public class IkiSayiObebi {
    public static String obeb(int sayi1,int sayi2,int saydir){
if(saydir>sayi1)
return "";
else if(sayi1%saydir==0 && sayi2%saydir==0)
return saydir+" "+obeb(sayi1, sayi2, saydir+1);
else
return obeb(sayi1, sayi2, saydir+1);
 
}
public static void main(String[] args) {
Scanner gir=new Scanner(System.in);
System.out.println("küçük sayıyı giriniz:");
int sayi1=gir.nextInt();
System.out.println("ikinci sayıyı giriniz:");
int sayi2=gir.nextInt();
System.out.println(obeb(sayi1,sayi2,1));
 
}
}
