
package cambiodeestado;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

public class CambioDeEstado {


    public static void main(String[] args) {
 
MarcoEstado mimarco = new MarcoEstado();
mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class MarcoEstado extends JFrame{
    
    public MarcoEstado(){
        setVisible(true);

        setBounds(300,300,500,350);
        
        CambioEstado nuevo_estado = new CambioEstado();
        addWindowStateListener(nuevo_estado);

    }

}

class CambioEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {

        if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
            
            System.out.println("La ventana esta maximizada");
            
        }
        else if (e.getNewState()==Frame.NORMAL) {
            System.out.println("La ventana esta normal");
            
        }
        else if (e.getNewState()== Frame.ICONIFIED) {
            
            System.out.println("La ventana esta minimizada");
            
        }
    }
   
    
    
    }
