package ejerciciosJSP;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class PanelRegistro extends JPanel{
	JPanel usuario= new JPanel();
	JPanel contras= new JPanel();
	JPanel repiteContr= new JPanel();
	JPanel informacion = new JPanel();
	JPanel boton = new JPanel();
	JTextField contra1 = new JPasswordField(15);
	JTextField contra2 = new JPasswordField(15);
	JTextField usuarioTexto = new JTextField(15);
	JButton registra= new JButton("Registrarse");
	
	
	public PanelRegistro() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel titulo = new JLabel("FORMULARIO REGISTRO");
		titulo.setFont(new Font("Cambria", Font.BOLD, 18));
		//--------------------------
		usuario.add(new JLabel("Usuario"));
		usuario.add(usuarioTexto);
		//-----------------------------
		contras.add(new JLabel("Contraseña"));
		contras.add(contra1);
		//----------------------------------
		repiteContr.add(new JLabel("Repita contraseña"));
		repiteContr.add(contra2);
		registra.setBackground(Color.red.brighter().brighter());
		registra.addActionListener(new OyenteRegistro());
		boton.add(registra);
		//-----------------------
		add(titulo);
		add(usuario);
		add(contras);
		add(repiteContr);
		add(boton);
		add(informacion);
	}
	private class OyenteRegistro implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
				boolean contraIguales=false;
				String nombreUser= usuarioTexto.getText();
				String contraUser= contra1.getText();
				String contrauser2= contra2.getText();
				if (!contrauser2.equals(contraUser)) {
					System.out.println("las contraseñas no coinciden");
					JFrame error = new JFrame();
					error.setVisible(true);
					error.setBounds(400, 400, 222, 150);
					error.add(new JLabel("Error !! las contraseñas no son iguales"));
					
				}else {
					contraIguales=true;
				}
				if (contraIguales) {
					try {
				Class.forName("com.mysql.jdbc.Driver");
				String conexion = "jdbc:mysql://localhost/bd1?user=root&password=?useLegacyDatetimeCode=false&serverTimezone=UTC";  
				Connection conec = DriverManager.getConnection(conexion,"root", "");
				Statement	primerState = conec.createStatement();
				primerState.executeUpdate("insert into registro (usuario,password)values ('"+ nombreUser+ "', '"+ contraUser+"')");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
				}
		
		}
		
	}
}
