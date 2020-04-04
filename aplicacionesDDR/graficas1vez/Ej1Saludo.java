package graficas1vez;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ej1Saludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Marco uno = new Marco();
	}

	
	
	
}

 class Marco extends JFrame{
	 
	 public Marco() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		Toolkit mipantalla= Toolkit.getDefaultToolkit();
		Dimension tamanioPantall= mipantalla.getScreenSize();
		int altura= tamanioPantall.height;
		int ancho= tamanioPantall.width;
		setSize(ancho/3, altura/3);
		
		setLocation(ancho/3, altura*1/4);
		 setTitle("Saludador");
		lamina milamina= new lamina();
		add(milamina);
		Image miIcono= mipantalla.getImage("aplicacionesDDR/iconomadrid.jpg");
		setIconImage(miIcono);
//		Botones bot = new Botones();
//		add(bot);
//		Laminaconfiguras re= new Laminaconfiguras();
//		add(re);
		Laminaconfiguras o= new Laminaconfiguras();
		add(o);
	
	 }
	
}

 class lamina extends JPanel{
	 
	
		 public void paintComponent( Graphics g) {
				super.paintComponent(g);
			
				Toolkit pantalla= Toolkit.getDefaultToolkit();
				Dimension mipantalla= pantalla.getScreenSize();
				
				int medioancho= mipantalla.width/4;
				int medioalto = mipantalla.height/4;
				g.drawString("Escribe un nombre para saludar", 120, 60);
				Rectangle2D res = new Rectangle2D.Double(40,40,40,40);
				Graphics2D g2 = (Graphics2D) g;
				g2.draw(res);
			
			}
			
	
	 
	 
 }
// class Botones extends JButton{
//	 
//	 public Botones () {
//		
//		 setVisible(true);
//		 setSize(99, 20);
//		 setLocation(100, 100);
//		 setText("hello");
//		 
//		 
//	 }
// }
 
 class Laminaconfiguras extends JPanel{
	 	
	 
		 public void paintComponent(Graphics g) {
		
			 super.paintComponent(g);
			 
			 Graphics2D g2= (Graphics2D) g; //refundicion de g a Graphics2D
			 Rectangle2D rectangulo = new Rectangle2D.Double(80,100,50,50);
			 g2.draw(rectangulo);
		 }
	 
 }
 
