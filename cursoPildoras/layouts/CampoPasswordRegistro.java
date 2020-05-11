package layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.http.WebSocket.Listener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CampoPasswordRegistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPassword mo = new MarcoPassword();
	}

}

class MarcoPassword extends JFrame {
	boolean patr = false;
	boolean numeros, mayusculas, minusculas, punto;
	Pattern pat = Pattern.compile("[a-z]");
	Pattern mays = Pattern.compile("[A-Z]");
	Pattern nume = Pattern.compile("[0-9]");
	JButton comprobar = new JButton("Registro");
	JTextField nombre = new JTextField("a1.asaA", 15);
	JLabel etiquetaNombre = new JLabel("Nombre");
	JLabel etiquetaUsuario = new JLabel("   Usuario");
	JTextField usuario = new JTextField("a1.asaA", 15);
	JPasswordField contra1 = new JPasswordField(15);
	JLabel contra1etiq = new JLabel("Contraseña");
	JLabel contra2etiq = new JLabel("   Repita Contraseña");
	JPasswordField contra2 = new JPasswordField(15);
	Document midoc = contra1.getDocument();
	Document midoc2 = contra2.getDocument();
	private JLabel resultado = new JLabel("", JLabel.CENTER);
	private String contraString = "";
	private String contraString2 = "";
	
	public MarcoPassword() {
		setLayout(new BorderLayout());
		setVisible(true);
		setBounds(700, 200, 700, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel laminaContenedoraSuperior = new JPanel();
		add(laminaContenedoraSuperior, BorderLayout.NORTH);
		JPanel laminaPrimaria = new JPanel();
		laminaPrimaria.setLayout(new GridLayout(2, 4));

		laminaPrimaria.add(etiquetaNombre);
		laminaPrimaria.add(nombre);
		laminaPrimaria.add(etiquetaUsuario);
		laminaPrimaria.add(usuario);
		laminaPrimaria.add(contra1etiq);
		laminaPrimaria.add(contra1);
		laminaPrimaria.add(contra2etiq);
		laminaPrimaria.add(contra2);
		OyenteContraseña mi = new OyenteContraseña();
		compruebaContraseña me = new compruebaContraseña();
		midoc2.addDocumentListener(me);
		midoc.addDocumentListener(mi);
		laminaContenedoraSuperior.add(laminaPrimaria);
		compruebaContraBoton boton = new compruebaContraBoton();
		comprobar.addActionListener(boton);
		add(comprobar, BorderLayout.SOUTH);
		add(resultado);

	}

	private class compruebaContraBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String usu = usuario.getText();
			String nom = nombre.getText();

			if (nom.length() > 3) {
				nombre.setBackground(Color.white);
				if (usu.length() > 3) {

					compruebaContraseña mop = new compruebaContraseña();
					usuario.setBackground(Color.white);

					if (mop.insertUpdate3() == true) {
						System.out.println("ha funcionado el usar un submetodo");
						resultado.setText("EUREKA");

					} else {
						contra2.setBackground(Color.red);
						contra1.setBackground(Color.red);
					}
				} else {
					System.out.println("campos nombre sin rellenar o longitud demasiado corta");

					usuario.setBackground(Color.red);
				}
			} else {
				System.out.println("campos usuario sin rellenar o longitud demasiado corta");
				System.out.println(usu);
				nombre.setBackground(Color.red);
			}
			
				
		
		}

	}

	private class compruebaContraseña implements DocumentListener {
		
		char[] contrasena1 = contra1.getPassword();
		char[] contrasena2 = contra2.getPassword();
		
		public boolean insertUpdate3() {

			contraString = "";
			contraString2 = "";
			for (int i = 0; i < contrasena1.length; i++) {
				contraString += contrasena1[i];
			}
			for (int i = 0; i < contrasena2.length; i++) {
				contraString2 += contrasena2[i];
			}
			Matcher mayus= mays.matcher(contraString);
			Matcher numes= nume.matcher(contraString);
			Matcher minus= pat.matcher(contraString);
			//
if (contraString.contains(".")) {
				punto=true;
				if(mayus.find()) {
					mayusculas=true;
					if(minus.find()) {
						minusculas=true;
						if (numes.find()) {
							numeros=true;
						}else {
							System.out.println("no tiene numero");
							numeros=false;
						}
					}else {
					System.out.println("no teien minuscula");
					minusculas=false;
					}
				}else {
					mayusculas=false;
					System.out.println("no tiene mayuscula");
					}
			}  else {
				punto=false;
				System.out.println("no tiene punto");
				}
		if(mayusculas &&minusculas && numeros&& punto) {
			System.out.println("tiene un punto mayuscula minuscula y un numero PROBANDO linea 136");
			patr=true;
		}else {
			patr=false;
		}
			if (contraString.equals(contraString2) && contraString.length() >= 3 && patr) {
				System.out.println("Las contraseñas coinciden");
				contra1.setBackground(Color.green);
				contra2.setBackground(Color.green);
				return true;
			} else {
				
				System.out.println("insertupdate3 patr: " + patr);
				System.out.println("181 las contraseñas no coinciden, o es demasiado corta la longitud");

			}
			return false;
		}

		public void insertUpdate(DocumentEvent e) {

			for (int i = 0; i < contrasena1.length; i++) {
				contraString += contrasena1[i];

			}

			for (int i = 0; i < contrasena2.length; i++) {
				contraString2 += contrasena2[i];
			}

			if (contraString.length() >= 8) {
				System.out.println("tamaño minimo alcanzado");
				contra1.setBackground(Color.white);
				contra2.setBackground(Color.PINK);

			} else {
				System.out.println(patr + " es el patron");
				System.out.println("206 es demasiado corta la longitud");

			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			if (contra1.getText().equals(contra2.getText()) && midoc.getLength() >= 8) {
				System.out.println("las contraseñas coinciden");
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}
	}

	private class OyenteContraseña implements DocumentListener {

		public OyenteContraseña() {

		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

			if (midoc.getLength() < 8) {
				// contra1.setBackground(Color.red);

			} else {
				contra1.setBackground(Color.green);
			}

		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}

	}
}

class PanelSupPassword extends JPanel {
	JTextField nombre = new JTextField(15);
	JLabel etiquetaNombre = new JLabel("Nombre");
	JLabel etiquetaUsuario = new JLabel("Usuario");
	JTextField usuario = new JTextField(15);

	public PanelSupPassword() {
		// setLayout();
		// setLayout(new BorderLayout());
		add(etiquetaNombre);// , BorderLayout.WEST);
		add(nombre);// , BorderLayout.SOUTH);
		add(etiquetaUsuario);// , BorderLayout.EAST);
		add(usuario);// , BorderLayout.WEST);
	}

}
