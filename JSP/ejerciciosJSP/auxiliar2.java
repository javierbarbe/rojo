package ejerciciosJSP;

import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class auxiliar2 extends JPanel{
	JLabel usuario = new JLabel("Usuario");
	JLabel contra = new JLabel("Contraseña");
	JPanel capa = new JPanel();
	JFrame fondo = new JFrame();
	public auxiliar2(HashMap<String, String> recibido) {
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		capa.setLayout(new BoxLayout(capa, BoxLayout.Y_AXIS));
		for (int i =0 ; i< recibido.size(); i++) {
			JPanel lamina$i= new JPanel();
			JLabel usuario$i= new JLabel("usuarioooooooooos");
			lamina$i.add(usuario$i);
			lamina$i.add(contra);
			lamina$i.add(usuario);
			lamina$i.add(contra);
			capa.add(lamina$i);
			//add(capa);
			System.out.println("añadida lamina "+i);
		}
		fondo.add(capa);
		fondo.setVisible(true);
		fondo.setBounds(500, 300, 350, 350)	;
		
	}
}