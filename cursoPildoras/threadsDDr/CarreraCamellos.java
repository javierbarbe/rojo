package threadsDDr;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/*
 * Haz una ventana con 4 progressbar, se crearan 4 hilos que representaran a caballos 
 * (que tienen un nombre y un camino recorrido o porcentaje recorrido). 
 * Al pulsar el botón de iniciar se empezará a avanzar, actualizando los progressbar 
 * con un numero aleatorio entre 1 y 15.
	Gana el primero que llegue a 100.
 */

public class CarreraCamellos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCamellosCarreras car = new MarcoCamellosCarreras(new MarcoCamellosCarreras());
		Thread t = new Thread(car);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class MarcoCamellosCarreras extends JFrame implements Runnable {
	MarcoCamellosCarreras recibido;
	boolean porcentajeMaximo = false;
	private static final long serialVersionUID = 1L;
	private static int numCarrera=1;
	JPanel fondo = new JPanel();
	JLabel titulo = new JLabel("CARRERAS DE CABALLOS");

	JProgressBar caballo1 = new JProgressBar(0, 100);
	JProgressBar caballo2 = new JProgressBar(0, 100);
	JProgressBar caballo3 = new JProgressBar(0, 100);
	JProgressBar caballo4 = new JProgressBar(0, 100);
	JPanel superior1 = new JPanel();
	JPanel superior2 = new JPanel();
	JPanel inferior1 = new JPanel();
	JPanel inferior2 = new JPanel();
	JButton reiniciar = new JButton("Reinciar");

	public MarcoCamellosCarreras() {

	}
	public MarcoCamellosCarreras(MarcoCamellosCarreras rec) {
		recibido=rec;
		setLayout(new BorderLayout());
		titulo.setFont(new Font("Cambria", Font.BOLD, 35));
		fondo.setLayout(new BoxLayout(fondo, BoxLayout.Y_AXIS));
		fondo.setBounds(450, 300, 700, 350);
		setBounds(450, 300, 700, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		fondo.add(titulo);
		añadeCaballo(caballo1, superior1);
		añadeCaballo(caballo2, superior2);
		añadeCaballo(caballo3, inferior1);
		añadeCaballo(caballo4, inferior2);
//		
		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 System.out.println("-----------------------");
				ponerACero();
				Thread.currentThread().interrupt();
				Thread t = new Thread(rec);
				t.start();
		
			}
		});
		add(fondo, BorderLayout.CENTER);
		add(reiniciar, BorderLayout.EAST);

	}

	public void añadeCaballo(JProgressBar barraCaballo, JPanel laminaReceptora) {

		laminaReceptora.add(new JLabel("Caballo " + numCarrera));
		numCarrera++;
		laminaReceptora.add(barraCaballo);
		fondo.add(laminaReceptora);
	}

	@Override
	public void run() {
		ponerACero();
		while (true && !porcentajeMaximo) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				 
				System.out.println("error al interrumpir el hilo " + Thread.currentThread());
			}
			
			pintaPorcentaje(caballo1, 1);
			pintaPorcentaje(caballo2, 2);
			pintaPorcentaje(caballo3, 3);
			pintaPorcentaje(caballo4, 4);
		}

	}

	public void ponerACero() {
		
		caballo1.setValue(0);
		caballo2.setValue(0);
		caballo3.setValue(0);
		caballo4.setValue(0);
		caballo1.setString("0%");
		caballo2.setString("0%");
		caballo3.setString("0%");
		caballo4.setString("0%");
		add(fondo);
		arranca = true;
		porcentajeMaximo = false;
	}

	public void pintaPorcentaje(JProgressBar caballoBarra, int numero) {
		caballoBarra.setName("Caballo " + numero);
		caballoBarra.setStringPainted(true);
		int movimiento = (int) (Math.random() * 15+1);
		caballoBarra.setString(Integer.toString(caballoBarra.getValue()) + "%");
		caballoBarra.setValue(caballoBarra.getValue() + movimiento);
		caballoBarra.setString(Integer.toString(caballoBarra.getValue()) + "%");
		if (caballoBarra.getValue() >= 100) {
			Thread.currentThread().interrupt();
			porcentajeMaximo = true;
			System.out.println("el ganador es " + caballoBarra.getName());

		}
	}

	boolean arranca = false;
}