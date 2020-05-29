package layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculadoraPildoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora2 ma = new MarcoCalculadora2();

	}

}

class MarcoCalculadora2 extends JFrame {

	public MarcoCalculadora2() {

		setVisible(true);
		setBounds(650, 300, 250, 125);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelCalculadora2 top = new PanelCalculadora2();
		add(top);
	}

}

class PanelCalculadora2 extends JPanel {
	double sumando1, sumando2;
	private JButton boton;
	private JButton pantalla;
	private JPanel medio;
	private boolean principio;
	InsertaNumero insertar = new InsertaNumero();

	public PanelCalculadora2() {
		principio = true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		medio = new JPanel();
		medio.setLayout(new GridLayout(5, 4));
		add(medio, BorderLayout.CENTER);
		ActionListener orden = new AccionOrden();
		ponBoton("7", insertar);
		ponBoton("8", insertar);
		ponBoton("9", insertar);
		ponBoton("/", orden);
		ponBoton("4", insertar);
		ponBoton("5", insertar);
		ponBoton("6", insertar);
		ponBoton("+", orden);
		ponBoton("1", insertar);
		ponBoton("2", insertar);
		ponBoton("3", insertar);
		ponBoton("-", orden);
		ponBoton("0", insertar);
		ponBoton("*", orden);
		ponBoton("=", orden);
		ponBoton("C", orden);
		ponBoton(".", insertar);

	}

	public void ponBoton(String digito, ActionListener o) {
		boton = new JButton(digito);
		boton.addActionListener(o);
		medio.add(boton); // al convertir el panel MEdio en campo de clase, puedo modificarlo a traves de
							// los
							// metodos de la clase

	}

	private class InsertaNumero implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand();
			if (principio) {
				pantalla.setText("");
				principio = false;
			}
			pantalla.setText(pantalla.getText() + entrada);

		}

	}

	private class AccionOrden implements ActionListener {
		
		double resultado;
		String signo="";
		String operacion;
		public void continuaOperacion() {
			pantalla.setText(Double.toString(resultado));
			sumando1=resultado;			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			 operacion = e.getActionCommand();
			if (operacion.equals("C")) {
				sumando1=0;
				sumando2=0;
				principio=true;
				signo="";
				pantalla.setText("0");
			}
			if( !operacion.equals("=")) {
				sumando1= Double.valueOf(pantalla.getText());
				pantalla.setText(Double.toString(sumando1));
				principio=true;
				signo=operacion;
			}
			
			else {
				sumando2=Double.valueOf(pantalla.getText());
				switch (signo) {
				case "+":
					resultado = sumando1 + sumando2;
					continuaOperacion();
					break;
				case "-": resultado= sumando1-sumando2;
						continuaOperacion();
						break;
				case "/" : 
				//	resultado= (double) resultado;
					resultado = sumando1/sumando2;
							continuaOperacion();
							break;
				case "*" : resultado = sumando1*sumando2;
							continuaOperacion();
							break;
				}
				
			}			
//
//			 if ( recogido1) {
//				sumando2 = Integer.valueOf(pantalla.getText());
//				recogido2 = true;
//				recogido1=false;
//			}
//			if (!e.getActionCommand().equals("=")) {
//				sumando1 = Integer.valueOf(pantalla.getText());
//				operacion = e.getActionCommand();
//				principio = true;
//				recogido1 = true;
//			} 
//		
//			
//			System.out.println(sumando1);
//			System.out.println(sumando2);
		
		}
	}
}
