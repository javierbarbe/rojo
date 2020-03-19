package lista;

import java.util.Objects;

public class Cartas2 implements Comparable{
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	private String palo="";
	private String numero="";
	
	public Cartas2() {
		String [] numeros= {"as","2", "3","4","5", "6" ,"7", "sota","caballo","rey"};
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
	@Override
	public int compareTo(Object o) {
		Cartas2 cartaextra= (Cartas2) o;
		if(this.palo.equals(cartaextra.palo)) {
			return this.numero.compareTo(cartaextra.numero);
		}else {
			return this.palo.compareTo(cartaextra.palo);
		}
//		if(this.palo.compareTo(cartaextra.palo)>1 && this.numero.compareTo(cartaextra.numero)>1) {
//			return 1;
//			
//		}if (this.palo.compareTo(cartaextra.palo)<1 && this.numero.compareTo(cartaextra.numero)<1) {
//			return -1;
//		}else {
//		return 0;
//		}
//		return this.getColor().compareTo(otrogato.getColor());
	}
}