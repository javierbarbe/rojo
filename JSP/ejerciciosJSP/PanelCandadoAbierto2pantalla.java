package ejerciciosJSP;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelCandadoAbierto2pantalla extends JPanel {
	int pulsado=0;
	OyeBotonAceptar evento1marco= new OyeBotonAceptar();
	JPanel laminaCajatexto;
	JTextField cajaTextoIntroducido = new JTextField(15);
	private JLabel imagenPanel, titularPanel, informacion;
	private JPanel superior= new JPanel(), medio= new JPanel(), inferior= new JPanel(),inf2= new JPanel();
	JButton aceptar;
	public PanelCandadoAbierto2pantalla(String rutaImagen, String textoLabelTitulo, String textoInformativo) {
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
	
	public PanelCandadoAbierto2pantalla(String texto, String titulo) {
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
	public void iniciaBoton() {
		aceptar = new JButton("ACEPTAR", new ImageIcon("imagenes/check.gif"));
		aceptar.setHorizontalTextPosition(SwingConstants.LEFT);
		aceptar.setBackground(Color.green.brighter());
		aceptar.addActionListener( evento1marco);
		
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
		
		inf2.add(aceptar);
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
					cantidadPiramide=  new Emergente2Pantalla("Altura", "Introduccion de Altura");
			//	EmergenteEj1 cantidadPiramide = new EmergenteEj1("Altura", "Introduccion de Altura");
				 introducido=cajaTextoIntroducido.getText();
				 intro2=introducido;
				 System.out.println(intro2);
				pulsado++;
				}else {
					JFrame marcPiramide = new JFrame();
					
					System.out.println("Es el momento de sacar otra emergente"+ intro2);
				}
			}

		}
	private class SacaPiramide implements ActionListener{
		JFrame marcoPiramide ;
		boolean esEntero=false;
		JPanel capa;
		int pisos=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(cajaTextoIntroducido.getText());
			marcoPiramide = new JFrame();
			capa = new JPanel();
			capa.setLayout(new BoxLayout(capa, BoxLayout.Y_AXIS));
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
			calculaPisos(pisos);
			marcoPiramide.setVisible(true);
			marcoPiramide.setBounds(500, 500, 350, 350)	;
			if(!esEntero) {
				marcoPiramide.add(new JLabel("ERROR DE CONVERSION... INTRODUZCA UN VALOR ENTERO"));
			}
		}
		public void calculaPisos(int altura) {
			for (int i =0; i<altura; i++) {
				JLabel img$i = new JLabel(new ImageIcon("imagenes/gru.gif"));
				JPanel capa$i = new JPanel();
				capa$i.add(img$i);
				capa.add(capa$i);
				
			}
			marcoPiramide.add(capa);
		}
	}
}
