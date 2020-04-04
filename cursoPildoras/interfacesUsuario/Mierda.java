package interfacesUsuario;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mierda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marcow mono = new Marcow();
	}

}
class Marcow extends JFrame{
	
	public Marcow() {
		
		setBounds(750, 50, 350, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pane mio = new Pane();
		add(mio);
//		elipse co= new elipse();
//		add(co);
		
		
	}
	
}
class Pane extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 100, 100, 100);
		Rectangle2D e = new Rectangle2D.Double();
		e.setRect(45, 50, 55, 55);
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(e);
	
		Ellipse2D ciso= new Ellipse2D.Double();
		ciso.setFrame(e);
		g2.draw(ciso);
	
		
		
	}
	
	
}
class elipse extends JPanel{
	public void paintCompontent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 100, 100, 100);
		Rectangle2D e = new Rectangle2D.Double();
		e.setRect(45, 50, 55, 55);
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(e);
	
		Ellipse2D ciso= new Ellipse2D.Double();
		ciso.setFrame(e);
		g2.draw(ciso);
	}
}