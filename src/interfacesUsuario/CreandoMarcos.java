package interfacesUsuario;
import java.awt.Frame;

import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		miMarco marco1= new  miMarco();
//		marco1.setVisible(true);
//		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * que hace el programa cuando cierro la ventana con el caso exitonclose
		 * lo que hace es terminar el programa (System.exit)
		 */
	}

}

class miMarco extends JFrame{
	
	
	public miMarco() {
		
//		miMarco.super.setSize(width, height);
		setSize(500,300);
/*
 * meter las siguientes instruccciones en la clase miMarco, hace que no haga falta 
 * declararlas en el metodo main
 */
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500,300);
		
		/*
		 * para colocar la ventana en otro punto que no sea el por defecto
		 */
		setTitle("Mi titulo de ventana");
//		setBounds(196, 155, 500, 300); //permite colocarlo como si usara setLocation
		//permite redefinir el tamaño de la ventana
		
//		setResizable(false); // permitir o no el aumento o disminucion tamaño pantalla
		
//		setExtendedState(Frame.MAXIMIZED_BOTH); // lo pone a tamaño de pantalla completa
//		setExtendedState(Frame.MAXIMIZED_HORIZ);// este no funciona 
		setExtendedState(4);
	
	}
}