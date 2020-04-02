package ddR;

public class Carta {
	public String palo;
	public int numero;
	public Carta(String palo, int numero) {
		
		this.palo = palo;
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return numero+ " de "+ palo;
	}


	public static final String [] PALOS= {"OROS","COPAS","ESPADAS","BASTOS"};
	
	public static final int LIMITE_CARTA_PALO=12;
	
	
}
