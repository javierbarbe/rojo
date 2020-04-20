package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConClasesInternas {

	public static void main ( String [] a) {
		Marco2 mimarco = new Marco2();
	}
	
	
}
class Marco2 extends JFrame{
	public Marco2() {
		setVisible(true);
		setBounds(70, 70, 400, 400);
		LaminaBottones2 milaminabotones = new LaminaBottones2();
		add(milaminabotones);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
 class LaminaBottones2 extends JPanel {

		JButton botAzul = new JButton(" Azul");
		JButton botRoj = new JButton(" rojo");
		JButton botAmarillo = new JButton("Amarillo");
		public LaminaBottones2() {
			add(botAzul);
			add(botRoj);
			add(botAmarillo);
			ColorFondo rojo = new ColorFondo(Color.red);
			ColorFondo azul = new ColorFondo(Color.blue);
			ColorFondo amarillo= new ColorFondo(Color.yellow);
			botAzul.addActionListener(azul);
			botRoj.addActionListener(rojo); 
			botAmarillo.addActionListener(amarillo);
		}
	
	
	private	class ColorFondo implements ActionListener{

			
			public ColorFondo(Color c) {
				colorDeFondo=c;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				
				setBackground(colorDeFondo);
			}
			private Color colorDeFondo;
		}
		
}

