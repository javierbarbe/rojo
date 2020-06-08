package ejerciciosJSP;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Emergente2Pantalla extends JFrame {
	ConstruyePanelesConOSinImagen pa;
	public Emergente2Pantalla(String direccionImagen, String titulo, String descripcion) {
		setVisible(true);
		setBounds(500, 300, 350, 350);
		pa = new ConstruyePanelesConOSinImagen(direccionImagen, titulo, descripcion);
	
		add(pa);

	}
	public Emergente2Pantalla(String textoPrecaja, String titulo) {
		setVisible(true);
		setBounds(500, 300, 350, 350);
		 pa = new ConstruyePanelesConOSinImagen(textoPrecaja, titulo);
	//	pa.add(new JLabel(textoPrecaja));
		//pa.add(new JTextField());
		add(pa);
	}
	public Emergente2Pantalla( String titulo) {
		setVisible(true);
		setBounds(500, 300, 350, 350);
		 pa = new ConstruyePanelesConOSinImagen( titulo);
	//	pa.add(new JLabel(textoPrecaja));
		//pa.add(new JTextField());
		add(pa);
	}

}
