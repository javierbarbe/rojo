package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CuadrosTexto {

	public static void main(String[] args) {
		
		MarcoConTexto mar= new MarcoConTexto();

	}

}
class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		setVisible(true);
		setTitle("lamina con camposde texto");
		setBounds(500, 300, 250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LaminaConTexto milamina= new LaminaConTexto();
		add(milamina);
	}
	
}

class LaminaConTexto extends JPanel{
	private JTextField campo1= new JTextField("texto defecto" ,20);
	private JLabel resultado= new JLabel("", JLabel.CENTER);
	public LaminaConTexto() {
		JLabel email1 = new JLabel("Email: ");
		LaminaCentral lamina2 = new LaminaCentral();
		setLayout(new BorderLayout());
		lamina2.setLayout(new FlowLayout());
		lamina2.add(email1);	
		lamina2.add(campo1);
		lamina2.add(lamina2.boton1);
		add(resultado);
		DameTexto mievento = new  DameTexto();
		
	//	lamina2.setLayout(new BorderLayout());
		lamina2.boton1.addActionListener(mievento);
		
		add(lamina2,BorderLayout.NORTH);
		//add(boton1, BorderLayout.SOUTH);
	
	}
	
	private class DameTexto implements ActionListener{

		
		public DameTexto() {
			
		}
		
		
		public void actionPerformed(ActionEvent e) {
		
			String texto= campo1.getText();
			System.out.println(texto);
			Pattern patronEmail= Pattern.compile("[a-zA-Z0-9_]+\\.*[a-zA-Z0-9_]*\\.*@(gmail|hotmail)\\.(com|es)");
			Matcher m = patronEmail.matcher(texto);
			if (m.matches()) {
				System.out.println("mail correcto");
				resultado.setText("Correcto");
			}else {
				resultado.setText("Incorrecto");
			}
			
		}
		
	}
}

class LaminaCentral extends JPanel{
	JButton boton1= new JButton("Comprueba");
	public LaminaCentral() {
		
		
		
	}
}