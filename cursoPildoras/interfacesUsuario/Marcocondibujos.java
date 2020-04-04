package interfacesUsuario;

//package interfacesUsuario;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marcocondibujos {
	
	

	public static void main(String[] args) {
		
		Marco mimarco= new Marco();

	}

}


class Marco extends JFrame{
	
	public  Marco() {
		setVisible(true);
		setTitle("Prueba de dibujos");
		setSize(400,400);
		setLocation(400,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaConFiguras cuadrado= new LaminaConFiguras();
		add(cuadrado);
		
	}
	
}
class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawRect(69, 69, 89, 89);
		g.drawLine(15, 25, 222, 280);
		g.drawArc(50, 50, 25, 402, 1200, 150);
		Graphics2D g2 =  (Graphics2D) g;
		
		Rectangle2D rectangulo= new Rectangle2D.Double(182,22,119,119);
		g2.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
//		g2.draw(elipse);
		
		Ellipse2D circulo = new Ellipse2D.Double();
		double centroejeX= rectangulo.getCenterX();
		double centroenY= rectangulo.getCenterY();
		
		circulo.setFrameFromCenter(centroejeX, centroenY,190, 180);
		g2.draw(circulo);
	}
	
}
