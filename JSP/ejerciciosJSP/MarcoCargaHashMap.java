package ejerciciosJSP;

import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class MarcoCargaHashMap extends JFrame{
	public MarcoCargaHashMap (HashMap< String, String> cargado) {
		setVisible(true);
		setBounds(500, 300, 670, 250);
		PanelCargaHashMap ma = new PanelCargaHashMap(cargado);
		//ma.cargaPadre();
		// con JscrollpPane permito que tenga deslizante en sentido horizontal y vertical
		// lo unico que hay que añadirle el elemento que quieres que tenga eso 
		JScrollPane barrascroll = new JScrollPane (ma, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(barrascroll);
	}
}