package layouts.marcoscajas;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lamina_botones extends JPanel{
	ButtonGroup grupo = new ButtonGroup();
	public Lamina_botones(String titulo, String [] opciones) {
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		//box layourt pide el contenedor padre 
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for (int i=0 ; i<opciones.length;i++) {
			JRadioButton bot = new JRadioButton(opciones[i]);
		// ------dar accion a cada boton ( el texto de la accion de comando coincide con el texto del boton-----------
			bot.setActionCommand(opciones[i]);
		//----------------------------
		//---añadir boton al panel y al grupo de botones---------
			add(bot);
			grupo.add(bot);
		//---------------------------------
		//para seleccionar por defecto la primera opcion
			bot.setSelected(i==0);
		}
	}
	public String dimeSeleccion() {
		ButtonModel miboton= grupo.getSelection();
		String s = miboton.getActionCommand();
		return s;
		//tambien se puede hacer en una sola linea
		/*
		 * return grupo.getSelection().getActionCommand();
		 */
	}

}
