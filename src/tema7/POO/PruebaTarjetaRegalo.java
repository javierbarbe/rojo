package tema7.POO;

public class PruebaTarjetaRegalo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		TarjetaRegalo t1= new TarjetaRegalo(500);
		System.out.println(t1.getnumeroTarjeta());
		t1.gastar(200);
		System.out.println(t1.getSaldo());
		TarjetaRegalo t2= new TarjetaRegalo(500);
		t2.gastar(200);
		System.out.println(t2.getSaldo());
		System.out.println(t2.getnumeroTarjeta());
		TarjetaRegalo t3=t1.fusionar(t2);
		System.out.println(t3.getnumeroTarjeta());
		System.out.println(t3.getSaldo());
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
