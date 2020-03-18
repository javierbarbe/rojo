package lista;

import java.util.ArrayList;

public class Ej7_Eurocoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moneda pri= new Moneda();
//		pri.generaMoneda();
		
		System.out.println(pri.getLado());
		System.out.println(pri.getValor());
		ArrayList <Moneda> monedero= new ArrayList <Moneda>();
//		for(int i =0; i<6 ; i++) {
//			monedero.add(pri);
		String ultimoLado= pri.getLado();
		String ultimoValor=pri.getValor();
		 for ( int i = 0; i<6; i++) {
			do { pri = new Moneda();
			}while (!((pri.getLado()).equals(ultimoLado)) && !((pri.getValor()
					).equals(ultimoValor)));
			monedero.add(pri);
		 }
//		}
//	System.out.println(monedero);
		 for (Moneda m: monedero){
			 System.out.println(m);
		 }
	}
}

class Moneda {
	private String lado = "";
	public String getLado() {
		return lado;
	}

	public Moneda() {
		int cruzCara = (int) (Math.random() * 2);
		switch (cruzCara) {
		case 0:
			this.setLado("cara");
			break;
		case 1:
			this.setLado("cruz");
			break;
		}
	int valores= (int)(Math.random()*8); 
	switch (valores) {
	case 0: this.setValor("1 céntimo");
	break;
	case 1: this.setValor("2 céntimos");
	break;
	case 2: valor ="5 céntimos";
	break;
	case 3: valor="10 céntimos";
	break;
	case 4: valor ="20 céntimos"; 
	break;
	case 5: valor=" 50 céntimos";
	break;
	case 6: valor =" 1 euro";
	break;
	case 7: valor =" 2 euros";
	break;
	}
	}
	public void setLado(String lado) {
		this.lado = lado;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	private String valor = "";

//	public void generaMoneda() {
//		int cruzCara = (int) (Math.random() * 2);
//		switch (cruzCara) {
//		case 0:
//			this.setLado("cara");
//			break;
//		case 1:
//			this.setLado("cruz");
//			break;
//		}
//	int valores= (int)(Math.random()*7); 
//	switch (valores) {
//	case 0: this.setValor("1 céntimo");
//	break;
//	case 1: this.setValor("2 céntimos");
//	break;
//	case 2: valor ="5 céntimos";
//	break;
//	case 3: valor="10 céntimos";
//	break;
//	case 4: valor ="20 céntimos"; 
//	break;
//	case 5: valor=" 50 céntimos";
//	break;
//	case 6: valor =" 1 euro";
//	break;
//	case 7: valor =" 2 euros";
//	break;
//	}
//	}
	

	public String toString() {
		return this.getValor()+ " --- "+ this.getLado();
	}
}
