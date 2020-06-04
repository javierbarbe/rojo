package layouts.marcoscajas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Marco_Dialogos extends JFrame {

	public Marco_Dialogos() {
		setVisible(true);
		setBounds(400, 400, 450, 435);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel micuadricula = new JPanel();
		micuadricula.setLayout(new GridLayout(2, 3));
		String[] primero = { "Mensaje", "Confirmar", "Opcion", "Entrada" };
		lamina_tipo = new Lamina_botones("Tipo", primero);

		lamina_mensaje = new Lamina_botones("Tipo Mensaje",
				new String[] { "ErrorMessage", "WarningMessage", "QuestionMessage", "PlainMessage", "InformationMessage" });
 
		lamina_2mensaje = new Lamina_botones("Mensaje",
				new String[] { "Cadena", "Icono", "Componente", "Otros", "Objects[]" });
		lamina_TipoOpcion = new Lamina_botones("Tipo Opcion",
				new String[] { "DEFAULT", "YES_NO_OPTION","YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" });

		lamina_opciones = new Lamina_botones("Opciones", new String[] { "String[]", "Icon[]", "Object[]" });

		lamina_entrada = new Lamina_botones("Entrada", new String[] { "Campo de texto", "Combo" });
		setLayout(new BorderLayout());
	// -------añado a la lamina gridLayout los elementos tipo Lamina_botones
		micuadricula.add(lamina_tipo);
		micuadricula.add(lamina_mensaje);
		micuadricula.add(lamina_2mensaje);
		micuadricula.add(lamina_TipoOpcion);
		micuadricula.add(lamina_opciones);
		micuadricula.add(lamina_entrada);
	// ----------coloco la lamina divida en cuadricula en el centro del panel del Marco
		add(micuadricula, BorderLayout.CENTER);
	//--------- construyo lamina inferior 
		JPanel lamina_Mostrar = new JPanel();
		JButton boton_mostrar = new JButton("Mostrar");
		boton_mostrar.addActionListener(new AccionMostrar());
		lamina_Mostrar.add(boton_mostrar);
	// ------la añado a la parte sur del marco
		add(lamina_Mostrar, BorderLayout.SOUTH);
	}
//----------------metodo proporciona el mensaje -------
	public Object dameMensaje() {
		String s= lamina_2mensaje.dimeSeleccion();
		switch (s) {
		case "Cadena": return cadena_mensaje; 
		case "Icono": return iconomensaje;
		case "Componente": return componenteMensaje;
		case "Otros": return objetoMensaje;
		case "Objects[]": return new Object [] {
				cadena_mensaje,iconomensaje, componenteMensaje, objetoMensaje
		};
		default: return null;
		
		
		}
	}
	
//-----------------metodo da tipo ICONO y el numero de botones en confirmar---------------------------------
	//tiene que devolver un tipo int para que establezca un icono u otro
	//para que pueda usarlo cualquier lamina, asi relaciono la lamina
	// que quiero le paso un objeto Lamina_botones como parametro
	public int dameTipo(Lamina_botones lamina) {
		
		String s= lamina.dimeSeleccion();
		switch (s) {
			case "ErrorMessage": return 0; //mirar la api de los campos staticos de clase
			case "WarningMessage": return JOptionPane.WARNING_MESSAGE;
			case "InformationMessage" : return JOptionPane.INFORMATION_MESSAGE;
			case "PlainMessage": return JOptionPane.PLAIN_MESSAGE;
			case "QuestionMessage" : return JOptionPane.QUESTION_MESSAGE;
			case "DEFAULT":return JOptionPane.DEFAULT_OPTION;
			case "YES_NO_OPTION": return JOptionPane.YES_NO_OPTION;
			case "YES_NO_CANCEL_OPTION":  return JOptionPane.YES_NO_CANCEL_OPTION;
			case "OK_CANCEL_OPTION":  return JOptionPane.OK_CANCEL_OPTION;
			default: return 6;
		}
	}
	
		// dar opciones a la laminaOPCION
	public Object [] dameOpcion(Lamina_botones lamina) {
		String s= lamina.dimeSeleccion();
		switch (s) {
		case "String[]": return new String [] {"Amarillo", "Rojo","Azul"
					
		};
		case "Icon[]": return new ImageIcon[] {
			new ImageIcon("circuloazul.gif"), 
			new ImageIcon("circulorojo.gif"),
			new ImageIcon("circuloamarillo.gif")	
		};
		case "Object[]": return new Object[] {
				cadena_mensaje,iconomensaje, componenteMensaje, objetoMensaje
		};
		default:return  null;
		}
	}
	
	//-----------------------------------
	//clase interna gestionadora de eventos
	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (lamina_tipo.dimeSeleccion()) {
			case "Mensaje": JOptionPane.showMessageDialog(Marco_Dialogos.this,dameMensaje(), "Titulo", dameTipo(lamina_mensaje));
				break;
			case "Confirmar": JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "titulo", dameTipo(lamina_TipoOpcion), dameTipo(lamina_mensaje));
				break;
			case "Entrada" : 
							if(lamina_entrada.dimeSeleccion().equals("Campo de texto"))	{
								JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo",  dameTipo(lamina_mensaje));
							}else {
								JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "titulo", dameTipo(lamina_mensaje), null, new String [] {"Amarillo", "Azul", "Rojo"}, "Azul");
							}
							break;
			case "Opcion" : JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo",0, dameTipo(lamina_mensaje),null,  dameOpcion(lamina_opciones),null	);
			}
			System.out.println(lamina_tipo.dimeSeleccion());
		}
		
	}

	private Lamina_botones lamina_tipo, lamina_mensaje, lamina_2mensaje, lamina_TipoOpcion, lamina_opciones,
			lamina_entrada;
	private String cadena_mensaje="Mensaje";
	private Icon iconomensaje= new ImageIcon("circuloazul.gif");
	private Object objetoMensaje= new Date();
	private Component componenteMensaje= new Lamina_ejemplo();
}
