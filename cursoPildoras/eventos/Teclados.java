package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Teclados {

	
	public static void main (String args[]) {
		MarcoVentana marc = new MarcoVentana();
		HashMap<String	, String> mimaPa= new HashMap<>();
		mimaPa.put("12", "madrid");
		
		mimaPa.forEach((k, v)-> System.out.println(k+ " "+ v));
		marc.addKeyListener(new EventoDeTeclado());
	}
}


class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar()+ " tecla pulsada");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	//	System.out.println(e.getKeyChar()+ " tecla pulsada");
		//System.out.println(e.getKeyCode()+ " codigo de tecla pulsada");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyChar()+ " tecla pulsada");
		
	}
	
}