package layouts;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AreaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAreaTexto mar = new MarcoAreaTexto();
		mar.setTitle("Probando MarcoArea Texto");
	}

}

class MarcoAreaTexto extends JFrame{
	
	public MarcoAreaTexto() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setBounds(800, 200, 350, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		laminaBotones= new JPanel();
		boton_salto_linea= new JButton("Salto linea");
		insertar= new JButton("Insertar");
		insertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append ("TExto agregado");
			}
		});
	}
	private JTextArea areaTexto;
	private JPanel laminaBotones ; 
	private JButton boton_salto_linea;
	private JButton insertar;
}



