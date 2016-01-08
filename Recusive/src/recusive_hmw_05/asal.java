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
public class asal {
    public static Boolean asalsayimi(int sayi, int bolen){
if(bolen<=1)
return true;
else if((sayi) % (bolen) ==0)
return false;
else
return asalsayimi(sayi, bolen-1);
 
}
public static void main(String[] args) {
Scanner gir=new Scanner(System.in);
System.out.println("sayi gir:");
int sayi=gir.nextInt();
System.out.println(asalsayimi(sayi,sayi/2));
 
}
}
