package layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxNegritaCursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCheckBox ma = new MarcoCheckBox();
	}

}


class MarcoCheckBox extends JFrame{
	JCheckBox negrita = new JCheckBox("negrita");
	JLabel texto = new JLabel("En un lugar de la Mancha...");
	JCheckBox cursiva = new JCheckBox("cursiva");
	
	public MarcoCheckBox() {
		// TODO Auto-generated constructor stub
		
		setVisible(true);
		setBounds(500, 120, 290, 190);
		setLayout(new BorderLayout());
		JPanel lamina1 = new JPanel();
		texto.setFont(new Font ("Calibri", Font.PLAIN, 20));
		lamina1.add(texto);
		add(lamina1, BorderLayout.CENTER);
		JPanel laminabotones = new JPanel();
		ManejaChecks oyent = new ManejaChecks();
		negrita.addActionListener(oyent);
		cursiva.addActionListener(oyent);
		laminabotones.add(negrita);
		laminabotones.add(cursiva);
		add(laminabotones, BorderLayout.SOUTH);
		
	}
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int valor =0;
			if (negrita.isSelected()) {
				valor+=Font.BOLD;
			}
			if (cursiva.isSelected()) {
				valor+=Font.ITALIC;
			}
			texto.setFont(new Font("Calibri" , valor , 20));
			
		}
		
	}
	
}