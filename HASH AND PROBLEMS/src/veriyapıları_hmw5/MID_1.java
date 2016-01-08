
package veriyapıları_hmw5;

import java.io.IOException;

public class MID_1 {
  private DataItem[] hashArray; 

  private int arraySize;


  MID_1(int size) {
    arraySize = size;
    hashArray = new DataItem[arraySize];
  }

  void printTable(){
        for (int i = 0; i < hashArray.length; i++) {
            System.out.print("[" + i + "] ");
            if( hashArray[i] != null)
                System.out.println( hashArray[i].key + " : " + hashArray[i].value);
            else
                System.out.println("");
        }
    }
  
  public void print() {
    System.out.print("Table: ");
    for (int j = 0; j < arraySize; j++) {
      if (hashArray[j] != null)
        System.out.print(hashArray[j].getKey() + " ");
      else
        System.out.print("** ");
    }
    System.out.println("");
  }

  public int hashFunc1(int key) {
    return key % arraySize;
  }

  public int hashFunc2(int key) {
    return 6 - key % 6;
  }

  public void put(int key, String item) {
    //başla
    int hash = key*key;
    //bitir
    
    int hashVal = hashFunc1(hash); // hash the key
    int stepSize = hashFunc2(hash); // get step size
    // until empty cell or -1
    while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
      hashVal += stepSize; // add the step
      hashVal %= arraySize; // for wraparound
    }
      
    hashArray[hashVal] = new DataItem(key, item); // insert item
  }




class DataItem{
        int key;
        String value;
        
        DataItem(int key, String value){
            this.key = key;
            this.value = value;
        }
        public int getKey() {
        return key;
      }
    }
}