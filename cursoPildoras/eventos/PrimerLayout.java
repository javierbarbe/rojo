package eventos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrimerLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout lay= new MarcoLayout();
		lay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoLayout extends JFrame{
	
	public MarcoLayout() {
		// TODO Auto-generated constructor stub
		
		setVisible(true);
		setBounds(200, 200, 300, 200);
		Panel_Layout mipanel = new Panel_Layout();
		//FlowLayout disposicion= new FlowLayout(FlowLayout.LEFT,55,25);
		Panel_layout2 panel2 = new Panel_layout2();
		//mipanel.setLayout(disposicion);
		add(mipanel, BorderLayout.NORTH);
		// una lamina machaca a la otra... para que aparezcan las dos hay que decirle al contenedor (MarcoLayoyt) la
		//disposicion que va a tener  y eso se hace en el ADD
		add(panel2, BorderLayout.SOUTH);
	}
	
}

class Panel_Layout extends JPanel{
	
	//cada lamina solo admite un layout a la vez 
	public Panel_Layout() {
		setLayout(new BorderLayout(10,10));
		add(new JButton("amarillo"), BorderLayout.EAST);
		add(new JButton("rojo"), BorderLayout.WEST );
		add(new JButton("azul"), BorderLayout.SOUTH);
	}
}

class Panel_layout2 extends JPanel{
	
	public Panel_layout2() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		add(new JButton("negro"));
		add(new JButton("verde") );
		add(new JButton("amarillo"));
	}
	
}