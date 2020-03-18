package interfacesUsuario;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		MarcoCentrado uno = new MarcoCentrado();
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		setVisible(true);
		Toolkit mipantalla= Toolkit.getDefaultToolkit();
		Image miicono= mipantalla.getImage("C:\\Users\\pc\\git\\ordenadornegro\\cursoPilodras\\interfacesUsuario\\icono.gif");
		setIconImage(miicono);
		Dimension tamaniopantalla=mipantalla.getScreenSize();
		System.out.println(tamaniopantalla);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int alturapantalla=tamaniopantalla.height;
		int anchopantalla=tamaniopantalla.width;
		System.out.println(alturapantalla +" "+ anchopantalla);
		setBounds(anchopantalla/4,alturapantalla/4, anchopantalla/2, alturapantalla/2);
	}
}