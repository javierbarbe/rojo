package layouts.marcoscajas;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PruebaDisposiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MarcoCajas ca = new MarcoCajas();
	}

}

class MarcoCajas extends JFrame{
	
	public MarcoCajas() {
		setTitle("Marco con cajas.. .distribucion" );
		setBounds(500, 500, 250, 450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	//-------------- creo las cajas horizontales---------- 
		// va a ser tipo formulario, usario ,cajatexto \n contraseña cajatexto \n boton de ok , boton de cancelar
		Box cajaH1= Box.createHorizontalBox();
		Box cajaH2= Box.createHorizontalBox();
		Box cajaH3= Box.createHorizontalBox();
		Box cajaVertical= Box.createVerticalBox();
	//---------------------------------------
		JLabel nom= new JLabel("Nombre");
		JLabel cont= new JLabel("Contraseña");
	//--------------------------------------
		JTextField texto1= new JTextField(10);
		JTextField texto2= new JTextField(10);
	// este metodo de maximum size hace que las dimensiones no varien???
		texto1.setMaximumSize(texto1.getPreferredSize());
		texto2.setMaximumSize(texto2.getPreferredSize());
	//--------botones--------------------------
		JButton boton1= new JButton("Ok");
		JButton boton2= new JButton("Cancelar");
	//-------añado elementos a sus cajas 
		cajaH1.add(nom);
		cajaH1.add(Box.createHorizontalStrut(10));// espacia ademas arriba y abajo (padding)
		cajaH1.add(texto1);
		cajaH2.add(cont);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue());
		cajaH3.add(boton2);
	//--------------añado las cajas a la contenedora padre
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
	//---------añado el contenedor padre al marco
		add(cajaVertical);
		
	
	}
}