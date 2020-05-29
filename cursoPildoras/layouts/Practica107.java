package layouts;



import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Practica107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MarcoMenu2 es = new MarcoMenu2();
	}

}

class MarcoMenu2 extends JFrame{
	
	
	public MarcoMenu2()	{
		setVisible(true);
		setBounds(400,500,320,190);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelMenu2 mi = new PanelMenu2();
		add(mi);
		
	}
}

class PanelMenu2 extends JPanel{
	
	public PanelMenu2 () {
		setLayout(new BorderLayout());
		//menu contenedor
		JMenuBar menuGrande= new JMenuBar();
		//botones del menu
		JMenu archivo = new JMenu("Archivo");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu edicion= new JMenu("Edicion");
		menuGrande.add(archivo);
		menuGrande.add(herramientas);	
		menuGrande.add(edicion);
		JTextArea areatexto= new JTextArea();
		add(menuGrande, BorderLayout.NORTH);
		add(areatexto,BorderLayout.CENTER);
		//opciones que cuelgan de los botones del menu
		JMenuItem nuevo= new JMenuItem("Nuevo");
		JMenuItem guardar= new JMenuItem("Guardar");
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("bin/graficos/cortar.gif"));
		// para cambiar la ordenacion del icono ( ponerlo en la derecha x ej;)
					//cortar.setHorizontalTextPosition(SwingConstants.LEFT);
		//-------------------------
		JMenuItem pegar= new JMenuItem("Pegar", new ImageIcon("imagenes/pegar.gif"));
		JMenuItem copiar= new JMenuItem("Copiar", new ImageIcon("imagenes/copiar.gif"));
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