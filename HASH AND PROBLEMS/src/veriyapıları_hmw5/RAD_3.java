package veriyapıları_hmw5;

public class RAD_3 {

    //Chaining
    LinkedList [] table;
    
    RAD_3(int size){
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList();
        }
    }
    
    void put(int key, String value){
        //başla
        int hash = key;
        String s = String.valueOf(hash);
        int ns[]=new int[100];
        double T=0;
        for (int i =s.length()-1; i >=0 ; i--) {
            ns[i]=(int)s.charAt(i)-48;
            T=T+ns[i]*(Math.pow(2, s.length()-1-i));
        }        
        hash = ((int) T) % table.length;
        //bitir
    
        //
        Node t = table[hash].head;
        while(t != null && t.key != key)
            t = t.next;
        if(t == null)
            table[hash].addFirst(key, value);
        else
            t.value = value;
    }
    
    String get(int key){
        //başla
        int hash = key;
        String s = String.valueOf(hash);
        int ns[]=new int[100];
        double T=0;
        for (int i =s.length()-1; i >=0 ; i--) {
            ns[i]=(int)s.charAt(i)-48;
            T=T+ns[i]*(Math.pow(2, s.length()-1-i));
        }        
        hash = ((int) T) % table.length;
        //bitir
        
        hash = hash % table.length;
        //
        String bulunan = "tabloda bulunamadı";
        Node current = table[hash].head;
        while( current != null){
            if( current.key == key){
                bulunan = current.value;
                break;
            }
            current = current.next;
        }
        return bulunan;
    }
    
    void printTable(){
        
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            table[i].printList();
            System.out.println("");
            
        }
    }
    
    
    class LinkedList{
        Node head;
        
        void addFirst(int key, String value){
            Node n = new Node(key, value);
            n.next = head;
            head = n;
        }
        
       Node removeFirst(){
          
            Node temp = head;
            head = head.next;
            return temp;   
       }
       
       void printList(){
           Node temp = head;
           while( temp != null){
               System.out.print( "[" + temp.key + " : " + temp.value + "] -> ");
               temp = temp.next;
           }
       }
    }
    
    class Node{
        int key;
        String value;
        Node next;
        
        Node(int key, String value){
            this.key = key;
            this.value = value;
        }
    }
}
