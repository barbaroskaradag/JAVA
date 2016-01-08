
package recusive_hmw_05;


public class stack_pop {
    
    int array [];
    int size;
    stack_pop(int capacity){
        array = new int[capacity];
    }
    int pop(){
        if( size > 0 ){
           size--;
           return array[size]; 
        }
        else
            throw new stackException("Stack is empty");
    }
    public static void main(String[] args) {
        stack_pop st=new stack_pop(12);
        
        st.pop();
    }
}
class Node {
    
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
    }
}
class stackException extends RuntimeException{
        stackException(String message){
            super(message);
        }
    }