package layouts.marcoscajas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco_Dialogos extends JFrame {

	public Marco_Dialogos() {
		setVisible(true);
		setBounds(400, 400, 250, 135);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel micuadricula = new JPanel();
		micuadricula.setLayout(new GridLayout(2, 3));
		String[] primero = { "Mensaje", "Confirmar", "Opcion", "Entrada" };
		lamina_tipo = new Lamina_botones("Tipo", primero);

		lamina_mensaje = new Lamina_botones("Tipo Mensaje",
				new String[] { "ErrorMessage", "QuestionMessage", "PlainMessage", "InformationMessage" });
 
		lamina_2mensaje = new Lamina_botones("Mensaje",
				new String[] { "Cadena", "Icono", "componente", "Otros", "Objects" });
		lamina_TipoOpcion = new Lamina_botones("Tipo Opcion",
				new String[] { "DEFAULT", "YES_NO_OPTION", "oK_CANCEL_OPTION" });

		lamina_opciones = new Lamina_botones("Opciones", new String[] { "String[]", "Icon[]", "Object[]" });

		lamina_entrada = new Lamina_botones("Entrada", new String[] { "Campo de texto", "Combo" });
		setLayout(new BorderLayout());
		// añado a la lamina gridLayout los elementos tipo Lamina_botones
		micuadricula.add(lamina_tipo);
		micuadricula.add(lamina_mensaje);
		micuadricula.add(lamina_2mensaje);
		micuadricula.add(lamina_TipoOpcion);
		micuadricula.add(lamina_opciones);
		micuadricula.add(lamina_entrada);
		// coloco la lamina divida en cuadricula en el centro del panel del Marco
		add(micuadricula, BorderLayout.CENTER);
		// construyo lamina inferior
		JPanel lamina_Mostrar = new JPanel();
		JButton boton_mostrar = new JButton("Mostrar");
		boton_mostrar.addActionListener(new AccionMostrar());
		lamina_Mostrar.add(boton_mostrar);
		// la añado a la parte sur del marco
		add(lamina_Mostrar, BorderLayout.SOUTH);
	}
	
	private class AccionMostrar implements {
		
	}

	private Lamina_botones lamina_tipo, lamina_mensaje, lamina_2mensaje, lamina_TipoOpcion, lamina_opciones,
			lamina_entrada;

}
