package ejerciciosJSP;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MarcoAcceso mimar= new MarcoAcceso();
	}

}

class MarcoAcceso extends JFrame{
	public MarcoAcceso() {
		setVisible(true);
		setBounds(200,200,350,350);
		Paneles mi= new Paneles();
		add(mi);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class Paneles extends JPanel{
	private PanelAcceso superior, inferior;
	
	public Paneles() {
	
	//	
		//dispongo el marco en forma de boxlayout para colocar una lamina debajo de otra
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		 superior = new PanelAcceso(new ImageIcon("imagenes/usuario.gif"), "Usuario");
		
		 inferior = new PanelAcceso(new ImageIcon("imagenes/candado.gif"), "Contraseña");
		PanelAcceso top2 = new PanelAcceso("Control Acceso");
		PanelAcceso top= new PanelAcceso();
		PanelAcceso bottom= new PanelAcceso("Aceptar", new ImageIcon("imagenes/check.gif"), Color.green.darker());
		//añado los paneles 
		add(top);
		add(top2);
		add(superior);
		add(inferior);
		add(bottom);
	}
	private class PanelAcceso extends JPanel{
		public PanelAcceso(String titulo) {
			
			JLabel tituloLabel = new JLabel(titulo);
			tituloLabel.setFont(new Font ("Cambria",Font.BOLD, 25));
			add(tituloLabel);
		}
		public PanelAcceso() {
			
		}
		public PanelAcceso(String textoBoton, ImageIcon iconoBoton, Color colorBoton) {
			
			JButton boton= new JButton(textoBoton, iconoBoton);
			boton.setHorizontalTextPosition(SwingConstants.LEFT);
			boton.setBackground(colorBoton);
			boton.addActionListener(new OyenteBoton());
			add(boton);
		}
		public PanelAcceso(ImageIcon icono, String texto) {
			if (texto.equals("Contraseña")){
				cajaTexto= new JPasswordField(texto);
			}else {
				cajaTexto= new JTextField(texto);
			}
			
			cajaTexto.setForeground(Color.GRAY.brighter());
			cajaTexto.addFocusListener(new Oyentecajas2());
			cajaTexto.addMouseListener(new OyenteCajas());
			PanelAcceso2(icono, cajaTexto);
		}
		public void PanelAcceso2 (ImageIcon icono, JTextField cuadrotexto) {

			cuadrotexto.setColumns(15);
			JLabel ico  = new JLabel(icono);
			ico.setSize(200, 10);
			add(ico);
			add(cuadrotexto);
		}
		

		
		private JTextField cajaTexto;
		private class Oyentecajas2 implements FocusListener{

			// esta clase la utilizo para si al seleccionar cualquiera de las cajas de texto, 
			// ademas del raton, con el tabulador

				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource().equals(inferior.cajaTexto)) {
						if (inferior.cajaTexto.getText().equals("Contraseña")) {
							inferior.cajaTexto.setText("");
						}
					}
					if(e.getSource().equals(superior.cajaTexto)) {
						if (superior.cajaTexto.getText().equals("Usuario")) {
							superior.cajaTexto.setText("");
						}
					}
				}

				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			}
			
		}
		private class OyenteCajas implements MouseListener{

				//evalua la fuente (que caja has pulsado)
				//dependiendo de cual sea , pon el texto a 0 si es lo que estaba puesto de inicio
				//usuario, contraseña
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("has pulsado la caja texto");
				if(e.getSource().equals(superior.cajaTexto)) {
					if (superior.cajaTexto.getText().equals("Usuario")) {
						superior.cajaTexto.setText("");
					}
				}
				if(e.getSource().equals(inferior.cajaTexto)) {
					if (inferior.cajaTexto.getText().equals("Contraseña")) {
						inferior.cajaTexto.setText("");
					}
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
		private class OyenteBoton implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el boton");
				String usuario= superior.cajaTexto.getText();
				String contrasenia= inferior.cajaTexto.getText();
				System.out.println(usuario);
				System.out.println(contrasenia);
				int contador=0;
				try {
				
					Class.forName("com.mysql.jdbc.Driver");
					String conexion = "jdbc:mysql://localhost/bd1?user=root&password=?useLegacyDatetimeCode=false&serverTimezone=UTC";  
					Connection conec= DriverManager.getConnection(conexion,"root", "");
					Statement	primerState = conec.createStatement();
					//pregunto a la bbdd si hay alguna coincidencia de user y contraseña, si es asi, 
				// se permite el acceso, sino opcion de ... quieres registrarte?
					ResultSet consultaUsuariosContra= primerState.executeQuery("select * from registro where usuario = '"+ usuario+ "'"
							+ " and password= '"+ contrasenia+"'");
					if (consultaUsuariosContra.next()) {
						Emergente2Pantalla em = new Emergente2Pantalla("imagenes/candadoabierto.gif","Control de Acceso","Acceso Concedido");
					}else {
						//aqui generar el panel de quiere registrarse?? 
						PantallaRegistro mi = new PantallaRegistro();
					}
//					while (consultaUsuariosContra.next()) {
//						contador++;
//					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println(e.getSource());
					System.out.println("Error al manejar el driverJDBCSql");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					System.out.println("Problemas al conectar a la bdd ");
				}
			}
			
		}

	
	
	
}

