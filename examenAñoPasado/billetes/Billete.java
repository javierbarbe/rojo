package billetes;

public class Billete {

	
	public Billete() {
		
	}
	final static int [] valores= {100,50,20,10,5,2,1};
	static int [] cantidades = new int [valores.length];
	public static void cantidadACalcular(int cantidad) {
		System.out.println("Se introdujo "+cantidad);
		while (cantidad>0) {
			for (int i =0; i<valores.length; i++) {
				while(cantidad-valores[i]>=0) {
					cantidad-=valores[i];
					cantidades[i]++;;
				}
				
			}
		}
		for (int i =0; i<valores.length; i++) {
			if(cantidades[i]>1) {
		System.out.println(cantidades[i]+ " billetes de "+ valores[i]); 
		}else if(cantidades[i]>0) {
			System.out.println(cantidades[i]+ " billete de "+ valores[i]);
		}
		}
	}



	

public static void main (String args[] ) {
	
//	Billete mio = new Billete();
	Billete.cantidadACalcular(232);
}
}