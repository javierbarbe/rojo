package nuevisimo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trivial {
boolean buena=false;
	boolean comparar(String nombre) {
		nombre=nombre.toLowerCase();
		String letra="";
		String abec= "abcdefghijklmnñopqrstuvwxyz";

		//////////////////////METODO CARLOS RUDIMENTARIO XD///////////////////////////////////////////
		
		for (int i= 0 ; i< nombre.length(); i++) {
//		 char carPos= nombre.charAt(i);
//		  letra = letra.valueOf(carPos); 
		  //valueOf(carPos);
//		 if(abec.contains(letra)) {
//			 System.out.println("esta posicion es una letra");
//			 buena=true;
//		 }else {
//				System.out.println("esta poscion NO ES LETRA");
//				buena=false;
//			}
		
		/////////////////////////////////////FIN METODO CARLOS///////////////////////////////////////////////////
			Pattern pat = Pattern.compile("[abcdefghijklmnñopqrstuvwxyz ]+");
			Matcher m= pat.matcher(nombre);
			if(m.matches()) {
				System.out.println("el patron encaja");
				buena=true;
			}else {
				System.out.println("el patron NO ENCAJA");
				buena=false;
				//break;
			}
	

		
		
		}return buena; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trivial prueba= new Trivial();
		prueba.comparar("rp m3aria");
		prueba.comparar(" MAMADA");

	}

}
