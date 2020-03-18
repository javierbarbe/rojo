package lista;

import java.util.ArrayList;
import java.util.Objects;

public class Ej8Hashmapeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Cartas2> baraja= new ArrayList<Cartas2>();
		Cartas2 cartaaux= new Cartas2();
		
		baraja.add(cartaaux);
		for(int i =0; i<39 ; i++) {
			do {
				cartaaux=new Cartas2();
			}while(baraja.contains(cartaaux));
		baraja.add(cartaaux);
		}
		
		for (Cartas2 c : baraja) {
			System.out.println(c);
		}
	}

}

class Cartas {
	private String palo="";
	private String numero="";
	
	public Cartas() {
		String [] numeros= {"as","dos", "tres","cuatro","cinco", "seis" ,"siete", "sota","caballo","rey"};
		String [] palos= {"bastos", "oros", "espadas", "copas"};
	this.numero= numeros[(int) (Math.random()*10)];
	this.palo= palos[(int) (Math.random()*4)];
	}
	public String toString() {
		return this.numero+" de "+this.palo;
	}
	public boolean equals(Object obj) {
		if (obj == null) {
		return false;
		}
		if (getClass() != obj.getClass()) {
		return false;
		}
		final Cartas2 other = (Cartas2) obj;
		if (!Objects.equals(this.numero, other.numero)) {
		return false;
		}
		if (!Objects.equals(this.palo, other.palo)) {
		return false;
		}
		return true;
		}
}