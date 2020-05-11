package layouts;

import java.awt.Color;
import java.awt.event.TextListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class PruebaEventosCuadroTexto {

	public static void main(String[] args) {
		MarcoPrueba mo = new MarcoPrueba();

	}

}


class MarcoPrueba extends JFrame{
	
	public MarcoPrueba () {
		
		setVisible(true);
		setBounds(800, 200, 350, 140);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LaminaPrueba lam= new LaminaPrueba();
		add(lam);
	}
	
}

class LaminaPrueba extends JPanel{
	JTextField cuadro1 = new JTextField(20);
	Document midoc= cuadro1.getDocument();
	public LaminaPrueba () {
		
		EscuchaTexto oye= new EscuchaTexto();
		
		midoc.addDocumentListener(oye);
		add(cuadro1);
	}
	
	private class EscuchaTexto implements DocumentListener{ //requiere un objeto DOcument para que le escuche

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has introducido texto");
			if (midoc.getLength()<8) {
				cuadro1.setBackground(Color.red);
			}else {
				cuadro1.setBackground(Color.green);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("has eliminado texto");
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}