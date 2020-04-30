package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaMultiplesOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MarcoPrincipal mo = new MarcoPrincipal();
		 mo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		 ArrayList<String> listano= new ArrayList<>();
//		  int contad=0;
//		 for (contad=0 ; contad<6; contad++) {
//			 String nombre = "hola "+contad;
//			 listano.add(nombre);
//		 }
//		 for (String i : listano) {
//			 System.out.println(i);
//		 }
	}

}


 class MarcoPrincipal extends JFrame{
	
	
	public MarcoPrincipal() {
		this.setTitle("Prueba Varios Oyentes");
		setVisible(true);
		setBounds(600, 200, 350, 150);
		Lamina_principal la = new Lamina_principal();
		add(la);
		
	}
}
 
 class Lamina_principal extends JPanel{
	 JButton nuevo = new JButton("Nuevo"); // ---> fuente de eventos
	 JButton cerrar= new JButton("Cerrar todo");
	 public Lamina_principal() {
		 
		add(nuevo);
		add(cerrar);
		OyenteNuevo mioyente = new OyenteNuevo();
		//pongo al objeto fuente a la escucha de un objeto oyente (mioyente) 
		//cuya actionPerformed (que es el metodo que debe implementar por ser de tipo ActionListener (oyente)
		// es crear un objeto MarcoEmergente
		nuevo.addActionListener(mioyente);
	 }
	 
	 //clase oyente
	 private class OyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marco = new MarcoEmergente(cerrar);
			marco.setVisible(true);
			
		}
		 
	 }
 }
 
 class MarcoEmergente extends JFrame{
	 private  static int contador=0;
	 public MarcoEmergente(JButton boton_de_principal) {
		 CierraTodos oyentecerrar = new CierraTodos();
		// add(boton_de_principal);
		 boton_de_principal.addActionListener(oyentecerrar);
		 contador++;
		 setTitle("Ventana "+ contador);
		 setBounds(40*contador, 40*contador, 250, 250);//esto hace que salgan en cascada
	 }
	 //la clase oyente debe estar dentro de MarcoEmergente
	 //tengo que darle la instruccion a marcoemergente de que cuando reciba un evento se cierre
	 
	 private class CierraTodos implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			dispose();
			contador=0;
		}
		 
	 }
	 
 }