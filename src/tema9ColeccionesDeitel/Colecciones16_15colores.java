package tema9ColeccionesDeitel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.HashMap;
import java.util.prefs.BackingStoreException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Colecciones16_15colores {

	public static void main(String[] args) {
		/*
		 * Use un objeto HashMap para crear una clase reutilizable y elegir uno de los
		 * 13 colores predefinidos en la clase Color. Los nombres de los colores deben
		 * usarse como claves, y los objetos Color predefinidos deben usarse como
		 * valores. Coloque esta clase en un paquete que pueda importars e en cualquier
		 * programa en Java. Use su nueva clase en una aplicación que permita al usuario
		 * seleccionar un color y dibujar una figura en ese color.
		 */
		
		
		Marco mimarco= new Marco();
		EligeColor elegido = new EligeColor();
	mimarco.setBackground(elegido.getElegido());
	Graphics2D gra = (Graphics2D) mimarco.getGraphics();
	gra.setColor(elegido.getElegido());
	Panel let= new Panel();
	mimarco.add(let);
			
			gra.drawString("Julito", 22, 10);
			
	
		
		
	}

}
class Marco extends JFrame{
	public Marco() {
		setVisible(true);
		setBounds(55, 55, 200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Panel letras = new Panel();
//		add(letras);
	
		
	}
}
class EligeColor{  //clase para elegir un color del HAshMap colores
	protected Color getElegido() {
		return elegido;
	}
	private Color elegido;
	public EligeColor() {
		HashMap<String, Color> mapa= new HashMap<>();
		mapa.put("Negro", Color.BLACK);
		mapa.put("Azul", Color.BLUE);
		mapa.put("Cyan", Color.CYAN);
		mapa.put("Gris oscuro", Color.DARK_GRAY);
		mapa.put("Gris", Color.GRAY);
		mapa.put("Verde", Color.GREEN);
		mapa.put("Gris claro", Color.LIGHT_GRAY);
		mapa.put("Magenta", Color.MAGENTA);
		mapa.put("Naranja", Color.ORANGE);
		mapa.put("Rosa", Color.PINK);
		mapa.put("Rojo", Color.RED);
		mapa.put("Blanco", Color.WHITE);
		mapa.put("Amarillo", Color.YELLOW);
		
		String color = JOptionPane.showInputDialog("Elige un color");
		 elegido =mapa.get(color) ;
		
	}
}
 class  Panel extends JPanel{

	protected  void paintComponent(Graphics g) {
		EligeColor micolor = new EligeColor();
		
		super.paintComponent(g);
		g.setColor(micolor.getElegido()); //llamo al metodo getElegido para estableccer un color
		g.drawString("HOla ", 66, 66);
	}
}