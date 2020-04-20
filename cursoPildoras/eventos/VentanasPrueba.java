/**
 * 
 */
package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * @author Javi
 *
 */
public class VentanasPrueba {

	
	public static void main (String [] args) {
		MarcoVentana miventan = new MarcoVentana();
		MarcoVentana mimarco2= new MarcoVentana();
		
	}
}
class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		setVisible(true);
		setBounds(200, 200, 300, 200);
		setTitle("Ventana Responde");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //esto hace que no acabe el programa si hay mas
		//y cierro una de los marcos
		M_ventana oyente_ventana= new M_ventana();
		addWindowListener(oyente_ventana);
	}
}

class M_ventana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("cerrando ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("la ventana se ha cerrado");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana restaurada");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana desactivada");
	}
	
}