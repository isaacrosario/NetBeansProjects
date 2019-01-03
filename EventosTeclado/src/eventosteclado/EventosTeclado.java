
package eventosteclado;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EventosTeclado {

    
       
   public static void main(String[] args) {

        MarcoConTeclas mimarco = new MarcoConTeclas();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}



class MarcoConTeclas  extends  JFrame{
        
    
    public MarcoConTeclas()
    {        
        
        setTitle("EventosTeclado");
        setBounds(175,110,500,300);
        addKeyListener(new EventosKey());
        
                                          
    
    }
   
}    
    
    
class EventosKey  implements KeyListener
{
       
        
       
 
     @Override
    public void keyPressed(KeyEvent e) {
 
     //int codigo = e.getKeyCode();
       //  System.out.println(codigo);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println(letra);
        
        
    }

   
    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}