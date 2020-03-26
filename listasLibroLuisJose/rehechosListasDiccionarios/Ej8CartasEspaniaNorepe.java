package rehechosListasDiccionarios;

import java.util.ArrayList;

public class Ej8CartasEspaniaNorepe {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		Carta nueva = new Carta();
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				baraja.add(nueva);
			} else {
				nueva = new Carta();
				for (int j = 0; j < i; j++) {
					if (baraja.get(j).getPalo().equals(nueva.getPalo())
							&& baraja.get(j).getValor().equals(nueva.getValor())) {
						j = 0;
						nueva = new Carta();
					}
				}
				baraja.add(nueva);

			}
		}

		for (Carta u : baraja) {
			System.out.println(u);
		}

	}

}

class Carta implements Comparable {
	String palo, valor;
	String[] palos = { "oros", "copas", "espadas", "bastos" };
	String[] valores = { "as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey" };

	public Carta() {
		int paloi = (int) (Math.random() * 4);
		int valori = (int) (Math.random() * 10);
		this.valor = valores[valori];
		this.palo = palos[paloi];
	}

	public String toString() {
		return this.getValor() + " de " + this.getPalo();
	}

	protected String getPalo() {
		return palo;
	}

	protected void setPalo(String palo) {
		this.palo = palo;
	}

	protected String getValor() {
		return valor;
	}

	protected void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Object o) {
		Carta auxi = (Carta) o;
		if (this.palo.equals(auxi.palo)) {
			return this.valor.compareTo(auxi.valor);
		} else {
			return this.palo.compareTo(auxi.palo);
		}
		// TODO Apéndice de método generado automáticamente
//		return this.getPalo().compareTo(auxi.getPalo());
	}
}