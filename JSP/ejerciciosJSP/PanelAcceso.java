//package ejerciciosJSP;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import javax.swing.SwingConstants;
//
//import ejerciciosJSP.Paneles.OyenteBoton;
//import ejerciciosJSP.Paneles.OyenteCajas;
//import ejerciciosJSP.Paneles.PanelAcceso.Oyentecajas2;
//
//public class PanelAcceso extends JPanel{
//	public PanelAcceso(String titulo) {
//		
//		JLabel tituloLabel = new JLabel(titulo);
//		tituloLabel.setFont(new Font ("Cambria",Font.BOLD, 25));
//		add(tituloLabel);
//	}
//	public PanelAcceso() {
//		
//	}
//	public PanelAcceso(String textoBoton, ImageIcon iconoBoton, Color colorBoton) {
//		
//		JButton boton= new JButton(textoBoton, iconoBoton);
//		boton.setHorizontalTextPosition(SwingConstants.LEFT);
//		boton.setBackground(colorBoton);
//		boton.addActionListener(new OyenteBoton());
//		add(boton);
//	}
//	public PanelAcceso(ImageIcon icono, String texto) {
//		if (texto.equals("Contraseña")){
//			cajaTexto= new JPasswordField(texto);
//		}else {
//			cajaTexto= new JTextField(texto);
//		}
//		
//		cajaTexto.setForeground(Color.GRAY.brighter());
//		cajaTexto.addFocusListener(new Oyentecajas2());
//		cajaTexto.addMouseListener(new OyenteCajas());
//		PanelAcceso2(icono, cajaTexto);
//	}
//	public void PanelAcceso2 (ImageIcon icono, JTextField cuadrotexto) {
//
//		cuadrotexto.setColumns(15);
//		JLabel ico  = new JLabel(icono);
//		ico.setSize(200, 10);
//		add(ico);
//		add(cuadrotexto);
//	}
//	
//
//	
//	private JTextField cajaTexto;
//	private class Oyentecajas2 implements FocusListener{
//
//		// esta clase la utilizo para si al seleccionar cualquiera de las cajas de texto, 
//		// ademas del raton, con el tabulador
//
//			@Override
//			public void focusGained(FocusEvent e) {
//				// TODO Auto-generated method stub
//				if(e.getSource().equals(inferior.cajaTexto)) {
//					if (inferior.cajaTexto.getText().equals("Contraseña")) {
//						inferior.cajaTexto.setText("");
//					}
//				}
//				if(e.getSource().equals(superior.cajaTexto)) {
//					if (superior.cajaTexto.getText().equals("Usuario")) {
//						superior.cajaTexto.setText("");
//					}
//				}
//			}
//
//			@Override
//			public void focusLost(FocusEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		}
//		
//	}