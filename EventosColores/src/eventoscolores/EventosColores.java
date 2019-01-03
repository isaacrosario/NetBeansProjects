
package eventoscolores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosColores {

    public static void main(String[] args) {

        MarcoBotones mimarco = new MarcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



class MarcoBotones  extends  JFrame{
    public MarcoBotones()
    {
        setTitle("Botones y eventos");
        setBounds(700,300,500,300);
        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
                                     
    
    }
   
}    
    
    
class LaminaBotones  extends  JPanel implements ActionListener
{

    JButton  botonAzul = new JButton("Azul");
    JButton  botonAmarillo = new JButton("Amarillo");
    JButton  botonRojo = new JButton("Rojo");
    JButton  botonPink = new JButton("Pink");
    public LaminaBotones(){
        
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        add(botonPink);
        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
        botonPink.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object botonPulsado = e.getSource();
                
        if(botonPulsado==botonAzul){
        setBackground(Color.blue);
    }
    
    
        else if(botonPulsado==botonAmarillo){
        setBackground(Color.yellow);
        }
        else if (botonPulsado==botonPink){

            setBackground(Color.pink);
        }
        
        else if(botonPulsado==botonRojo)
        setBackground(Color.red);
}
}
