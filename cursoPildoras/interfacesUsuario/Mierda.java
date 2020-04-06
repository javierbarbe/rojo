package interfacesUsuario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mierda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marcow mono = new Marcow();
	}

}
class Marcow extends JFrame{
	
	public Marcow() {
		setTitle("Coloreando en el marco" );
		setBounds(750, 50, 350, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pane mio = new Pane();
		add(mio);
//		Elipse co= new Elipse();
//		add(co);
	
		
	}
	
}
class Pane extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 100, 100, 100);
		Rectangle2D e = new Rectangle2D.Double();
		e.setRect(45, 50, 55, 55);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(e);
		Color azu = new Color(63,183,174);
		g2.setColor(azu);
		g2.fill(e);
		
		Ellipse2D ciso= new Ellipse2D.Double();
		ciso.setFrame(e);
		Color ver= new Color (72,181,62);
		g2.setColor(ver);
		g2.fill(ciso);
		g2.draw(ciso);
//		JLabel etiqueto= new JLabel();
//		etiqueto.setText("Holaaaa");
//		etiqueto.setOpaque(true);
//		add(etiqueto);
	
		
		
	}
	
	
}
class Elipse extends JPanel{

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 100, 100, 100);
		Rectangle2D e = new Rectangle2D.Double();
		e.setRect(45, 50, 55, 55);
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(e);
		Color azu = new Color(22,33,44);
		g2.setColor(azu);
		
		Ellipse2D ciso= new Ellipse2D.Double();
		ciso.setFrame(e);
		g2.draw(ciso);
	
		
	}
}