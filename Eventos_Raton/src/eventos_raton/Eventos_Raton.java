/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_raton;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class Eventos_Raton {

    
     
     
    public static void main(String[] args) {
    
         MarcoRaton Raton = new MarcoRaton();
        Raton.setVisible(true);
        Raton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}


class MarcoRaton extends JFrame{
        
EventosDeRaton raton = new EventosDeRaton();
    public MarcoRaton()
    {        
        
        setTitle("EventosTeclado");
        setBounds(175,110,500,300);  
        addMouseListener(raton);
    
    }

    
   
}    
    
    
class EventosDeRaton  implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hiciste un click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar el mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de liberar el raton");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

       
    


}

