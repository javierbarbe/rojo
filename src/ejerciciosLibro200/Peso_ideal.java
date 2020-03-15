package ejerciciosLibro200;
import javax.swing.*; 


public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		 String genero=""; 
		 int altura; 
		 
		 do {
			 
			 genero=JOptionPane.showInputDialog("Introduce tu género(H/M)");
			 
		 }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		 
		 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura"));
		 
		 int peso_ideal=0;
		 if (genero.equalsIgnoreCase("H")) {
			 peso_ideal=altura-110;
		 }else if(genero.equalsIgnoreCase("M")) {
			 peso_ideal=altura-120;
		 }
		
		 System.out.println("Tu peso ideal es " + peso_ideal+ " kgs");
	}

}
