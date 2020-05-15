package layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class OpcionesRadioBoton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotonesRedondos mimarco = new MarcoBotonesRedondos();

	}

}


class MarcoBotonesRedondos extends JFrame{
	
	public MarcoBotonesRedondos() {
		setVisible(true);
		setBounds(800, 160, 200, 222);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LaminaBotonesRedondos lamina = new LaminaBotonesRedondos();
		add(lamina);
	}
	
}

class LaminaBotonesRedondos extends JPanel{
	JRadioButton botonAzul= new JRadioButton("azul");
	JRadioButton botonRojo= new JRadioButton("rojo");
	JRadioButton botonAmarillo = new JRadioButton("amarillo");
	ButtonGroup grupoBotones = new ButtonGroup();
	ButtonGroup grupo2 = new ButtonGroup();
	JRadioButton boton1= new JRadioButton("botonAbajo");
	JRadioButton boton2= new JRadioButton("botonAbajo2");
	oyenteBotonRedondo eventoOir = new oyenteBotonRedondo();
	public LaminaBotonesRedondos() {
	
		botonAzul.addActionListener(eventoOir);
		botonRojo.addActionListener(eventoOir);
		botonAmarillo.addActionListener(eventoOir);
		setLayout(new BorderLayout());
		grupo2.add(boton1);
		grupo2.add(boton2);
		JPanel panelInferior = new JPanel();
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		//add(panelInferior, BorderLayout.CENTER);
		
			// para que se relacionen los botones se agregan al grupo	
		grupoBotones.add(botonAmarillo);
		grupoBotones.add(botonRojo);
		grupoBotones.add(botonAzul);
	
		// son los botones lo que se agrega a la lamina
		panelSuperior.add(botonAmarillo);
		panelSuperior.add(botonRojo);
		panelSuperior.add(botonAzul);
//		panelInferior.add(boton1);
//		panelInferior.add(boton2);
	}
	private class oyenteBotonRedondo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getSource());
			// TODO Auto-generated method stub
			if (e.getSource()==boton1) {
				setBackground(Color.blue);
			}else if (e.getSource()==botonAmarillo) {
				setBackground(Color.yellow);
			}else if (e.getSource()==botonRojo) {
				setBackground(Color.red);
			}
			
		}
		
	}
	
}