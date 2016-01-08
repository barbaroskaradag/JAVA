
package veriyapıları_hmw5;

public class RADIX {
    
    HashEntry [] table;
    
    RADIX(int size){
        table = new HashEntry[size];
    }
    
    void put(int key, String value){
        int hash = key;
        String s = String.valueOf(hash);
        int ns[]=new int[100];
        double T=0;
        for (int i =s.length()-1; i >=0 ; i--) {
            ns[i]=(int)s.charAt(i)-48;
            T=T+ns[i]*(Math.pow(2, s.length()-1-i));
        }        
        hash = ((int) T) % table.length;
        
        table[hash] = new HashEntry(key, value);
    }
    
    String get(int key){
        String aranan = "tabloda bulunamadı";
        int hash = key;
        String s = String.valueOf(hash);
        int ns[]=new int[100];
        double T=0;
        for (int i =s.length()-1; i >=0 ; i--) {
            ns[i]=(int)s.charAt(i)-48;
            T=T+ns[i]*(Math.pow(2, s.length()-1-i));
        }        
        hash = ((int) T) % table.length;
        
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
