package tema9ColeccionesDeitel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import tema9ColeccionesDeitel.Carta.Palo;

public class Baraja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MazoCartas uno = new MazoCartas();

//		uno.imprimirMazo();
//		uno.mezclarMazo();
//		uno.imprimirMazo();
	System.out.println(uno.espadas);
	}

}

class Carta {
	public static enum Palo {
		oros, copas, espadas, bastos
	};

	public static enum Valor {
		as, dos, tres, cuatro, cinco, seis, siete, sota, caballo, rey
	};

	private final Palo palo;
	private final Valor valor;

public Carta(Palo palo, Valor valor) {
		super();
		this.palo = palo;
		this.valor = valor;
	}

//	public Carta(Valor valor, Palo palo) {
//		this.palo = palo;
//		this.valor = valor;
//	}

	public Valor obtenerCara() {
		return valor;
	}

	public Palo obtenerPalo() {
		return palo;
	}

	public String toString() {
		return this.valor + " de " + this.palo;
	}
}// fin clase Carta

class MazoCartas {
	String [] espadas;
	String [] bastos;
	String [] oros;
	String [] copas;
	public MazoCartas() {
		Carta[] mazo = new Carta[40];
		int cuenta = 0;
		for (Carta.Palo palo : Carta.Palo.values()) {
			for (Carta.Valor valor : Carta.Valor.values()) {
				mazo[cuenta] = new Carta(palo, valor);
				cuenta++;
			}
		}
		lista = Arrays.asList(mazo);
		Carta [] espadas =lista.subList(20, 30).toArray(new Carta[10]);
		Carta [] bastos= lista.subList(30, lista.size()).toArray(new Carta[10]);
		Carta [] oros =lista.subList(0, 10).toArray(new Carta[10]);
		Carta [] copas= lista.subList(10, 20).toArray(new Carta[10]);

	}// fin de constructor mazode cartas
	
	List<Carta> lista;
	
	
	
	
//	public void ordenarMazo() {
//for (String m : espadas) {
//	System.out.println(m);
//}


//	} 
	public void imprimirMazo() {
		
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i)+" ");
			if (i==9 || i==19 || i==29) {
				System.out.println();
			}
		}
	}

	public void mezclarMazo() {
		Collections.shuffle(lista);
	}

	



}
