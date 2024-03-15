
import java.io.File;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

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
    private JTextArea archivo;
    private String archivos;
    
    public HiloBarra(JProgressBar barra, String texto, JTextArea area) {
        this.vive = true;
        this.avanzar = true;
        this.barra = barra;
        this.archivos = texto;
        this.archivo = area;
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

    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100) {
                   archivo.append(archivos);
                    vive = false;
                }  
                }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
}


