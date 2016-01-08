package mainPackade;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CustomTree extends JPanel {
    private Node tree;
    private int radius = 10;
    private int rootbaslangic;
    int horizontalGapValue = 0;
    public CustomTree(Node tree,int rootbaslangic, int horizontalGapValue) {
        this.tree = tree;
        this.rootbaslangic = rootbaslangic;
        this.horizontalGapValue = horizontalGapValue;
    }

    @Override
    protected void paintComponent(Graphics g) {
        displayTree(g, tree, rootbaslangic, 10, 1);
    }

    //**************************************************************************
    public void displayTree(Graphics g, Node localTree, int x, int y, int level) {
        // baloncuklar arasındaki yükseklik mesafesi
        int verticalGap = 100;
        // parent için iki çocuğun dallanması
        int horizontalGap = horizontalGapValue / level;
        //int horizontalGap = (int) (600 / Math.pow(2, level));
        // yuvarlak çizme
        g.drawOval(x, y, radius, radius);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Tohama",Font.PLAIN,9));
        String [] ad = localTree.item.nameandsurname.split(" ");
        g.drawString(localTree.item.number+ "\n", x-10 + (radius / 4), y + 20);
        int i = 0;
        for (; i < ad.length; i++) {
            
            if(i == 0)
                g.drawString(ad[i]+ "\n", x-10 + (radius / 4), y + 40);
            else if(i == 1)
                g.drawString(ad[i]+ "\n", x-10 + (radius / 4), y + 60);
            else
                g.drawString(ad[i]+ "\n", x-10 + (radius / 4), y + (i*20)+40);
        }
       

        if (localTree.left != null) {
            // Draw a line to the left node
            lineToLeftChild(g, x - horizontalGap, y + verticalGap, x, y);
            // Draw the left subtree recursively
            displayTree(g, localTree.left, x - horizontalGap, y + verticalGap,
                        level + 1);
        }

        if (localTree.right != null) {
            // Draw a line to the right node
            lineToRightChild(g, x + horizontalGap, y + verticalGap, x, y);
            // Draw the right subtree recursively
            displayTree(g, localTree.right, x + horizontalGap, y + verticalGap,
                        level + 1);
        }
    }//end displayTree()
    //**************************************************************************

    //Line to child
    //**************************************************************************
    private void lineToLeftChild(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1 + (radius / 2), y1, x2, y2 + (radius / 2));
        g.setColor(Color.RED);
    }//end LinetoLeft
    //**************************************************************************

    //Line to child
    //**************************************************************************
    private void lineToRightChild(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1 + (radius / 2), y1, (x2 + radius), y2 + (radius / 2));
        g.setColor(Color.RED);
    }//end line to Right()
    //**************************************************************************
}