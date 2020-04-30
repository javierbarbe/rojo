package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones_tecladoYraton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventan pr = new Ventan();
	}

}

class Ventan extends JFrame{
	public Ventan() {
	setBounds(300,300,550,250);
	setVisible(true);
	PanelAccion pane = new PanelAccion();
	add(pane);
	}
}

class PanelAccion extends JPanel{
	//hay que instanciar la clase OYENTE PARA DESPUES DECIR QUIEN ES LA FUENTE DEL EVENTO
	//Y PONER EL OBJETO OYENTE A LA ESCUCHA
	AccionColor accionAmarillo =new AccionColor("amarillo", new ImageIcon("circuloamarillo.gif"), Color.YELLOW);
															// con new ImageIcon creo un objeto Icono con el archivo en la ruta
															// definida
	AccionColor accionazul =new AccionColor("azul", new ImageIcon("circuloazul.gif"), Color.blue);
	AccionColor accionrojo =new AccionColor("rojo", new ImageIcon("circulorojo.gif"), Color.red);
	
	//objetos fuente
	/*JButton btrojo = new JButton("rojo");
	JButton btamarillo = new JButton("amarillo");
	JButton btazul = new JButton("azul");*/
	// otras maneras de construir botones ( sobrecarga de constructores ) 
	JButton btrojo = new JButton(accionrojo);
	public PanelAccion() {
		
	
		//añado a la vez que creo el objeto
		add(new JButton(accionazul));
		add(new JButton(accionAmarillo));
		
		//añado al estilo "clasica"
		add(btrojo);
//		add(btamarillo);
//		add(btazul);
		
		//5.creo el mapa de entrada 
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//el objeto que va a recibir la combinacion de teclas ( en nuestro caso un boton) esta en el objeto
		//que tiene el foco
		//6.crear combinacion de teclas con la clase KeyStroke
		KeyStroke teclaAmarillo= KeyStroke.getKeyStroke("ctrl A");
		
		//7. asignar la combinacion al objeto correspondiente
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo"); //fondo_amarillo es un objeto String
		//se puede simplificar.. con los otros botones lo hare en una linea , sin necesidad de declarar objeto keystroke
		//aparte
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondo_rojo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl Z"), "fondo_azul");
		//8. asignar el objeto a la accion
		ActionMap mapaAccion =getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_rojo", accionrojo);
		mapaAccion.put("fondo_azul", accionazul);
	}
	
	// ESTA CLASE ES ADICIONAL.. NO CONSIGO HACERLO
	private class eventoMio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			PanelAccion miacc= new PanelAccion();
			miacc.btrojo.setText("me has pulsado ROjo");
		}
		
	}
	//**************** FIN CLASE ADICIONAL 
	
	//DEFINICION MAPA ENTRADA 
	/*
	 *  crear un mapa de entrada es decrile a nuestro programa cual va a ser o cuales van a ser los objetos
	 *  que tenga el foco. Cual va a ser el objeto en el que tiene que incidir  la combinacion de teclas
	 */
	//clase OYENTE
private	class AccionColor extends AbstractAction {
		public  AccionColor( String nombre, Icon icono, Color color_boton) {
			//putValue();->este metodo pone en el atributo de clase estatico NAME (Action.NAME) el valor 
			//que le pasemos como string en este caso "nombre"
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icono);
			putValue(SHORT_DESCRIPTION, "Poner la lamina de color "+nombre);
			putValue("colorDEFondo", color_boton);
		
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// se hace un casteo a lo devuelto por un metodo para almacenarlo en una variable de un tipo especifico
			//	aqui le paso la KEY del HASHMAp de AccionColor
		Color c = (Color)getValue("colorDEFondo"); //añadir el casteo es importante , convierte en objeto color el
													// valor de la clave pasada
			setBackground(c);
			
			System.out.println("Nombre :"+ getValue(NAME).toString().toUpperCase()+ " Descripcion: "+getValue(SHORT_DESCRIPTION));
		}
		
	}
	
}

