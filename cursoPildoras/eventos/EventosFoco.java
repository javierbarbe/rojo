package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mfoto = new MarcoFoco();
		mfoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	
	
	public MarcoFoco() {
		setVisible(true);
		setBounds(550,250,350,250);
		LaminaFoco lamina= new LaminaFoco();
		add(lamina);
	}
}

class LaminaFoco extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		setLayout(null); // anula la colocacion de elemenots por defecto de java
		
		//damos valores a los atributos, los construyo
		cuadro1=new JTextField();
		cuadro2= new JTextField();
		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120, 40, 150, 20);
		add(cuadro1);
		add(cuadro2);
		LanzaFocos elfoco= new LanzaFocos();
		//cuadro1 esta a la escucha es el que hace 
		//elfoco es quien desencadena???
		//fuente : cuadro1
		//objeto a la escucha: instancia de LanzaFocos elfoco (tiene que implementar listener de algun tipo)
		//accion desencadenada sobre el objeto a la escucha (evento) : comprobar el patron de correo electronico
		//accion que lo desencadena : al perder el foco
		cuadro1.addFocusListener(elfoco);
	}
	
	//declaro dos atributos de tipo JTextField son para 
	
	JTextField cuadro1;
	JTextField cuadro2;
	
private	class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String correo= cuadro1.getText();
			// \\w cualqier numero letra o guion bajo \\. escapa el caracter punto $obliga a ser final del string	
			Pattern pat = Pattern.compile("\\w+(\\.\\w*)*@[a-z]{1,}\\.(com|es)$");
			Matcher m = pat.matcher(correo);
			if(m.matches()) {
				System.out.println("coincide con el patron");
			}else {
				System.out.println("No coincide el pat");
				System.out.println(cuadro1.getText()+ " TEXTO RECOGIDO NUEVAMENTE");
				System.out.println(correo+ " TEXTO PREVIO AL IF");
				System.out.println(pat);
			}
			if(correo.contains("@")) {
				System.out.println("contiene arroba");
			}
			System.out.println(correo);
			
		}
		
	}
	
}