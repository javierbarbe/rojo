package herencia;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

//		Reloj casio = new Reloj(3000, true);
		Reloj casio = new Reloj();
		casio.enMarcha(3000,true);
	
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para acabar");
		System.exit(0);
	}

}

class Reloj {

//	public Reloj(int intervalo, boolean sonido) {
//		this.intervalo = intervalo;
//		this.sonido = sonido;

//	}

	public void enMarcha(int intervalo , boolean sonido) {
		//CORTADO Y PEGADO LA CLASE QUE ESTABA FUERA, Y LA METO DENTRO DEL METODO, HAY QUE
		//ELIMINAR EL MODIFICADOR DE ACCESO PRIVATE
		
		 class DameLaHora2 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 seg: " + ahora);

				if (sonido ) {//== true) {
					Toolkit.getDefaultToolkit().beep();
//					intervalo++;
				}
				
			}

		}
		ActionListener oyente = new DameLaHora2();

		Timer mitemporizador = new Timer(intervalo, oyente);
		
		mitemporizador.start();
	}

//	private int intervalo;
//	private boolean sonido;

//	///////// CLASE INTERNA DAMELAHORA2
//	private class DameLaHora2 implements ActionListener {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Date ahora = new Date();
//				System.out.println("Te pongo la hora cada 3 seg: " + ahora);
//
//				if (sonido == true) {
//					Toolkit.getDefaultToolkit().beep();
//				}
//				
//			}

//		}

}
