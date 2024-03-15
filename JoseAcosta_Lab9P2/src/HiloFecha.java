
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class HiloFecha implements Runnable{
    private JLabel fecha;

    public HiloFecha(JLabel fecha) {
        this.fecha = fecha;
    }

    public JLabel getFecha() {
        return fecha;
    }

    public void setFecha(JLabel fecha) {
        this.fecha = fecha;
    }

    @Override
    public void run() {
        while(true){
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("dd/MM/yy");
            fecha.setText(f.format(h));
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                }
            
        }
        }

    
    
    
    
}
