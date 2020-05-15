package layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ProcesadorTextos101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesadorTextos no = new MarcoProcesadorTextos();

	}

}
 

class MarcoProcesadorTextos extends JFrame{
	JLabel texto= new JLabel("En un lugar de la Mancha...");
	public MarcoProcesadorTextos() {
		setLayout(new BorderLayout());
		setVisible(true);
		//MarcoMenu me = new MarcoMenu();
		setBounds(600,300,290,120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelProcesador pi = new PanelProcesador();

		add(pi, BorderLayout.NORTH);
		add(texto, BorderLayout.WEST);
	}
	
	private class PanelProcesador extends JPanel{
		JMenuBar barra = new JMenuBar();
		JMenu fuente= new JMenu("Fuente");
		JMenu estilo= new JMenu("Estilo");
		JMenu formato= new JMenu("Formato");
		//tipo de fuente
		JMenuItem arial= new JMenuItem("Arial");
		JMenuItem calibri = new JMenuItem("Calibri");
		JMenuItem timesNR = new JMenuItem("Times New Roman");
		//************************
		//tipo letra
		JMenuItem cursiva= new JMenuItem("Cursiva");
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem normal = new JMenuItem("Normal");
		//tamaño letra
		JMenuItem grande = new JMenuItem("Grande");
		JMenuItem mediana = new JMenuItem("Mediana");
		JMenuItem peque = new JMenuItem("Pequeña");
		public PanelProcesador() {
		// añado los listeners 
			cursiva.addActionListener(new oyenteMenu());
			negrita.addActionListener(new oyenteMenu());
			normal.addActionListener(new oyenteMenu());
			arial.addActionListener(new oyenteMenu());
			calibri.addActionListener(new oyenteMenu());
			timesNR.addActionListener(new oyenteMenu());
			grande.addActionListener(new oyenteMenu());
			mediana.addActionListener(new oyenteMenu());
			peque.addActionListener(new oyenteMenu());
		///******************
			
	//añado las opciones a los desplegables
			estilo.add(cursiva);
			estilo.add(negrita);
			estilo.add(normal);
			formato.add(grande);
			formato.add(mediana);
			formato.add(peque);
			fuente.add(arial);
			fuente.add(calibri);
			fuente.add(timesNR);
		//*********************************
			
			//añado los botones a la barra
			barra.add(fuente);
			barra.add(estilo);
			barra.add(formato);
		// añado la barra a la lamina
			add(barra);
			
			//add(texto);
		}
		private class oyenteMenu implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object fuente = e.getSource();
				Font fuentes=texto.getFont();
				int tamanio=fuentes.getSize();
				int estilo= fuentes.getStyle();
				String nombreFuente = fuentes.getFontName();
				if (fuente.equals(cursiva)) {
					System.out.println("has elegido  cursiva");
//					texto.setFont(new Font (nombreFuente, 2, fuentes.getSize()));
					texto.setFont(new Font (nombreFuente,Font.ITALIC, tamanio));
					System.out.println(estilo);
				} if(fuente.equals(negrita)) {
					System.out.println("has elegido  negrita");
					System.out.println(Font.BOLD);
					texto.setFont(new Font (nombreFuente,Font.BOLD, tamanio));
					System.out.println(estilo);
				} if(fuente.equals(normal)) {
					System.out.println("has elegido  normal");
					texto.setFont(new Font (nombreFuente, Font.PLAIN,tamanio));
					System.out.println(estilo);
					//texto.setFont(new Font (nombreFuente, 0, tamanio));
				} if(fuente.equals(grande)) {
					System.out.println("has elegido tamaño grande ");
					texto.setFont(new Font (nombreFuente,estilo , 35));
				} if(fuente.equals(mediana)) {
					System.out.println("has elegido tamaño mediano ");
					texto.setFont(new Font (nombreFuente, estilo, 25));
				} if(fuente.equals(peque)) {
					System.out.println("has elegido tamaño peque ");
					texto.setFont(new Font (nombreFuente, estilo, 15));
				}if(fuente.equals(calibri)) {
					System.out.println("has elegido letra calibri ");
					texto.setFont(new Font ("Calibri", estilo, tamanio));
				} if(fuente.equals(timesNR)) {
					System.out.println("has elegido letra times new roman ");
					texto.setFont(new Font ("Times New Roman", estilo, tamanio));
				} if(fuente.equals(arial)) {
					System.out.println("has elegido letra arial ");
					texto.setFont(new Font ("Arial", estilo, tamanio));
				}
				
			}
			
		}
	}
	
}

