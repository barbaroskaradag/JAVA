/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusive_hmw_05;


public class OrnekString {
    /* 
 Bir dizideki string ifadelerden girilen harften baslayan elemanların adedini bulan recursive program
 */
    public static int adetbulma(String[] dizi,int uzunluk,char aranilan){
if(uzunluk<0)
return 0;
else if(dizi[uzunluk].charAt(0)==aranilan)
return 1+adetbulma(dizi, uzunluk-1, aranilan);
else
return adetbulma(dizi, uzunluk-1, aranilan);
 
}
public static void main(String[] args) {
String[] dizi={"ali","samis","yunus","cevdet","mehmet","ayse"};
char aranilan='z';
int uzunluk=dizi.length;
System.out.println(adetbulma(dizi,uzunluk-1,aranilan));
 
}
}
