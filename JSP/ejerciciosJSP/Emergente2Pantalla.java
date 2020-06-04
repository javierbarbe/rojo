package ejerciciosJSP;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Emergente2Pantalla extends JFrame {
	PanelCandadoAbierto2pantalla pa;
	public Emergente2Pantalla(String direccionImagen, String titulo, String descripcion) {
		setVisible(true);
		setBounds(500, 500, 350, 350);
		pa = new PanelCandadoAbierto2pantalla(direccionImagen, titulo, descripcion);
	
		add(pa);

	}
	public Emergente2Pantalla(String textoPrecaja, String titulo) {
		setVisible(true);
		setBounds(500, 500, 350, 350);
		 pa = new PanelCandadoAbierto2pantalla(textoPrecaja, titulo);
	//	pa.add(new JLabel(textoPrecaja));
		//pa.add(new JTextField());
		add(pa);
	}
//	private class OyeBotonAceptar implements ActionListener {
//		static int pulsado=0;
//		 String introducido;
//		String intro2;
//		EmergenteEj1 cantidadPiramide;
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(pulsado);
//				
//				if (pulsado==0) {
//					cantidadPiramide=  new EmergenteEj1("Altura", "Introduccion de Altura");
//			//	EmergenteEj1 cantidadPiramide = new EmergenteEj1("Altura", "Introduccion de Altura");
//				 introducido=cantidadPiramide.pa.cajaTextoIntroducido.getText();
//				 intro2=introducido;
//				 System.out.println(intro2);
//				pulsado++;
//				}else {
//					JFrame marcPiramide = new JFrame();
//					
//					System.out.println("Es el momento de sacar otra emergente"+ intro2);
//				}
//			}
//
//		}
}
