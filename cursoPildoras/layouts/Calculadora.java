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
		MarcoCalculadora ma= new MarcoCalculadora();
		String cuenta= "1+2";
		String [] operacion = cuenta.split("\\+");
		for ( String i : operacion) {
			System.out.println(i);
		}

	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		setVisible(true);
		setBounds(700, 250, 356, 290);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		PanelSuperior panelcal = new PanelSuperior();
		add(panelcal);
		//pack(); este metodo jausta el tamaño de la ventana al contenido de la misma
//		PanelCentral pancentral= new PanelCentral();
//		add(pancentral, BorderLayout.CENTER);
	}
}

class PanelSuperior extends JPanel{
	JPanel panelcen= new JPanel();
	JButton pantalla;
	
	public PanelSuperior() {
		pantalla= new JButton("0");
		setLayout(new BorderLayout());
		
		pantalla.setEnabled(false);
		add ( pantalla, BorderLayout.NORTH);
//		PanelCentral centr= new PanelCentral();
//		centr.setLayout(new GridLayout(4, 4));
//		add(centr);
		PanelCentral mipanelmedio= new PanelCentral();
		//panelcen.setLayout(new GridLayout(4,2));
		add(mipanelmedio, BorderLayout.CENTER);

		
		
		
	}
	private void aniadeBotones (String rotuloBoton) {
		JButton boton = new JButton(rotuloBoton);
		panelcen.add(boton);
	}
	//clase que gestione los eveentos  oyente
	private class OyenteBotones implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int resultado=0;
			int sumando1;
			int sumando2;
		//	String [] valorpantalla= pantalla.getText().split("\\+\\-\\*");
			String valorpantalla2= pantalla.getText();
			
			System.out.println("valor pantalla");
			
			System.out.println(valorpantalla2);
//			for (String i : valorpantalla) {
//				System.out.println(i);
//			}
			System.out.println("ya se ha impreso el valor del boton-pantalla");
			
			if (entrada =="+") {
			sumando1= Integer.valueOf(valorpantalla2);
						//sumando2 = Integer.valueOf(valorpantalla[2]);
				pantalla.setText("");
				
			}
			
			if ( valorpantalla2.equals("0")) {
				pantalla.setText(entrada);
				}else {
					pantalla.setText(valorpantalla2.concat(entrada));
				}
			
		}
		String entrada;
	}
	
	
	private class PanelCentral extends JPanel{
		
		public PanelCentral () {
			OyenteBotones insertar = new OyenteBotones();
//			setLayout(null);
			setLayout(new GridLayout(4,4));
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
			aniadeBotones("=",insertar);
		//	aniadeBotones("*");
		}
		public void aniadeBotones (String rotuloBoton, ActionListener oyente) {
			JButton boton = new JButton(rotuloBoton);
			boton.addActionListener(oyente);
			this.add(boton);
		}
	}
	
}


 


