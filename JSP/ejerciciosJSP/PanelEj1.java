package ejerciciosJSP;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class PanelEj1 extends JPanel{

	
	public PanelEj1(ImageIcon rutaImagen, String textoLabelTitulo, String textoInformativo) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel imagenPanel= new JLabel(rutaImagen);
		JLabel titularPanel = new JLabel(textoLabelTitulo);
		titularPanel.setFont(new Font ("Cambria",Font.BOLD, 25));
		JLabel informacion= new JLabel(textoInformativo);
		;
		JButton aceptar= new JButton("ACEPTAR",new ImageIcon("imagenes/check.gif") );
		aceptar.setHorizontalTextPosition(SwingConstants.LEFT);
		aceptar.setBackground(Color.green.brighter());
		
		
		aceptar.addActionListener(new OyeBotonAceptar());
		
		
		add(titularPanel);
		add(imagenPanel);
		add(informacion);
		add(aceptar);
	}
}
