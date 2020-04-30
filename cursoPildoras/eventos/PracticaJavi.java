package eventos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import org.w3c.dom.views.AbstractView;

public class PracticaJavi {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marquito mo = new Marquito();
	}

}

class Marquito extends JFrame{
	
	public Marquito () {
		setTitle("Recoge Nombre");
		setVisible(true);
		setBounds(222,222,292,222);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Paneli lami = new Paneli();
		add(lami);
	}
	
}

 class Paneli extends JPanel{
	JButton cheqeaNombre= new JButton("chequea Nombre");
	JTextField areaNombre=new JTextField() ;
	JButton azulFondo= new JButton("azul");
	
	
	
	public void  paintComponent(Graphics g) {
		
		super.paintComponent(g);
		setLayout(null);
		
		cheqeaNombre.setBounds(40, 145, 195, 15);
		areaNombre.setBounds(13, 33, 190, 25);
		azulFondo.setBounds(203, 33, 66, 18);
		add(areaNombre);
		add(cheqeaNombre);
		add(azulFondo);
	}
	public Paneli() {
		//hay que añadir inputMap y actionMap para añadir las combinacions de teclas
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl K"), "color_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl Q"), "color_rojo");
		AccionColorante colorazul= new AccionColorante(Color.blue);
		AccionColorante colorrojo= new AccionColorante(Color.red);
		ActionMap mapaAccion= getActionMap();
	
		mapaAccion.put("color_rojo", colorrojo);
		mapaAccion.put("color_azul", colorazul);
		OyenteBoton oye = new OyenteBoton();
		cheqeaNombre.addActionListener(oye);
		cambiacolor cm = new cambiacolor();
		azulFondo.addActionListener(cm);
		
		//add(cheqeaNombre);
	}
	
private	class OyenteBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String pao= "mama2";
			System.out.println(areaNombre.getText());
			String nombre = areaNombre.getText();
			Pattern nombreSinSimbolos= Pattern.compile("[a-zA-Z]{1,}");
			Matcher mat= nombreSinSimbolos.matcher(nombre);
			if(mat.matches()) {
				System.out.println("el nombre no contiene nada mas que letras");
				setBackground(Color.cyan);
			}else {
				System.out.println("el nombre contiene caracteres no validos");
				setBackground(Color.MAGENTA);
			}
		
		}
		
	}


private class cambiacolor implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setBackground(Color.blue);
	}
	
}
private class AccionColorante extends AbstractAction{

 public AccionColorante(Color colorpasado) {
		// TODO Auto-generated constructor stub
	 putValue("color_fondo", colorpasado);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color c = (Color) getValue("color_fondo");
		
		setBackground(c);
	}
	
}
}
