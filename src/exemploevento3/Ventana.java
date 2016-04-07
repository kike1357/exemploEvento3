package exemploevento3;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author epastorizalorenzo
 */
public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton boton,boton2;
    JLabel etiqueta;
    
public void amosar(){
    //compoñentes
    marco = new JFrame("evento ventá externa");
    panel = new JPanel();
    boton= new JButton("PREME");
    etiqueta = new JLabel();
    marco.setSize(600, 600);
    //layouts
    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
    //engadimos compoñentes
    panel.add(etiqueta);
    panel.add(boton);
    marco.add(panel);
    //asociamos listener
    boton.addActionListener((ActionListener) new ClaseExterna());
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
}
}
