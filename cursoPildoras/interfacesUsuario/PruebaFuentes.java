package interfacesUsuario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.*;

public class PruebaFuentes {

	public static void main(String[] args) {

		String[] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		int contador = 0;
		String fuente = JOptionPane.showInputDialog("Introduce el nobmre de fuente a buscar");
		boolean estaFuente = false;
		for (String es : nombresFuentes) {
			System.out.println(es);
			if (fuente.equalsIgnoreCase(es)) {
				System.out.println("La fuente " + fuente + " es igual a " + es);
				System.out.println(" Es la posicion " + contador);
				estaFuente = true;
			}
			contador++;

		}
		if (estaFuente) {
			System.out.println("Fuente instalada");
			System.out.println(contador);
		} else {
			System.out.println("La fuente no esta");
		}

		Marco3 o= new Marco3();
	}

}
class Marco3 extends JFrame {

	public Marco3() {
		setVisible(true);
		setBounds(40, 40, 500, 500);
		setTitle("Prueba marco con fuentes");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaFuentes la2 = new LaminaFuentes();
		la2.setBackground(Color.red);
		add(la2);
	}
}



class LaminaFuentes extends JPanel {


	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		Font fuente = new Font("Arial", Font.BOLD, 33);
		g2.setFont(fuente);
		g2.drawString("Hola", 400, 100);
		g2.drawRect(55, 55, 300, 300);
		g2.setFont(new Font("Yu Gothic UI",Font.CENTER_BASELINE,33));
		g2.setColor(new Color(122,113,22).brighter());
		g2.drawString("Perico", 66, 55);

	}

}