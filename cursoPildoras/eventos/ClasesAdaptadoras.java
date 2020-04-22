package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ClasesAdaptadoras {

	public static void main (String args[]) {
		MarcoVentanaAdapt mrac= new MarcoVentanaAdapt();
	}
	
}

class MarcoVentanaAdapt extends JFrame {
	
	
	public MarcoVentanaAdapt() {
		setVisible(true);
		setBounds(500, 100, 500, 570);
		setTitle("ventana Adaptadador");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowListener(new M_ventana3());
	}
}

class M_ventana3 extends WindowAdapter {
	

		public void windowIconified(WindowEvent e){
			System.out.println("ventana minimizada");
		
	}
}