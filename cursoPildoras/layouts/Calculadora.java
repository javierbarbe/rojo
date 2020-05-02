package layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora ma = new MarcoCalculadora();
		String cuenta = "1+2";
		String[] operacion = cuenta.split("\\+");
		System.out.println(operacion[0]);
		System.out.println(operacion[1]);

	}

}

class MarcoCalculadora extends JFrame {

	public MarcoCalculadora() {
		setVisible(true);
		setBounds(700, 250, 356, 290);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		PanelSuperior panelcal = new PanelSuperior();
		add(panelcal);
		// pack(); este metodo jausta el tamaño de la ventana al contenido de la misma
//		PanelCentral pancentral= new PanelCentral();
//		add(pancentral, BorderLayout.CENTER);
	}
}

class PanelSuperior extends JPanel {
	JPanel panelcen = new JPanel();
	JButton pantalla;

	public PanelSuperior() {
		pantalla = new JButton("0");
		setLayout(new BorderLayout());

		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
//		PanelCentral centr= new PanelCentral();
//		centr.setLayout(new GridLayout(4, 4));
//		add(centr);
		PanelCentral mipanelmedio = new PanelCentral();
		// panelcen.setLayout(new GridLayout(4,2));
		add(mipanelmedio, BorderLayout.CENTER);

	}

	private void aniadeBotones(String rotuloBoton) {
		JButton boton = new JButton(rotuloBoton);
		panelcen.add(boton);
	}

	// clase que gestione los eveentos oyente
	private class OyenteBotones implements ActionListener {
		String valorpantalla2;
		String entrada;
		int sumando1 = 0;
		int sumando2 = 0;
		boolean operandocogido=false;
		private boolean primersumandorecogido = false, segundosumandorecogido=false;
		String operando = "";
		
		private void ponAFalso(int resultado) {
			primersumandorecogido=false;
			operandocogido=false;
			pantalla.setText(Integer.toString(resultado));
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			int resultado = 0;

			entrada = e.getActionCommand();
			valorpantalla2 = pantalla.getText();
			if (valorpantalla2.equals("0")) {
				pantalla.setText(entrada);
			} else {
				if (!entrada.equals("+") && !entrada.equals("-") && !entrada.equals("/") && !entrada.equals("=")) {
					pantalla.setText(valorpantalla2.concat(entrada));
				} else {
					if (!primersumandorecogido) {
						sumando1 = Integer.valueOf(pantalla.getText());
						pantalla.setText("");
						primersumandorecogido = true;
					} else {
						sumando2 = Integer.valueOf(pantalla.getText());
						pantalla.setText("");
						segundosumandorecogido=true;
					}
					if(!operandocogido) {
						operando = entrada;
						operandocogido=true;
					}
				}
			}

				if (primersumandorecogido) {
					System.out.println(sumando1 + " valor de sumando 1");
				}
				if(segundosumandorecogido) {
					System.out.println(sumando2+ " valor sumando 2 ");
				}
				valorpantalla2 = pantalla.getText();
				// String [] valorpantalla= pantalla.getText().split("\\+\\-\\*");

				System.out.println("valor pantalla");

				System.out.println(valorpantalla2);

				System.out.println("ya se ha impreso el valor del boton-pantalla");

			
				if (entrada.equals("=")) {

					switch (operando) {
					case "+": resultado = sumando1+sumando2;
						
						ponAFalso(resultado);
						break;
					case "-": resultado= sumando1-sumando2;
						System.out.println(sumando1-sumando2 + " esto es la resta");
						ponAFalso(resultado);
						break;
					case "*":  resultado= sumando1*sumando2;
							ponAFalso(resultado);
							break;
					case "/": resultado= sumando1/sumando2;
							ponAFalso(resultado);
							break;
					}

				}
				if(entrada.equals("C")) {
					pantalla.setText("");
				}
			
			
		}
	}

	private class PanelCentral extends JPanel {

		public PanelCentral() {
			OyenteBotones insertar = new OyenteBotones();
//			setLayout(null);
			setLayout(new GridLayout(4, 4));
			aniadeBotones("7", insertar);
			aniadeBotones("8", insertar);
			aniadeBotones("9", insertar);
			aniadeBotones("/", insertar);
			aniadeBotones("4", insertar);
			aniadeBotones("5", insertar);
			aniadeBotones("6", insertar);
			aniadeBotones("+", insertar);
			aniadeBotones("1", insertar);
			aniadeBotones("2", insertar);
			aniadeBotones("3", insertar);
			aniadeBotones("-", insertar);
			aniadeBotones("0", insertar);
			aniadeBotones(".", insertar);
			aniadeBotones("=", insertar);
			aniadeBotones("C", insertar);
			// aniadeBotones("*");
		}

		public void aniadeBotones(String rotuloBoton, ActionListener oyente) {
			JButton boton = new JButton(rotuloBoton);
			boton.addActionListener(oyente);
			this.add(boton);
		}
	}

}
