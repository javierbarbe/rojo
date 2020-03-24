package rehechosListasDiccionarios;

import java.util.ArrayList;

public class Ej7Eurocoin {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Moneda pri = new Moneda();
		System.out.println(pri);
		boolean monedacorrecta = true;
		ArrayList<Moneda> bolso = new ArrayList<Moneda>();
		for (int i = 0; i < 6; i++) {
			do {
				Moneda nueva = new Moneda();
				if(i==0) {
					bolso.add(nueva);
				}
				if (i > 0) {
					if (nueva.getValor().equals(bolso.get(i - 1).getValor())
							|| nueva.getDibujo().equals(bolso.get(i - 1).getDibujo())) {
						monedacorrecta = true;
						bolso.add(nueva);
					} else {
						monedacorrecta=false;
						System.out.println("no coincide el dibujo o el valor");
						System.out.println(nueva.getDibujo() + " != de " + bolso.get(i - 1).getDibujo());
						System.out.println(nueva.getValor() + "!= de " + bolso.get(i - 1).getValor());
					}
				}
			} while (!monedacorrecta);
			
		}
		for ( Moneda e: bolso) {
			System.out.println(e);
		}
	}

}

class Moneda {
	protected String getValor() {
		return valor;
	}

	protected void setValor(String valor) {
		this.valor = valor;
	}

	protected String getDibujo() {
		return dibujo;
	}

	protected void setDibujo(String dibujo) {
		this.dibujo = dibujo;
	}

	String valor, dibujo;
	String[] valores = { "1 centimo", "2 centimos", "5 centimos", "10 centimos", "1 euro", "2 euros" };
	String[] dibujos = { "cara", "cruz" };

	public Moneda() {
		int valori = (int) (Math.random() * 6);
		int dibujoi = (int) (Math.random() * 2);
		this.valor = valores[valori];
		this.dibujo = dibujos[dibujoi];
	}

	public String toString() {
		return "El valor de la moneda es: " + this.getValor() + "  Y su lado es: " + this.getDibujo();
	}
}