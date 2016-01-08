
package mainPackade;

public class SD {

    //Chaining
    LinkedList [] table;
    
    SD(int size){
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList();
        }
    }
    
    void put(int key, String value){
        //başla
        String temp = String.valueOf(key);
        temp = temp.substring(1,3) + temp.substring(5, 7);
        int hash = Integer.parseInt(temp);
        //bitir
        
        hash = hash % table.length;
        //
        Node t = table[hash].head;
        while(t != null && t.key != key)
            t = t.next;
        if(t == null)
            table[hash].addFirst(key, value);
        else
            t.value = value;
    }
    
    String get(long key){
        //başla
        String temp = String.valueOf(key);
        temp = temp.substring(1,3) + temp.substring(5, 7);
        int hash = Integer.parseInt(temp);
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
            MainFrame.jTextArea1.append("[" + i + "] ");
            System.out.print("[" + i + "] ");
            table[i].printList();
            MainFrame.jTextArea1.append("\n");
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
       
       void printList(){
           Node temp = head;
           while( temp != null){
               MainFrame.jTextArea1.append("[" + temp.key + " : " + temp.value + "]  ->  ");
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
