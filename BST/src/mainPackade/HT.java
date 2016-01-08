/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackade;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class HT {
    Node root;
    public HT()
    { 
        root = null; 
    }
 
    public void insert(String number,String val,String priority){
        
        Node newNode = new Node();
        newNode.item = new Ogrenci();
        newNode.item.nameandsurname = val;
        newNode.item.number = number;
        newNode.item.priority = priority;
        
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            Node current = root;
            Node parent;
            while(true)
            {
                parent = current;
                if(number.compareTo(current.item.number) < 0)
                {
                    current = current.left;
                    if(current == null)
                    {
                        parent.left = newNode;
                        return;
                    }
                }
                else
                {
                    current = current.right;
                    if(current == null)
                    {
                        parent.right = newNode;
                        return;
                    }
                }
            }//while
            
        }//else
    
    }//metot

        
    

}
