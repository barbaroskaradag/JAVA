
package recusive_hmw_05;

import java.util.Scanner;


public class girilenSayiBasamakSayisi {
    public static int basamaksayisi(int sayi){
 
if((-10<sayi) && (sayi<10))
return 1;
else
return 1+basamaksayisi(sayi/10);
}
public static void main(String[] args) {
Scanner gir=new Scanner(System.in);
System.out.println("sayi gir:");
int sayi=gir.nextInt();
System.out.println("sayinin basamak sayisi:"+basamaksayisi(sayi));
 
}
}
