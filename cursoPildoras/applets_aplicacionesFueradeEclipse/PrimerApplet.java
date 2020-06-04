package applets_aplicacionesFueradeEclipse;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class PrimerApplet extends JApplet {

// los applets no llevan metodo main, llevan un metodo INIT
	//se ejecutan en el navegador
	//toddas las clases que construyen un applet tienen que heredar de japplet
//no funciona
	// si llevara archivos que son externos habria que añadirlos luego al jar de manera manual mirar 
	// pildoras video 140
	public void init() {
		JLabel lo= new JLabel("Hola alumnos");
		add(lo);
	}
}
