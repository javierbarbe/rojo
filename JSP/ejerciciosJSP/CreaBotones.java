package ejerciciosJSP;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class CreaBotones {
	JButton aceptar = new JButton();

	public JButton iniciaBoton() {
		aceptar = new JButton("ACEPTAR", new ImageIcon("imagenes/check.gif"));
		aceptar.setHorizontalTextPosition(SwingConstants.LEFT);
		aceptar.setBackground(Color.green.brighter());
		return aceptar;
}
}