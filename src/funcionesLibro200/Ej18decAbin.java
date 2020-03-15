package funcionesLibro200;

public class Ej18decAbin {
	long decimal;
	String binario = "";
	private boolean binariosi;

	public Ej18decAbin() {

	}

	public String aBinario(long numero) {

		long numdiv;
		if (numero < 0) {
			System.out.println("EL numero es menor a 0");
		} else {
			while (numero > 0) {
				binario += numero % 2;
				numdiv = numero / 2;

				numero = numdiv;
			}
			invierte();

		}
		return binario;
	}

	private void invierte() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.binario);
		sb.reverse();
		this.binario = sb.toString();
	}

	public long aDecimal(String binario) {
		int exponente = 0;
		char a = '1';
		char o = '0';
		for (int i = 0; i < binario.length(); i++) {
			char valpos = binario.charAt(i);

			if (valpos == a || binario.charAt(i) == o) {
				binariosi = true;

			} else {
				binariosi = false;
				break;
				// System.out.println(binario.charAt(i));

			}
		}
		if (binariosi == false) {
			System.out.println("por favor... introduce solo 0s y 1s");

		}
		if (binariosi == true) {
			System.out.println("bien has introducido un numero en formato binario");

			long nume = Long.valueOf(binario);
			while (nume > 0) {
				long base = nume % 2;
				if (base == 1) {
					base++;
				}
//				if(base!=1 && base!=0) {
//					System.out.println("se ha introducido un numero en formato no binario");
//					break;
//				}
				if (base!=0) {
				decimal += (Math.pow(base, exponente));
				}
				nume /= 10;
				exponente++;
			}

		}

		return decimal;
	}

	public long getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}

}
