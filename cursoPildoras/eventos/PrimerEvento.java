package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrimerEvento {

	public static void main ( String [] a) {
		Marco mimarco = new Marco();
		
	}
	
	
}
class Marco extends JFrame {
	LaminaBottones l2= new LaminaBottones();
	
	
	public Marco() {
		setVisible(true);
		setBounds(70, 70, 400, 400);
		LaminaBottones milaminabotones = new LaminaBottones();
		add(milaminabotones);
		
		
		
	}

	
	
	
	
}
//lamina objeto a la escucha
class LaminaBottones extends JPanel implements ActionListener{
	// objetos fuente desencadenan algo (LOS BOTONESS)
		JButton botAzul = new JButton("boton Azul");
		JButton botRoj = new JButton(" rojo");
		JButton botAmarillo = new JButton("Amarillo");
		public LaminaBottones() {
			add(botAzul);
			add(botRoj);
			add(botAmarillo);
			botAzul.addActionListener(this);
			botRoj.addActionListener(this);
			botAmarillo.addActionListener(this);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//setBounds(90, 90, 300, 300);
			Object botonPulsado = e.getSource();
			if (botonPulsado==botAzul) {
				botAzul.setText("he pulsado azul");
				setBackground(Color.blue);
			}else if(botonPulsado==botRoj) {
				setBackground(Color.red);
			}else {
				setBackground(Color.yellow);
			}
				
			
			
		}
		
}