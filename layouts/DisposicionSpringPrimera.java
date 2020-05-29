package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class DisposicionSpringPrimera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSpring mar = new MarcoSpring();
	}

}
class MarcoSpring extends JFrame{
	public MarcoSpring() {
		setVisible(true);
		setBounds(200,200,600,150);
		JButton boton1 = new JButton("boton1");
		JButton boton2 = new JButton("boton2");
		JButton boton3 = new JButton("boton3");
		JPanel panel = new JPanel();
		SpringLayout milayout = new SpringLayout();
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		Spring mimuelle = Spring.constant(0	,100,1000); 
		// para aplicar este muelle al layout hay que usar el metodo putConstraint de Springlayout
	//	milayout.putConstraint(SpringLayout.EAST, this, mimuelle	, SpringLayout.EAST, boton3);
		milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle	, SpringLayout.WEST, this);
		milayout.putConstraint(SpringLayout.WEST, boton2, mimuelle	, SpringLayout.EAST, boton1);
		milayout.putConstraint(SpringLayout.WEST, boton3, mimuelle	, SpringLayout.EAST, boton2);
		
		panel.setLayout(milayout);
		add(panel);
	}
}