
package veriyapıları_hmw5;

import java.util.ArrayList;

public class FOLDING {
    HashEntry [] table;
    
    FOLDING(int size){
        table = new HashEntry[size];
    }
    
    void put(int key, String value){
        //BAŞLA
        int keytut = key;
        int toplam = 0;
        while( keytut != 0 )
        {
         toplam = toplam + ( keytut % 1000 );
         keytut = keytut / 1000;
        }
        int hash = toplam;
        //BİTİR
        hash = hash % table.length;
        
        table[hash] = new HashEntry(key, value);
    }
    
    String get(int key){
        String aranan = "tabloda bulunamadı";
        int toplam = 0;
        while( key != 0 )
        {
         toplam = toplam + ( key % 1000 );
         key = key / 1000;
        }
        int hash = toplam;
        hash = hash % table.length;
        
        if(table[hash] != null && table[hash].key == key)
            aranan = table[hash].value;
        return aranan;
    }
    
    void printTable(){
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            if( table[i] != null)
                System.out.println( table[i].key + " : " + table[i].value);
            else
                System.out.println("");
        }
    }


class HashEntry{
        int key;
        String value;
        
        HashEntry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }
}