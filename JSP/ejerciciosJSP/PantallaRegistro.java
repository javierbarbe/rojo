package ejerciciosJSP;

import javax.swing.JFrame;

public class PantallaRegistro extends JFrame{

	public PantallaRegistro() {
		setVisible(true);
		setBounds(300, 300, 350, 350);
		PanelRegistro panel = new PanelRegistro(this);
		add(panel);
	}
	
}
