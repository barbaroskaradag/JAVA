
package recusive_hmw_05;

import java.util.Scanner;


public class toplayarakCarpma {
    public static int toplayarakcarp(int sayi,int carpilcak){
if((sayi==0) || (carpilcak==0))
return 0;
else
return sayi+toplayarakcarp(sayi, carpilcak-1);
}
public static void main(String[] args) {
Scanner gir=new Scanner(System.in);
System.out.println("sayi gir:");
int sayi=gir.nextInt();
System.out.println("carpilcak sayi gir:");
int carpilcak=gir.nextInt();
System.out.println("sonuc: "+toplayarakcarp(sayi, carpilcak));
 
}
}
