
package recusive_hmw_05;


public class Stack_ {
    public static void main(String[] args) {


    System.out.println(sum(4));

}//main

public static int sum(int n) {
    int sum;
    System.out.println("n = " + n + "\n");
    if (n == 1)
        sum = 1;
    else
        sum = sum(n - 1) + n;   
    System.out.println("n after function = " + n );
    
    System.out.println("sum after function = " + sum );
    
    return sum;
}    
}
