
package recusive_hmw_05;

import java.util.Scanner;


public class ustAlma {
    public static int us(int taban,int usdeger){
if (usdeger==0)
return 1;
else if(taban==1)
return 1;
else
return taban*us(taban,usdeger-1);
 
}
public static void main(String[] args) {
Scanner gir=new Scanner(System.in);
System.out.println("taban gir:");
int taban=gir.nextInt();
System.out.println("üsdeğer gir:");
int usdeger=gir.nextInt();
System.out.println("sonuc: "+us(taban, usdeger));
 
}
}
