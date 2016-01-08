package filozoflar;

import java.awt.Color;
import java.util.concurrent.Semaphore;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Filozof extends Thread {

    public static Object Spoon = new Object();
    public static Semaphore s = new Semaphore(2);

    public enum Edurum {

        Dusunuyor(0),
        Acikiyor(1),
        Yiyor(2);
        private int value;

        private Edurum(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    };

    private boolean running = false;
    private boolean pauseresume = false;
    String isim = "";
    String fdurum = "Düşünüyor";
    JLabel flabel,labelcount;

    public Filozof(String isim, JLabel lbl,JLabel lb2) {
        running = true;
        pauseresume = true;
        this.isim = isim;
        fdurum = "Düşünüyor";
        this.flabel = lbl;
        this.flabel.setText(fdurum);
        this.labelcount = lb2;
        this.labelcount.setText(count+"");
        this.start();
    }

    public void stopit() {
        pauseresume = false;
        running = false;
    }

    public void pauseresumeit() {
        pauseresume = !pauseresume;
    }

    public synchronized void dusun() {
        durumdegistir(Edurum.Dusunuyor);
        System.out.println(this.isim + " filozof düşünüyor");
    }

    public synchronized void acik() {
        durumdegistir(Edurum.Acikiyor);
        System.out.println(this.isim + " filozof acıkıyor");
    }

    public void ye() throws InterruptedException {
        s.acquire();
            
            filozofFrame.yemek1--;
            if(filozofFrame.yemek1 >= 0)
            {
                filozofFrame.jLabel4.setText(filozofFrame.yemek1+"");
                filozofFrame.jLabel36.setText(filozofFrame.yemek2+"");
            }
            else{
                stopit();
                this.flabel.setForeground(Color.WHITE);
                this.flabel.setText("YEMEK BİTTİ");
                s.release(2);
                return;              
            }
            
            durumdegistir(Edurum.Yiyor);
            System.out.println(this.isim + " filozof yiyor");
            count++;
            this.labelcount.setText(count+"");
            this.yield();
            this.sleep(1000);
        s.release();
    }

    private void durumdegistir(Edurum d) {
        switch (d.getValue()) {
            case 0:
                this.fdurum = "DÜŞÜNÜYOR";
                this.flabel.setForeground(Color.GREEN);
                break;
            case 1:
                this.fdurum = "AÇIKIYOR";
                this.flabel.setForeground(Color.ORANGE);
                break;
            case 2:
                this.fdurum = "YİYOR";
                this.flabel.setForeground(Color.RED);
                break;

        }
        this.flabel.setText(fdurum);
        
    }
    
    
    int count = 0;
    @Override
    public void run() {
        try {
            while (running) {

                while (pauseresume) {

                    dusun();
                    this.sleep(1000);
                    acik();
                    this.sleep(1000);
                    ye();
                    
                }
                this.sleep(5);
            }
            System.out.println("stoped");

        } catch (InterruptedException ex) {
            Logger.getLogger(Filozof.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
