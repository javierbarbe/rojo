package layouts;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MenuDesplegable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMenudespelgable m = new MarcoMenudespelgable();

	}

}
class 	MarcoMenudespelgable extends JFrame{
	
	
	public  MarcoMenudespelgable () {
		setVisible(true);
		setBounds(400, 200, 300, 120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LaminaMenuDes lami= new LaminaMenuDes();
		add(lami);
	}
	
}

class LaminaMenuDes	 extends JPanel{
	
	private JLabel texto;
	private JComboBox micombo;
	
	public LaminaMenuDes () {
		setLayout(new BorderLayout());
		texto= new JLabel();
		texto.setText("En un lugar de la Mancha");
		texto.setFont(new Font("Calibri", Font.BOLD, 25));
		add(texto, BorderLayout.CENTER);
		JPanel laminaNorte = new JPanel();
		micombo = new JComboBox();
		micombo.setEditable(true);
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		Evento_combo mievento= new Evento_combo();
		micombo.addActionListener(mievento);
		laminaNorte.add(micombo);
		add(laminaNorte, BorderLayout.NORTH);
	}
	private class  Evento_combo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// se puede ahcer un casteo (String)micombo.getSelectedItem(), ....)
			texto.setFont(new Font(micombo.getSelectedItem().toString(), Font.PLAIN, 15));
		}
		
	}
}