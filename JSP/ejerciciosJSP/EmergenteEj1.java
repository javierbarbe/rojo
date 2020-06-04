package ejerciciosJSP;


import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EmergenteEj1 extends JFrame{
public EmergenteEj1() {
	setVisible(true);
	setBounds(500, 500, 350, 220);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
//	setLayout(new BorderLayout());
	PanelEj1 pa = new PanelEj1(new ImageIcon("imagenes/candadoabierto.gif"), "Control de ACCESO","Acceso Concedido");
	JPanel hola = new JPanel();
	add(hola);
	add(pa);
	
	
}
}
