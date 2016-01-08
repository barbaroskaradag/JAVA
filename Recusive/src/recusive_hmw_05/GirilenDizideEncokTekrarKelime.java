/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusive_hmw_05;

/**
 *
 * @author ahmet.yazici
 */
public class GirilenDizideEncokTekrarKelime {
    public static int elemanara(String [] dizi,String kelime,int uzunluk){
if(uzunluk<0)
return 0;
else if(dizi[uzunluk]==kelime)
return 1+elemanara(dizi, kelime, uzunluk-1);
else
return elemanara(dizi, kelime, uzunluk-1);
 
}
public static void main(String[] args) {
String [] dizi={"ali","ali","osman","selim"};
String kelime="ali";
int uzunluk=dizi.length;
System.out.println(elemanara(dizi,kelime,uzunluk-1));
 
}
}
