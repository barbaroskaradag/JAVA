
package recusive_hmw_05;

import java.util.Scanner;

public class karakok {
    public static int kok(int sayi,int sayicik){
if(sayicik>sayi)
return 0;
else if((sayicik*sayicik)==sayi)
return sayicik;
else
return kok(sayi, sayicik+1);
 
}
public static void main(String[] args) {
Scanner gir=new Scanner(System.in);
System.out.println("kökü alınacak sayıyı giriniz:");
int sayi=gir.nextInt();
System.out.println(kok(sayi,0));
 
}
}
