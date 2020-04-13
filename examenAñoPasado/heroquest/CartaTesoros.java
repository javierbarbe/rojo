package heroquest;

import java.util.HashMap;

public class CartaTesoros {
	
	private final String [] valores = {"0", "Pocion curativa", "trampa", "monstruo errante", "oro", "oro", "oro"};
	private  String valor;
	int monedas;
	public CartaTesoros() {
		Dado d6= new Dado (6);
		valor=valores[d6.getValor()];
	//	System.out.println(d6.getValor()+ " tirada al azar al sacar carta del mazo");
//		switch (d6.getValor()) {
//		case 1: Dado d62 = new Dado(6);
//				monedas =d62.getValor()*10 ;
//				break;
//		case 2: PocionCurativa pocima= new PocionCurativa();
//				break;
//		case 3: Trampa tr= new Trampa();
//		}
	}
	protected String getValor() {
		return valor;
	}
	class PocionCurativa{
		private int puntosRestauracion;
		public PocionCurativa () {
			Dado d4 = new Dado(4);
			puntosRestauracion=d4.getValor();
		}
	}
	class Trampa	{
		public Trampa () {
			int daño=1;
			//pj.setDaño(1);
		}
		
	}
	public String toString() {
		return this.valor;
	}
	public CartaTesoros cartaVacia() {
		CartaTesoros vacia = new CartaTesoros();
		vacia.valor="vacia";
		return vacia;
	}
}
