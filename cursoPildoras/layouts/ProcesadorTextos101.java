package layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.AlignmentAction;
import javax.swing.text.StyledEditorKit.BoldAction;

import tema7.Circulo;
public class ProcesadorTextos101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesadorTextos no = new MarcoProcesadorTextos();

	}

}
 

class MarcoProcesadorTextos extends JFrame{
	JLabel texto= new JLabel("En un lugar de la Mancha...");
	JTextPane panelEscritura= new JTextPane();
	JToolBar barra2= new JToolBar();
	JButton  negritaBarra, cursivaBarra, subra,  azulbarra, rojobarra,amarillobarra,a_izquierda,a_centrado, a_derecha, a_justificado;
	public MarcoProcesadorTextos() {
		setLayout(new BorderLayout());
		setVisible(true);
		//MarcoMenu me = new MarcoMenu();
		setBounds(600,300,290,120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelProcesador pi = new PanelProcesador();

		add(pi, BorderLayout.NORTH);
		panelEscritura.setSize(200, 500);
		//add(texto, BorderLayout.WEST);
		add(panelEscritura,BorderLayout.CENTER);
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem CursivaE = new JMenuItem("Cursiva");
		JMenuItem NegritaE = new JMenuItem("Negrita");
		emergente.add(NegritaE);
		emergente.add(CursivaE);
		panelEscritura.setComponentPopupMenu(emergente);
		NegritaE.addActionListener(new StyledEditorKit.BoldAction());
		CursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		//AL DEVOLVER EL METODO CONFIGURA_BARRA UN BOTON, DIRECTAMENTE ES COMO SI FUERA UN BOTON, POR LO QUE,
		// EN LA MISMA LINEA LO PUEDO PONER DIRECTAMENTE A LA ESCUCHA
		//------------------estilos --------------------------------------------------------------
		configuraBarra("imagenes/negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
		configuraBarra("imagenes/cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configuraBarra("imagenes/subra.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		//-----------------botones de colores
		configuraBarra("imagenes/azul.gif").addActionListener(new StyledEditorKit.ForegroundAction("poner azul", Color.blue));
		configuraBarra("imagenes/rojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("poner rojo", Color.red));
		configuraBarra("imagenes/amarillo.gif").addActionListener(new StyledEditorKit.ForegroundAction("poner azul", Color.yellow));
		//-----------------alineacion del texto
		configuraBarra("imagenes/alineadoIz.gif").addActionListener(new StyledEditorKit.AlignmentAction("iz", 0));
		configuraBarra("imagenes/centrado.gif").addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
		configuraBarra("imagenes/alineadoDer.gif").addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
		configuraBarra("imagenes/justificado.gif").addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
		/*JToolBar barra2 = new JToolBar();
		JButton cursivaBarra = new JButton(new ImageIcon("imagenes/cursiva.gif"));
		JButton negritaBarra= new JButton(new ImageIcon("imagenes/negrita.gif"));
		JButton subra= new JButton(new ImageIcon("imagenes/subra.gif"));
		//colores en el texto-----------------
		JButton azulbarra= new JButton(new ImageIcon("circuloazul.gif"));
		JButton amarillobarra= new JButton(new ImageIcon("circuloamarillo.gif"));
		JButton rojobarra= new JButton(new ImageIcon("circulorojo.gif"));
		//----oyente estilo de texto---------------------------------------------------
		subra.addActionListener(new StyledEditorKit.UnderlineAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		// oyentes cambia color de texto---------------------------------
		rojobarra.addActionListener(new StyledEditorKit.ForegroundAction("letra rojo " ,Color.RED));
		azulbarra.addActionListener(new StyledEditorKit.ForegroundAction("letra azul " ,Color.BLUE));
		amarillobarra.addActionListener(new StyledEditorKit.ForegroundAction("letra amarillo " ,Color.YELLOW));
		//-- añado a la barra los elementos-----------
		barra2.add(cursivaBarra);
		barra2.add(negritaBarra);
		barra2.add(subra);
		barra2.add(amarillobarra);
		barra2.add(azulbarra);
		barra2.add(rojobarra);*/
		// para cambiar la disposicion de los elementos de la barra usamos el metodo setOrientation
		barra2.setOrientation(1);
		
		add(barra2, BorderLayout.WEST);
	}
	
	// metodo para simplificar y no tener 5000 lineas de codigo, genero el boton y lo añado a la barra 
	//despues como devuelve un boton este metodo, puedo acceder a los metodos del boton y ponerlo asi a la escucha
	public JButton configuraBarra(String  ruta) {
		JButton boton = new JButton(new ImageIcon(ruta));
		barra2.add(boton);
		return boton;
	}
	//---------------------------------------------------------------------
	private class PanelProcesador extends JPanel{
		
		JMenuBar barra = new JMenuBar();
		//checkboxes
		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("bin/graficos/cortar.gif"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("bin/graficos/pegar.gif"));
		
		//negrita.addActionListener(new StyledEditorKit.BoldAction());
		JRadioButton uno = new JRadioButton();
		//-------botones principales--------------------------
		JMenu fuente= new JMenu("Fuente");
		JMenu estilo= new JMenu("Estilo");
		JMenu formato= new JMenu("Formato");
	//---------OPCIONES DE LOS BOTONES -----------------------
		//tipo de fuente
		JMenuItem arial= new JMenuItem("Arial");
		JMenuItem calibri = new JMenuItem("Calibri");
		JMenuItem timesNR = new JMenuItem("Times New Roman");
		//************************
		//tipo letra
//		JMenuItem cursiva= new JMenuItem("Cursiva");
//		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem normal = new JMenuItem("Normal");
		//tamaño letra
		JMenuItem grande = new JMenuItem("Grande");
		JMenuItem mediana = new JMenuItem("Mediana");
		JMenuItem peque = new JMenuItem("Pequeña");
		public PanelProcesador() { 
			setLayout(new BorderLayout());
			negrita.addActionListener(new StyledEditorKit.BoldAction());
			cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		// añado los listeners 
			//----------estilos  de letra-------------------------
			cursiva.addActionListener(new oyenteMenu());
			negrita.addActionListener(new oyenteMenu());
			normal.addActionListener(new oyenteMenu());
			//------- tipos de letra --------------------------
			arial.addActionListener(new oyenteMenu());
			calibri.addActionListener(new oyenteMenu());
			timesNR.addActionListener(new oyenteMenu());
			//--------- tamaño de letra----------------
			grande.addActionListener(new StyledEditorKit.FontSizeAction("",35));
			mediana.addActionListener(new StyledEditorKit.FontSizeAction("",25));
			peque.addActionListener(new StyledEditorKit.FontSizeAction("",15));
		///******************
			
			//-------------- AÑADO LOS ATAJOS DEL TECLADO PARA LAS DISTINTAS FUNCIONES
	
					grande.setAccelerator(KeyStroke.getKeyStroke("ctrl D"));
					mediana.setAccelerator(KeyStroke.getKeyStroke("ctrl M"));
					//tambien se puede hacer 		 aqui es la F + CTRL
					peque.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
					negrita.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
					cursiva.setAccelerator(KeyStroke.getKeyStroke("ctrl K"));
			//--------------------
			
			
	//añado las opciones a los desplegables
			estilo.add(cursiva);
			estilo.add(negrita);
		//	estilo.add(normal);
	//--------------------------------		
			formato.add(grande);
			formato.add(mediana);
			formato.add(peque);
	//-------------------------------		
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
///////////////////////****
			
			//add(texto);
		
		}
		private class oyenteMenu implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object fuenteEvento = e.getSource();
				Font letraActual=panelEscritura.getFont();
				System.out.println("has elegido "+letraActual);
				int tamanio=letraActual.getSize();
				int estilo= letraActual.getStyle();
				System.out.println(estilo+ " este es el estilo");
				String nombreFuente = letraActual.getFontName();
				System.out.println("su nombre es "+ nombreFuente);
				if (nombreFuente.indexOf(".")!=-1) {
					 nombreFuente=nombreFuente.substring(0,nombreFuente.indexOf("."));
				}
				System.out.println(nombreFuente+ " es sin la extension");
				/// --------para poder gestionarlo con un switch--------------------
					int pos= fuenteEvento.toString().lastIndexOf("text=");
					int fin= fuenteEvento.toString().lastIndexOf("]");
					pos+=5;
					String eleccion= (fuenteEvento.toString().substring(pos,fin));
					System.out.println(fuenteEvento.toString().substring(pos,fin));
				//-----------------------------------------------------------	
				switch (eleccion) {
				case "Cursiva": if(cursiva.isSelected()) {
									
										if (negrita.isSelected()) {
											panelEscritura.setFont(new Font (nombreFuente,1, tamanio));
										}else {
											panelEscritura.setFont(new Font (nombreFuente,0, tamanio));
										}
								}else {
									panelEscritura.setFont(new Font (nombreFuente,2, tamanio));
									if (negrita.isSelected()) {
										panelEscritura.setFont(new Font (nombreFuente,3, tamanio));
									}
								}
	
								break;
				case "Negrita" : 
							if(negrita.isSelected()) {
									//cursiva.setSelected(false);
									if (cursiva.isSelected()) {
										panelEscritura.setFont(new Font (nombreFuente,2, tamanio));
									}else {
										panelEscritura.setFont(new Font (nombreFuente,0, tamanio));
									}
							}else {
								panelEscritura.setFont(new Font (nombreFuente,1, tamanio));
								if (cursiva.isSelected()) {
									panelEscritura.setFont(new Font (nombreFuente,3, tamanio));
								}
							}
							
							
								break;
				case "Normal" : 
								panelEscritura.setFont(new Font (nombreFuente, 0,tamanio));
//								System.out.println(texto.getFont());
								break;
				case "Grande": panelEscritura.setFont(new Font (nombreFuente,estilo , 35));
								break;
				case "Mediana": panelEscritura.setFont(new Font (nombreFuente, estilo, 25));
//								System.out.println(texto.getFont());
								break;
				case "Pequeña": panelEscritura.setFont(new Font (nombreFuente, estilo, 15));
//								System.out.println(texto.getFont());
								break;
				case "Calibri": panelEscritura.setFont(new Font ("Calibri", estilo, tamanio));
							
								break;
				case "Times New Roman":	panelEscritura.setFont(new Font ("Times New Roman", estilo, tamanio));
//										System.out.println(texto.getFont());
										
										break;
				case "Arial":  	panelEscritura.setFont(new Font ("Arial", estilo, tamanio));
//								System.out.println(texto.getFont());
				
								break;
				}
				//System.out.println("Estilo: "+estilo+ " Tipo Letra: "+ nombreFuente+" Tamaño: "+tamanio);
				if (fuenteEvento.equals(cursiva)) {
					//System.out.println("has elegido  cursiva");
//					texto.setFont(new Font (nombreFuente, 2, fuentes.getSize()));
				//	texto.setFont(new Font (nombreFuente,Font.ITALIC, tamanio));
					//System.out.println(estilo);
				} if(fuenteEvento.equals(negrita)) {
					//System.out.println("has elegido  negrita");
//					System.out.println(Font.BOLD);
//					texto.setFont(new Font (nombreFuente,Font.BOLD, tamanio));
//					System.out.println(estilo);
				} if(fuenteEvento.equals(normal)) {
//					System.out.println("has elegido  normal");
//					texto.setFont(new Font (nombreFuente, Font.PLAIN,tamanio));
//					System.out.println(estilo);
					//texto.setFont(new Font (nombreFuente, 0, tamanio));
				} if(fuenteEvento.equals(grande)) {
//					System.out.println("has elegido tamaño grande ");
//					texto.setFont(new Font (nombreFuente,estilo , 35));
				} if(fuenteEvento.equals(mediana)) {
//					System.out.println("has elegido tamaño mediano ");
//					texto.setFont(new Font (nombreFuente, estilo, 25));
				} if(fuenteEvento.equals(peque)) {
//					System.out.println("has elegido tamaño peque ");
//					texto.setFont(new Font (nombreFuente, estilo, 15));
				}if(fuenteEvento.equals(calibri)) {
//					System.out.println("has elegido letra calibri ");
//					texto.setFont(new Font ("Calibri", estilo, tamanio));
				} if(fuenteEvento.equals(timesNR)) {
//					System.out.println("has elegido letra times new roman ");
//					texto.setFont(new Font ("Times New Roman", estilo, tamanio));
				} if(fuenteEvento.equals(arial)) {
//					System.out.println("has elegido letra arial ");
//					texto.setFont(new Font ("Arial", estilo, tamanio));
				}
				
			}
			
		}
	}
	
}

