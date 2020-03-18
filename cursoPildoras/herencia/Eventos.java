package herencia;

import java.awt.event.*;

import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
public class Eventos {

	public static void main(String[] args) {
		DameHora evento=  new DameHora();
//		ActionEvent evento2= new DameHora();
		Timer mievento= new Timer(3000, evento);
	
		mievento.start();
		JOptionPane.showMessageDialog(null, "Cuando quieras paro");
		System.exit(0);
	} 

	
	 
		
	
}
class DameHora implements ActionListener{

	 public DameHora(){
		 
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora= new Date();
		System.out.println("Te imprimo la hora cada 3 segundos: "+ahora);
		
	}
	}
