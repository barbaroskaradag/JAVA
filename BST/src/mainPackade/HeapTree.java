/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackade;


import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.*;

public class HeapTree{
    public static void main(final String[] arguments) {
        SwingUtilities.invokeLater(() -> new BST_Tree().createAndShowGui());       
    }
       
    void createAndShowGui() {
        final JFrame frame = new JFrame("Stack Overflow");
        frame.setBounds(50, 50, 1250, 660);
        
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        final JPanel panel = new JPanel(new BorderLayout());
        final Node tree = createTree();
        panel.add(new CustomTree(tree,650,200), BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static File file;
    static ArrayList<Ogrenci> list = new ArrayList();
    
    private Node createTree() {
        Path p5 = Paths.get(System.getProperty("user.dir"),"txt", "text.txt");
        System.out.println(p5.getRoot());
     
        file = p5.toFile();    
        
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file),  "ISO-8859-9"));
            //BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            
            while(line != null){
                String c[] = line.split("\t");
                Ogrenci ogr = new Ogrenci();
                ogr.number = c[0];
                ogr.nameandsurname = c[1];
                ogr.priority = c[2];
                list.add(ogr);
                line = in.readLine();
              }
            
        } catch (Exception e) {
        }
        
//                 önceliğe göre arraylisti sıralı hale getirme
        for(int j = 0; j < list.size(); j++) { 
            for(int i = j + 1; i < list.size(); i++) { 
                if(list.get(i).priority.compareTo(list.get(j).priority) > 0) { 
                Ogrenci t = list.get(j); 
                list.set(j, list.get(i)); 
                list.set(i,t); 
                } 
            } 
        } 
        HT listbst = new HT();
        
        for (int i = 0; i < list.size(); i++) {
            listbst.insert(list.get(i).number,list.get(i).nameandsurname,list.get(i).priority);
        }
        return listbst.root;
    }
}
