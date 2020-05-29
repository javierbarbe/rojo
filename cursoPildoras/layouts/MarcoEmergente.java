package layouts;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class MarcoEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMMerengente ma= new MarcoMMerengente();

	}

}
class MarcoMMerengente extends JFrame{
	
	public MarcoMMerengente () {
		setVisible(true);
		setBounds(600, 300, 350, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LaminaEmergente e = new LaminaEmergente();
		add(e);
	}
	
}

class LaminaEmergente extends JPanel{
	
	public LaminaEmergente() {
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem op1 = new JMenuItem("opcion1");
		JMenuItem op2 = new JMenuItem("opcion2");
		JMenuItem op3 = new JMenuItem("opcion3");
		JLabel mo = new JLabel("mi maraca");
		add(mo);
		emergente.add(op1);
		emergente.add(op2);
		emergente.add(op3);
		setComponentPopupMenu(emergente);
	}
	
}