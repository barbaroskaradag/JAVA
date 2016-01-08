/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackade;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author SIJEY
 */
public class BST {
    Node root;
    public BST()
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
                if(val.compareTo(current.item.nameandsurname) < 0)
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

        
    //---------------------------------------------------------------------------------------------------------------------------
    
    DefaultListModel<String> result1 = new DefaultListModel<>();
    public DefaultListModel<String> inorderTraversal(Node root) {
        if(root !=null){
            helper1(root);
        }
 
        return result1;
    }
 
    public void helper1(Node p){
        
        if(p.left!=null)
            helper1(p.left);
        result1.addElement("- "+p.item.nameandsurname);
        if(p.right!=null)
            helper1(p.right);
    }    
    
    //---------------------------------------------------------------------------------------------------------------------------
    
    DefaultListModel<String> result2 = new DefaultListModel<>();
    public DefaultListModel<String> postorderTraversal(Node root) {
        if(root !=null){
            helper2(root);
        }
 
        return result2;
    }
 
    public void helper2(Node p){
        
        if(p.left!=null)
            helper2(p.left);
        if(p.right!=null)
            helper2(p.right);
        result2.addElement("- "+p.item.nameandsurname);
    }    
    
    //---------------------------------------------------------------------------------------------------------------------------
    
    DefaultListModel<String> result3 = new DefaultListModel<>();
    public DefaultListModel<String> preorderTraversal(Node root) {
        if(root !=null){
            helper3(root);
        }
 
        return result3;
    }
 
    public void helper3(Node p){
        result3.addElement("- "+p.item.nameandsurname);
        if(p.left!=null)
            helper3(p.left);
        if(p.right!=null)
            helper3(p.right);
    }    
    
    //---------------------------------------------------------------------------------------------------------------------------
    DefaultListModel<String> result4 = new DefaultListModel<>();
     public DefaultListModel<String>  printLevelOrder(Node root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
        
        return result4;

    }
    int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1) 
        {
            result4.addElement("- " + root.item.nameandsurname);
            System.out.print(root.item.nameandsurname + " - ");
        }
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    
    //------------------------------------------------------------------------------------
    
    


}
