/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusive_hmw_05;

import java.util.Arrays;

/**
 *
 * @author ahmet.yazici
 */
public class SelectionSort {
public static void selectionSort(int[] data, int low, int high) {
    if (low < high) {
        swap(data, low, findMinIndex(data, low));
        selectionSort(data, low + 1, high);
    }
}

public static void swap(int[] array, int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
}

public static int findMinIndex(int[] data, int index) {
        int minIndex;
        if (index == data.length - 1)
        return index;
        minIndex = findMinIndex(data, index + 1);
        if (data[minIndex] < data[index])
        return minIndex;
        else
        return index;
}



public static void main (String[] args) {
    int[] numbers = {3, 15, 1, 9, 6, 12, 21, 17, 8}; 
    SelectionSort.selectionSort(numbers, 0, numbers.length);
    System.out.println(Arrays.toString(numbers));
}
}
