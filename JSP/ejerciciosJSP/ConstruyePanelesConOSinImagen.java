package ejerciciosJSP;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConstruyePanelesConOSinImagen extends JPanel {
	int pulsado=0;
	static int pulsacion=0;
	OyeBotonAceptar evento1marco= new OyeBotonAceptar();
	JPanel laminaCajatexto;
	JTextField cajaTextoIntroducido = new JTextField(15);
	private JLabel imagenPanel, titularPanel, informacion;
	private JPanel superior= new JPanel(), medio= new JPanel(), inferior= new JPanel(),inf2= new JPanel();
	JButton aceptar;
	
	//----------constructor con imagen-------------------------------------------
	public ConstruyePanelesConOSinImagen(String rutaImagen, String textoLabelTitulo, String textoInformativo) {
		setVisible(true);
		setBounds(500, 300, 350, 350);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));	
		// inicializacion de los componentes----------------------------------
		imagenPanel = new JLabel(new ImageIcon(rutaImagen));
		titularPanel = new JLabel(textoLabelTitulo);
		titularPanel.setFont(new Font("Cambria", Font.BOLD, 25));
		informacion = new JLabel(textoInformativo);
// -------- configuracion del boton y creacion------------------
		iniciaBoton();
// añado los componentes a los paneles -------------------------------
		añadeComponentes();
		añadeBoton();
		
	}
	//----------constructor con imagen-------------------------------------------
	public ConstruyePanelesConOSinImagen(String textoInformativo) {
		setVisible(true);
		setBounds(500, 300, 350, 350);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));	
		// inicializacion de los componentes----------------------------------
		titularPanel=new JLabel(textoInformativo);
		titularPanel.setFont(new Font("Cambria", Font.BOLD, 25));
	//	informacion = new JLabel(textoInformativo);
// -------- configuracion del boton y creacion------------------
		iniciaBoton();
// añado los componentes a los paneles -------------------------------
		añadeComponentes();
		añadeBoton();
		
	}
	// constructor sin imagen------------------------------------------------
	public ConstruyePanelesConOSinImagen(String texto, String titulo) {
		setVisible(true);
		setBounds(500, 300, 350, 350);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel laminaCajatexto = new JPanel();
		laminaCajatexto.add(new JLabel(texto));
		laminaCajatexto.add(cajaTextoIntroducido);
		iniciaBoton();
		titularPanel=new JLabel(titulo);
		titularPanel.setFont(new Font("Cambria", Font.BOLD, 25));
		
		añadeComponentes();
		add(laminaCajatexto);
		añadeBoton();
		aceptar.removeActionListener(evento1marco);
		aceptar.addActionListener(new SacaPiramide());
	}
	public void añadeBoton() {
		add(inf2);
	}
	public JButton iniciaBoton() {
		aceptar = new JButton("ACEPTAR", new ImageIcon("imagenes/check.gif"));
		aceptar.setHorizontalTextPosition(SwingConstants.LEFT);
		aceptar.setBackground(Color.green.brighter());
		aceptar.addActionListener( evento1marco);
		return aceptar;
	}
	public void añadeComponentes() {
		//System.out.println(imagenPanel.getText());
		if (titularPanel!=null) {
			superior.add(titularPanel);
		}
		if (imagenPanel!=null) {
			medio.add(imagenPanel);
		}
		if (informacion!= null) {
			inferior.add(informacion);
		}
		// otorga margen por arriba-------------------------------------
		add(new JPanel());
		//añade el boton a la lamina inferior-----------------------------------------
		inf2.add(aceptar);
		//-------------------------------------------------------
		add(superior);
		add(medio);
		add(inferior);
		
	}
	private class OyeBotonAceptar implements ActionListener {
		 
		 String introducido;
		String intro2;
		Emergente2Pantalla cantidadPiramide;
			@Override
			public void actionPerformed(ActionEvent e) {
			
				
				if (pulsado==0) {
					//ConstruyePanelesConOSinImagen cantidadPiramide = new ConstruyePanelesConOSinImagen("Altura", "Panel Altura");
					cantidadPiramide=  new Emergente2Pantalla("Altura", "Introduccion de Altura");
			//	EmergenteEj1 cantidadPiramide = new EmergenteEj1("Altura", "Introduccion de Altura");
				 introducido=cajaTextoIntroducido.getText();
				 intro2=introducido;
				 System.out.println(intro2);
				pulsado++;
				}else {
					//JFrame marcPiramide = new JFrame();
					
					System.out.println("Es el momento de sacar otra emergente"+ intro2);
				}
			}

		}
	private class SacaPiramide implements ActionListener{
		JFrame marcoPiramide ;
		boolean esEntero=false;
		
		JPanel capa;
		int pisos=0;
		ArrayList<JPanel> imagenesporpiso = new ArrayList<JPanel>();
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(cajaTextoIntroducido.getText());
			marcoPiramide = new JFrame();
			
			capa = new JPanel();
			capa.setLayout(new BoxLayout(capa, BoxLayout.Y_AXIS));
//			if (pulsacion>1) {
//				capa.removeAll();
//				marcoPiramide.removeAll();
//				pulsacion=0;
//			}
			while (!esEntero) {
				
				try{
					 pisos=Integer.valueOf(cajaTextoIntroducido.getText());
					esEntero=true;
				}catch (Exception e2) {
					System.out.println(e2.getCause());
					System.out.println("error al convertir a entero");
					
					cajaTextoIntroducido.setText("Error al convertir a entero");
					break;
				}
			}
			calculaPisosInvertida(pisos);
			marcoPiramide.setVisible(true);
			marcoPiramide.setBounds(500, 300, 350, 350)	;
			if(!esEntero) {
				marcoPiramide.add(new JLabel("ERROR DE CONVERSION... INTRODUZCA UN VALOR ENTERO"));
			}
			//es necesario ponerlo a false otra vez para que evalue cada vez que se pulsa el boton
			// si lo que hay en la caja de texto es un entero
			esEntero=false;
			pulsacion++;
		
		}
		public void calculaPisosInvertida(int altura) {
			if(imagenesporpiso.size()>0) {
				JPanel unica = new JPanel();
				capa.add(unica);
				for (int i = 0; i<imagenesporpiso.size();i++) {
					imagenesporpiso.remove(i);
				}
				
			}
			
//			if (altura>1) {
				int base = (2*altura)-1;
				for (int i =0; i<altura; i++) {
					JPanel capa$i = new JPanel();
					for (int j = 0 ; j<base;j++) {
						JLabel img$j = new JLabel(new ImageIcon("imagenes/gru.gif"));
						capa$i.add(img$j);
						
					}
					if(base==0) {
						JLabel imgultima = new JLabel(new ImageIcon("imagenes/gru.gif"));
						capa$i.add(imgultima);
					}
					base-=2;
					
					imagenesporpiso.add(capa$i);
					//capa.add(capa$i);
				}
			imprimePiramideDerecha();
//			}else {
//				JLabel imgultima = new JLabel(new ImageIcon("imagenes/gru.gif"));
//				JPanel unica = new JPanel();
//				unica.add(imgultima);
//				capa.add(unica);
//			}
			marcoPiramide.add(capa);
		}
	
		public void imprimePiramideDerecha () {
			for (int a =imagenesporpiso.size()-1; a>=0; a--) {
				capa.add(imagenesporpiso.get(a));
			}
		}
		
	}
}
