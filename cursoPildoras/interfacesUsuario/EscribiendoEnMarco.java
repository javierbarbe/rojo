package interfacesUsuario;

import java.awt.*;
//import java.awt.Toolkit;

import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		
		marcoconTexto no = new  marcoconTexto();
	}

}
class marcoconTexto extends JFrame{
	
	public marcoconTexto () {
		
		setVisible(true);
		Toolkit pantalla= Toolkit.getDefaultToolkit();
		Dimension tamaniopant= pantalla.getScreenSize();
		int alto= tamaniopant.height;
		int ancho=tamaniopant.width;
		setSize(ancho/2,alto/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(ancho/4,alto/4);
		setTitle("Primer Texto");
		lamina milamina= new lamina();
		add(milamina);
	}
	
}


class lamina extends JPanel{
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font fuente = new Font ("Arial",Font.BOLD, 33);
		g2.setFont(fuente);
		g2.setColor(Color.BLUE);
		g2.drawString("Hola comeme la polla javier", 40, 100);
		g2.setFont(new Font("Curier",55,14));
		g2.drawString("Perico", 33, 44);
	}
	
}


