package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton m1 = new MarcoRaton();

	}

}
class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		setBounds(350, 350, 350, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//addMouseListener(new EventosDeRaton());
		//--------------- o bien -----------------------------------------------
		EnventoRatonil eventoRatonil2 = new EnventoRatonil();
		addMouseMotionListener(eventoRatonil2);
		addMouseListener(eventoRatonil2);
		// ----------------***********--------------------------------------
	}
	
	
}
// ---------------PUEDES USAR LA INTERFAZ E IMPLEMENTAR TODOS LOS METODOS AUNQUE SOLO QUIERAS USAR ALGINO------------
class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de presionar");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de levantar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de entrar en la ventana");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de salir de la ventana");
		
	}
	
	
}
// ---------O BIEN CREAS UN OBJETO QUE HEREDE DE LA CLASE ADAPTADORA IGUAL QUE TECLADO Y VENTANA-----------------------------

class EnventoRatonil extends MouseAdapter implements MouseMotionListener{
	
	// haciendo ctrl+barra espaciadora salen los metodos disponibles
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseMoved(e);
		System.out.println("has movido el raton");
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		super.mouseWheelMoved(e);
		System.out.println("has movido la rueda");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseDragged(e);
		System.out.println("has arrastrado");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		super.mouseClicked(e);
//		System.out.println("has hecho click con mouse adapter");
//		System.out.println("coordenada X: "+ e.getX()+ " coordenada Y: "+ e.getY());
//		System.out.println(e.getClickCount()); //cantidad de clicks
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mousePressed(e);
		if(e.getModifiersEx()==1024) {
			System.out.println("has pulsado el boton izquierdo");
		}else if ( e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("has pulsado la rueda");
		}else if (e.getModifiersEx()== MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("has pulsado el boton derecho");
		}
	}
}