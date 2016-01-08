
package veriyapıları_hmw5;

public class MID_SQUARE {
    
    HashEntry [] table;
    
    MID_SQUARE(int size){
        table = new HashEntry[size];
    }
    
    void put(int key, String value){
        int hash = key*key;
        hash = hash % table.length;
        
        table[hash] = new HashEntry(key, value);
    }
    
    String get(int key){//getir

        String aranan = "tabloda bulunamadı";
        int hash = key*key;
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

