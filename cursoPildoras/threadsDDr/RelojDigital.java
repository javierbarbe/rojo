package threadsDDr;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RelojDigital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoReloj reloj = new MarcoReloj();
//		Thread t = new Thread(reloj);
//		t.start();
//		GregorianCalendar fecha = new GregorianCalendar();
//		System.out.println(fecha.get(12));
		// 13 segundos
		// 12 minutos
		// 11 horas
	}

}

class MarcoReloj extends JFrame implements Runnable {
	private JLabel tiempo = new JLabel("");
	private String hora = "";
	private JButton iniciar = new JButton("Iniciar!");
	GregorianCalendar fecha = new GregorianCalendar();
	int horas = fecha.get(11);
	int minutos = fecha.get(12);
	int segundos = fecha.get(13);
	JPanel panelHora = new JPanel();
	public MarcoReloj() {
		
		compruebaFormatoHora();
		setLayout(new BorderLayout());
		setVisible(true);
		setBounds(500, 300, 450, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JPanel panelBoton = new JPanel();
		tiempo.setText(hora);
		tiempo.setFont(new Font("Cambria", Font.BOLD, 82));
		panelHora.add(tiempo);
		// con clase interna anonima el evento
		iniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//MarcoReloj reloj = new MarcoReloj();
				Thread t = new Thread(new MarcoReloj());
				t.start();
			}
		});
				
		panelBoton.add(iniciar);
		add(panelHora, BorderLayout.CENTER);
		add(panelBoton, BorderLayout.EAST);
	}
	public void compruebaFormatoHora() {
		hora="";
		if (horas < 10) {
			hora += "0" + horas;
		} else {
			hora += horas;
		}
		hora += ":";
		if (minutos < 10) {
			hora += "0" + minutos;
		} else {
			hora += minutos;
		}
		hora += ":";
		if (segundos < 10) {
			hora += "0" + segundos;
		} else {
			hora += segundos;
		}
	}

	@Override
	public void run() {
	int a=0;
		try {
			while (true) {
				a++;
				Thread.sleep(1000);
				segundos++;
				if(segundos==60) {
					minutos++;
					segundos=0;
				}
				if(minutos==60) {
					horas++;
					minutos=0;
				}
				if (horas==24) {
					horas=0;
				}
				compruebaFormatoHora();
				//hora=horas+":"+minutos+":"+segundos;
				tiempo.setText(hora);
				panelHora.add(tiempo);
			}
		
		}catch(Exception e2) {
			System.out.println("error en  el try del runn reloj");
		}
		
	}

		
	
}
