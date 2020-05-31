package layouts.marcoscajas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Lamina_ejemplo  extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		//transformar el objeto graphics en un graphics2d
		Graphics2D g2= (Graphics2D ) g; 
		// con getWItdh y getHeight cojo dimensiones de la lamina
		Rectangle2D rectangulo= new Rectangle2D.Double(0,0,getWidth(),getHeight()) ;
		g2.setPaint(Color.yellow);
		g2.fill(rectangulo);
		
		
	}
}
