package funcionesLibro200;

public class DniEspanish {

	//atributos 
	private String nif="";
	private int Dni;
	private char letraDni;
	private static final String letrasNif="TRWAGMYFPDXBNJZSQVHLCKE";
	
	//metodos 
	public int getDni() {
		return Dni;
	}

	public void setDni(int dni) {
		this.Dni = dni;
	}
	
	
	private static char extraerLetra(String nif) {
		
		char letraDni=nif.charAt(nif.length()-1);
		return letraDni;
	}
	
	private static int extraerNumero(String nif) {
		
		int numDni=Integer.parseInt(nif.substring(0,nif.length()-1));
		return numDni;
	}
	
	public static char calcularLetraNIF(int dni) {
		char letra=letrasNif.charAt(dni%23);
		return letra;
	}

	public String obtenerNif() {
		char letra=calcularLetraNIF( Dni);
		return Integer.toString(Dni)+letra;
	}
	
	public  boolean validarNif(String nif) {
		boolean valido=true;
		//char letraSacada=extraerLetra(nif);
		int numDni=extraerNumero(nif);
		char letraCal=calcularLetraNIF(numDni);
		if(letraCal==extraerLetra(nif)) {
			System.out.println("la letra "+letraCal+ " coincide con la letra extraida de tu nif "+nif);
		}else {
			valido=false;
			System.out.println("ko DNI");
		}
		
		return valido;
	}
}
