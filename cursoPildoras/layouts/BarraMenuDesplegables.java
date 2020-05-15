package layouts;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BarraMenuDesplegables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MarcoMenu es = new MarcoMenu();
	}

}

class MarcoMenu extends JFrame{
	
	
	public MarcoMenu()	{
		setVisible(true);
		setBounds(400,500,320,190);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelMenu mi = new PanelMenu();
		add(mi);
		
	}
}

class PanelMenu extends JPanel{
	
	public PanelMenu () {
		//menu contenedor
		JMenuBar menuGrande= new JMenuBar();
		//botones del menu
		JMenu archivo = new JMenu("Archivo");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu edicion= new JMenu("Edicion");
		menuGrande.add(archivo);
		menuGrande.add(herramientas);	
		menuGrande.add(edicion);
		add(menuGrande);
		//opciones que cuelgan de los botones del menu
		JMenuItem nuevo= new JMenuItem("Nuevo");
		JMenuItem guardar= new JMenuItem("Guardar");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem pegar= new JMenuItem("Pegar");
		JMenuItem copiar= new JMenuItem("Copiar");
		JMenuItem generales = new JMenuItem("Generales");
		archivo.add(nuevo);
		archivo.add(guardar);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		herramientas.add(generales);
		//para tener un elemento que contenga mas subelementos, no puede ser jmenuitem, ha de ser jmenu, la opcion final
		//es el jmenuitem
		JMenu opcion = new JMenu("Opciones");
		JMenuItem op1= new JMenuItem("Opcion1");
		JMenuItem op2= new JMenuItem("Opcion2");
		//para agregar un separador que indique que un grupo de opciones del menu van juntas addSeparator();
		archivo.addSeparator();
		opcion.add(op1);
		opcion.add(op2);
		archivo.add(opcion);
	
		
		
		
	}
}