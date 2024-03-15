
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class HiloBarra extends Thread {
    
   private JProgressBar barra;
   private boolean avanzar;
   private boolean vive;

    public HiloBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar=true;
        vive=true;    
    }
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    
   
   
   public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                    vive=false;
                }                
            }
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
