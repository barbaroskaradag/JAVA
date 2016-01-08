package veriyapıları_hmw5;

import java.util.Scanner;

public class VERİYAPILARI_HMW5 {

    public static void main(String[] args) {
         
        boolean durum = true;
                
        
        System.out.println("Lütfen Hash Fonksiyonunu seçiniz..\n" +
                            "1 - Selecting Digit\n" +
                            "2 - Mid Square\n" +
                            "3 - Folding \n" +
                            "4 - Division\n" +
                            "5 - RADIX TRANSFORMATION\n - : ");
        
        Scanner s = new Scanner(System.in);
        int scan = s.nextInt();
        
        int a = 1123446, b = 12212112, c = 12123334, d = 23444545, e = 33443432;
        String a1 = "Ali", b1 = "Veli", c1 = "Hasan", d1 = "Mehmet", e1 = "Furkan";
        
        if(scan == 1){
            System.out.println("----- SELECTING DIGITS ------");
            SELECTING_DIGIT table = new SELECTING_DIGIT(10);
            table.put(a, a1);
            table.put(b, b1);
            table.put(c, c1);
            table.put(d, d1);
            table.put(e, e1);
            table.printTable();
            
            problem();
            
            int probscan = s.nextInt();
            switch(probscan)
            {
                case 1 :
                    SD_3 table1 = new SD_3(10);
                    table1.put(a, a1);
                    table1.put(b, b1);
                    table1.put(c, c1);
                    table1.put(d, d1);
                    table1.put(e, e1);
                    table1.printTable();
                    break;
                    
                case 2 :
                    SD_2 table2 = new SD_2(10);
                    table2.put(a, a1);
                    table2.put(b, b1);
                    table2.put(c, c1);
                    table2.put(d, d1);
                    table2.put(e, e1);
                    table2.printTable();
                    break;
                    
                case 3 :
                    SD_1 table3 = new SD_1(10);
                    table3.put(a, a1);
                    table3.put(b, b1);
                    table3.put(c, c1);
                    table3.put(d, d1);
                    table3.put(e, e1);
                    table3.printTable();
                    break;
            }
            
            
        }
        else if(scan == 2)
        {
            System.out.println("----- FOLDING ------");
            FOLDING table = new FOLDING(10);
            table.put(a, a1);
            table.put(b, b1);
            table.put(c, c1);
            table.put(d, d1);
            table.put(e, e1);
            table.printTable();
            
            problem();
            
            int probscan = s.nextInt();
            switch(probscan)
            {
                case 1 :
                    FOL_3 table1 = new FOL_3(10);
                    table1.put(a, a1);
                    table1.put(b, b1);
                    table1.put(c, c1);
                    table1.put(d, d1);
                    table1.put(e, e1);
                    table1.printTable();
                    break;
                    
                case 2 :
                    FOL_2 table2 = new FOL_2(10);
                    table2.put(a, a1);
                    table2.put(b, b1);
                    table2.put(c, c1);
                    table2.put(d, d1);
                    table2.put(e, e1);
                    table2.printTable();
                    break;
                    
                case 3 :
                    FOL_1 table3 = new FOL_1(10);
                    table3.put(a, a1);
                    table3.put(b, b1);
                    table3.put(c, c1);
                    table3.put(d, d1);
                    table3.put(e, e1);
                    table3.printTable();
                    break;
            }
            

            
        }
        else if(scan == 3)
        {
            System.out.println("----- DIVISION ------");
            DIVISION table = new DIVISION(10);
            table.put(a, a1);
            table.put(b, b1);
            table.put(c, c1);
            table.put(d, d1);
            table.put(e, e1);
            table.printTable(); 
            
            problem();
            
            int probscan = s.nextInt();
            switch(probscan)
            {
                case 1 :
                    DIV_3 table1 = new DIV_3(10);
                    table1.put(a, a1);
                    table1.put(b, b1);
                    table1.put(c, c1);
                    table1.put(d, d1);
                    table1.put(e, e1);
                    table1.printTable();
                    break;
                    
                case 2 :
                    DIV_2 table2 = new DIV_2(10);
                    table2.put(a, a1);
                    table2.put(b, b1);
                    table2.put(c, c1);
                    table2.put(d, d1);
                    table2.put(e, e1);
                    table2.printTable();
                    break;
                    
                case 3 :
                    DIV_1 table3 = new DIV_1(10);
                    table3.put(a, a1);
                    table3.put(b, b1);
                    table3.put(c, c1);
                    table3.put(d, d1);
                    table3.put(e, e1);
                    table3.printTable();
                    break;
            }
            
            
        }
        else if(scan == 4)
        {
            System.out.println("----- MID SQUARE ------");
            MID_SQUARE table = new MID_SQUARE(10);
            table.put(a, a1);
            table.put(b, b1);
            table.put(c, c1);
            table.put(d, d1);
            table.put(e, e1);
            table.printTable(); 
            
            problem();
            
            int probscan = s.nextInt();
            switch(probscan)
            {
                case 1 :
                    MID_3 table1 = new MID_3(10);
                    table1.put(a, a1);
                    table1.put(b, b1);
                    table1.put(c, c1);
                    table1.put(d, d1);
                    table1.put(e, e1);
                    table1.printTable();
                    break;
                    
                case 2 :
                    MID_2 table2 = new MID_2(10);
                    table2.put(a, a1);
                    table2.put(b, b1);
                    table2.put(c, c1);
                    table2.put(d, d1);
                    table2.put(e, e1);
                    table2.printTable();
                    break;
                    
                case 3 :
                    MID_1 table3 = new MID_1(10);
                    table3.put(a, a1);
                    table3.put(b, b1);
                    table3.put(c, c1);
                    table3.put(d, d1);
                    table3.put(e, e1);
                    table3.printTable();
                    break;
            }
            
            
            
            
        }
        else if(scan == 5)
        {
            System.out.println("----- RADIX SQUARE ------");
            RADIX table = new RADIX(10);
            table.put(a, a1);
            table.put(b, b1);
            table.put(c, c1);
            table.put(d, d1);
            table.put(e, e1);
            table.printTable(); 
            
            problem();
            
            int probscan = s.nextInt();
            switch(probscan)
            {
                case 1 :
                    RAD_3 table1 = new RAD_3(10);
                    table1.put(a, a1);
                    table1.put(b, b1);
                    table1.put(c, c1);
                    table1.put(d, d1);
                    table1.put(e, e1);
                    table1.printTable();
                    break;
                    
                case 2 :
                    RAD_2 table2 = new RAD_2(10);
                    table2.put(a, a1);
                    table2.put(b, b1);
                    table2.put(c, c1);
                    table2.put(d, d1);
                    table2.put(e, e1);
                    table2.printTable();
                    break;
                    
                case 3 :
                    RAD_1 table3 = new RAD_1(10);
                    table3.put(a, a1);
                    table3.put(b, b1);
                    table3.put(c, c1);
                    table3.put(d, d1);
                    table3.put(e, e1);
                    table3.printTable();
                    break;
            }
        }
        else
            System.out.println("HATA : YANLIŞ SEÇİM YAPTINIZ");
        
        
    }
    
    static void problem(){
        System.out.println("--------------");
            System.out.println("Problemlerden Birini Seçiniz...");
            System.out.println("1 - Chaining\n" +
                                "2 - Linear Probing\n" +
                                "3 - Double Hashing");
    }
}
