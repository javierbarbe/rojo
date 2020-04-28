package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
//oyente implementa el listener
public class FocoVentana extends JFrame implements WindowFocusListener{

	
	public static void main (String args[]) {
		
		FocoVentana fer= new FocoVentana();
		fer.iniciar();
		
	}

	public void iniciar() {
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(200,400,350,350);
		marco2.setBounds(700, 400, 350, 350);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// pongo los marcos a la escucha del evento
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
		
		//la clase oyente es la propia clase OPERADOR THIS
		//vamos a hacer que la ventana que tenga el foco le pongamos titulo y cuando lo pierda
		//cambiarla
		
		
		
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		//identifico que marco tiene el foco con getSOurce
		if(e.getSource()==marco1) {
			marco1.setTitle("tengo el foco");
		}else {
			marco2.setTitle("tengo el foco");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource()==marco1) {
			 marco1.setTitle("");
		 }else {
			 marco2.setTitle("");
		 }
	}
	
	FocoVentana marco1;
	FocoVentana  marco2;
}
