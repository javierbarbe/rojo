package lista;

import java.util.ArrayList;

public class Ej8CartasEspania {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta uno= new Carta();
		System.out.println(uno);
		ArrayList <Carta> baraja= new ArrayList <Carta>();
		Carta cartaaux= new Carta();
		baraja.add(cartaaux);
		String ultimoPalo="";
		for( int i = 0; i< 40;i++) {
		
				 ultimoPalo=cartaaux.getPalo();
//				int
				cartaaux=new Carta();
				if(baraja.contains(cartaaux)) {
					System.out.println("repetida");
				}
			
			baraja.add(cartaaux);
		
//			while(cartaaux.getPalo().equals(ultimoPalo) && )
		}System.out.println(baraja);
		
	}

}
class Carta{
	private int numero;
	private String palo;
	String [] palos= {"de oros","de copas","de espadas","de bastos"};

	public Carta() {
		int num=8;
		while(num== 8 || num==9 ) {
		 num= (int)(Math.random()*12+1);
		}
		this.numero= num;
		this.palo= palos[ (int)(Math.random()*4)];
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String toString() {
		return this.numero+ " "+ this.palo;
	}
}