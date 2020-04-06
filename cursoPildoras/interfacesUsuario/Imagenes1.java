package interfacesUsuario;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Imagenes1 {

	public static void main(String[] args) {
		
		MarcoImagen o = new MarcoImagen();

	}

}
class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setVisible(true);
		setTitle("Marco con imagen");
		Rectangle re = new Rectangle(450,36,300,300);
		setBounds(re);	
		LaminaConImagen milami= new LaminaConImagen();
		add(milami);
	}
}
class LaminaConImagen extends JPanel{
	
	public  LaminaConImagen() {
		try {
		File miimagen= new File("cursoPildoras/interfacesUsuario/batman2.jpeg");
		imagen = ImageIO.read(miimagen);
	} catch (IOException e) {
		
		System.out.println(e.getMessage());
		System.out.println("La imagen no se encuentra");
	}
	
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int ancho= imagen.getWidth(this);
		int altura= imagen.getHeight(this);
		System.out.println(altura);
		System.out.println(ancho);
//		g.drawImage(imagen, 90, 25, null);
		g.drawImage(imagen, 0, 0, 128, 67, null);
		for(int i= 0; i<300; i++) {
			for(int j=0; j<300;j++) {
				g.copyArea(0, 0, 128, 67, 128*i,67*j);
			}
		}
		
	}
	private Image imagen;
}