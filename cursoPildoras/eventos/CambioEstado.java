package eventos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main (String args []){
		MarcoEstado marco = new MarcoEstado();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	
}


class MarcoEstado extends JFrame{
	
	
	public MarcoEstado() {
		setVisible(true);
		setBounds(300,300,300,300);
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);
	}
}
class CambiaEstado implements WindowStateListener{

	public CambiaEstado() {
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public void windowStateChanged(WindowEvent e) {
		//System.out.println("La ventana ha cambiado de estado");
//		System.out.println(e.getNewState());
		if(e.getNewState()==6) {
			System.out.println("la ventana ha sido maximizada");
		}
		else if(e.getNewState()==Frame.NORMAL) {
			System.out.println("la ventana esta normal");
		}
		else if (e.getNewState()==Frame.ICONIFIED) {
			System.out.println("la ventana ha sido minimizada");
		}
	}
	
}