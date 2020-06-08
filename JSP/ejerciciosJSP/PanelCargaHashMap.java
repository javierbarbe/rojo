package ejerciciosJSP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;



public class PanelCargaHashMap extends JPanel {
	LinkedList<String> usuariosLista = new LinkedList<String>();
	LinkedList<String> contraseniasLista = new LinkedList<String>();
	ArrayList<JPanel> arrayPaneles = new ArrayList<JPanel>();
	JTextField usuario = new JTextField(8);
	JTextField contra = new JTextField(8);
	JButton editar = new CreaBotones().iniciaBoton();
	JPanel central = new JPanel();
	int elegido=0;
//	JFrame marcoHasmap = new JFrame();
	int tamanio=0;
	JTable tablaUsers= new JTable();
	public  PanelCargaHashMap(HashMap<String, String> cargado) {
		central.setAutoscrolls(true);
		central.setLayout(new BoxLayout(central, BoxLayout.Y_AXIS));
		setLayout(new BorderLayout());
		cabecera();
		// coloco esta lamina en disposicion box
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		// --- cargo en las listas los valores del hashmap-----------------------
		for (Map.Entry<String, String> entry : cargado.entrySet()) {
			usuariosLista.add(entry.getKey());
			contraseniasLista.add(entry.getValue());
		}
		// ---------------------------------------
		 tamanio = cargado.size();
		for (int i = 0; i < tamanio; i++) {
			// creo la lamina en la que va a ir usuario, contraseña y boton editar (hay que
			// ponerle a la escucha)
			JPanel lamina$i = new JPanel();
			JTextField usuario$i = new JTextField(10);
			JTextField contra$i = new JTextField(10);
			JButton editar$i = new  CreaBotones().iniciaBoton();
			JButton eliminar$i = new CreaBotones().iniciaBoton();
	
			// si no quisiera mostrar ni modificar la de root -----------------------------------------------
		//	if (!usuariosLista.get(i).equals("root")) {
		//-------------------------------------------------------------------------------------------------		
//				lamina$i.setLayout(new GridLayout(tamanio, 3));
				lamina$i.add(new JLabel(""+(i+1)));

				// cargo los valores de la consultaSQL
				usuario$i.setText( usuariosLista.get(i));
				contra$i.setText(contraseniasLista.get(i));
				
				usuario$i.setEnabled(false);
				contra$i.setEnabled(false);
				usuario$i.setForeground(Color.black);
				// añado a la lamina usuario, contraseña y boton
				lamina$i.add(usuario$i); //1
				lamina$i.add(new JLabel());
				lamina$i.add(contra$i);//3
				lamina$i.add(new JLabel());
				eliminar$i.setText("Eliminar");
				eliminar$i.addActionListener(new EliminaRegistro());
				
				editar$i.setText("Editar");
				editar$i.addActionListener(new OyenteModificaUser()); //5
				lamina$i.add(editar$i);
				eliminar$i.setEnabled(false);
				lamina$i.add(eliminar$i);
				lamina$i.add(new JLabel());
				//----------------------------------------------------
			
				// añado la lamina al array y al central
				arrayPaneles.add(lamina$i);
			
				central.add(lamina$i);
				
				System.out.println("añadida la lamina " + i);
				
			//} ------------ si no quisiera mostrar la root  ( cierre if )
			
		}
	
		add(central, BorderLayout.CENTER);
		cargaPadre();
		
	}
	public void cabecera() {
		JPanel cabecera = new JPanel();
		
		cabecera.setLayout(new GridLayout(1,5));
		cabecera.add(new JLabel());
		cabecera.add(new JLabel("Usuario"));
		
		
		cabecera.add(new JLabel("Contraseña"));
		cabecera.add(new JLabel());
		cabecera.add(new JLabel());
		
		add(cabecera,BorderLayout.NORTH);
	}

	public void cargaPadre() {
		JPanel fondo = new JPanel();
		JButton crearUser=  new CreaBotones().iniciaBoton();
		crearUser.setText("Crear Usuario");
		crearUser.addActionListener(new oyenteCreaUsuario());
		fondo.add(crearUser);
		add(fondo, BorderLayout.SOUTH);

	}
	private class oyenteCreaUsuario implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			PantallaRegistro mi = new PantallaRegistro();
		}
		
	}
	private class OyenteModificaUser implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			// es el 5 elemento dentro de cada panel
			for ( int i = 0; i < arrayPaneles.size(); i++) {
				System.out.println(e.getSource().equals(arrayPaneles.get(i).getComponent(5)));
				if (e.getSource().equals(arrayPaneles.get(i).getComponent(5))){
					elegido=i;
					break;
				}
			}
		
		cajaElegida1= (JTextField)	arrayPaneles.get(elegido).getComponent(1);
		cajaElegida1.setEnabled(true);
		cajaElegida2 = (JTextField) arrayPaneles.get(elegido).getComponent(3);
		cajaElegida2.setEnabled(true);
		JButton eleccionBoton=	(JButton) arrayPaneles.get(elegido).getComponent(5);
		JButton eliminador= (JButton) arrayPaneles.get(elegido).getComponent(6);
		eliminador.setEnabled(true);
		eleccionBoton.setText("Guardar");	
		eleccionBoton.addActionListener(new clickRestaura());;
			
		
			
		}
		
	}
	private class clickRestaura implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String previo= cajaElegida1.getText();
			String conexion = "jdbc:mysql://localhost/bd1?user=root&password=?useLegacyDatetimeCode=false&serverTimezone=UTC";
			try {
				Connection con = DriverManager.getConnection(conexion, "root", "");
				Statement primerStat= con.createStatement();
				primerStat.executeUpdate("insert into registro values ( '"+cajaElegida1.getText()+"', '" +
						cajaElegida2.getText()+"')");
				System.out.println(previo);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("error al conectar a la bbdd");
				System.out.println(e1.getMessage());
			}		
			
		}
		
	}
	private class EliminaRegistro implements ActionListener{
		boolean contenido=false;
		@Override
		public void actionPerformed(ActionEvent e) {
			String previo= cajaElegida1.getText();
			System.out.println(previo);
			// TODO Auto-generated method stub
			String conexion = "jdbc:mysql://localhost/bd1?user=root&password=?useLegacyDatetimeCode=false&serverTimezone=UTC";
			try {
				for (String str : usuariosLista) {
					if (str.equals(previo)) {
						contenido=true;
					}
				}
				Connection con = DriverManager.getConnection(conexion, "root", "");
				Statement primerStat= con.createStatement();
				
				if(contenido==true) {
					primerStat.executeUpdate("delete from registro where usuario = '"+previo+"'");
					System.out.println(previo+ " eliminado");
					contenido=false; 
					 Emergente2Pantalla eliminacionOk= new Emergente2Pantalla( "Usuario "+previo+" Eliminado");
					 //
					  ActionListener [] listeneres=eliminacionOk.pa.aceptar.getActionListeners();
					  eliminacionOk.pa.aceptar.removeActionListener(listeneres[0]);
				}else {
					System.out.println("el usuario no existe");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("error al conectar a la bbdd");
				System.out.println(e1.getMessage());
			}		
			
		}
		
	}
	JTextField cajaElegida1;
	JTextField cajaElegida2;
}


