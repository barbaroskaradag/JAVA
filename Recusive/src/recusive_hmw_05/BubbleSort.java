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
public class BubbleSort {
  
    private static void bubbleSorted(int[] arg, int first, int last) {
      
        if(first < last && last > 0){
            if(arg[first] > arg[first+1]) {
                int temp = arg[first];
                arg[first] = arg[first+1];
                arg[first+1] = temp;
            }
            bubbleSorted(arg, first+1, last);
            bubbleSorted(arg, first, last-1);
        }else
        return;
  
    }
      
    public static void main(String[] args) {
        int arg[] = {23, 10, 66, 35, 87, 15};
          
        bubbleSorted(arg, 0, arg.length-1);
          
        for(int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] +" ");
        }
    }
}
