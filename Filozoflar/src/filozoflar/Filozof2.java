package filozoflar;

import java.awt.Color;
import java.util.concurrent.Semaphore;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Filozof2 extends Thread {

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

    public Filozof2(String isim, JLabel lbl,JLabel lb2) {
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

    public synchronized void dusun() {
        durumdegistir(Edurum.Dusunuyor);

    }

    public synchronized void acik() {
        durumdegistir(Edurum.Acikiyor);

    }
    
    public synchronized void ye() throws InterruptedException { 
        filozofFrame.sayi++;
            if(filozofFrame.sayi % 2 == 0)
            {
                filozofFrame.yemek1--;
                if(filozofFrame.yemek1 >= 0)
                {
                    count++;
                    filozofFrame.jLabel4.setText(filozofFrame.yemek1+"");
                    
                    int tabak2 = filozofFrame.yemek2;
                    if(tabak2 == -1)
                        tabak2++;
                    
                    filozofFrame.jLabel36.setText(tabak2+"");
                    durumdegistir(Edurum.Yiyor);
                    durum = true;
                }
                else
                {
                    filozofFrame.yemek1=-1;
                    int tabak = (filozofFrame.yemek1+1);
                    
                    int tabak2 = filozofFrame.yemek2;
                    if(tabak2 == -1)
                        tabak2++;
                        
                    filozofFrame.jLabel4.setText(tabak+"");
                    filozofFrame.jLabel36.setText(tabak2+"");
                    durum = false;
                }
                
            }
            else
            {
                filozofFrame.yemek2--;
                if(filozofFrame.yemek2 >= 0)
                {
                    count++;
                    
                    int tabak2 = filozofFrame.yemek1;
                    if(tabak2 == -1)
                        tabak2++;
                    
                    filozofFrame.jLabel4.setText(tabak2+"");
                    filozofFrame.jLabel36.setText(filozofFrame.yemek2+"");
                    durumdegistir(Edurum.Yiyor);
                    durum = true;
                }
                else
                {
                    filozofFrame.yemek2=-1;
                    int tabak = (filozofFrame.yemek2+1);
                    
                    int tabak2 = filozofFrame.yemek1;
                    if(tabak2 == -1)
                        tabak2++;
                    
                    filozofFrame.jLabel36.setText(tabak+"");
                    filozofFrame.jLabel4.setText(tabak2+"");
                    durum = false;
                }
                
            }
            
            if(filozofFrame.yemek2 <= -1 && filozofFrame.yemek1 <= -1){
                stopit();
                this.flabel.setForeground(Color.WHITE);
                this.flabel.setText("YEMEK BİTTİ");
                filozofFrame.yemek2 = 0;
                    filozofFrame.jLabel36.setText(filozofFrame.yemek2+"");
                filozofFrame.yemek1 = 0;
                    filozofFrame.jLabel4.setText(filozofFrame.yemek1+"");
                filozofFrame.mutex.release();
                return;              
            }

            
            this.labelcount.setText(count+"");
            this.yield();
            this.sleep(1000);

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
    boolean durum = true;
    @Override
    public void run() {
        try {
            while (running) {

                    if(durum){
                        dusun();
                        this.sleep(1000);
                    }
                     
                    acik();
                    this.sleep(1000);
                    filozofFrame.mutex.acquire();
                    ye();
                    filozofFrame.mutex.release();

                this.sleep(5);
            }
            System.out.println("stoped");

        } catch (InterruptedException ex) {
            Logger.getLogger(Filozof.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
}



