package herencia;

import java.util.ArrayList;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Coche coche=new Coche();
		coche.setClimatizador(true);
		//System.out.println(coche.isClimatizador());
		System.out.println(coche.getPeso());
		Furgoneta furg=new Furgoneta(7,580);
		System.out.println(furg.getAsientos());
		furg.setColor("verde");
		furg.setAsientosCuero(true);
		furg.setClimatizador(true);
		System.out.println(furg.dimeDatos()+ furg.dimeDatosFurgoneta());
		Coche mio = new Coche("verde",300);
		Coche tuyo= new Coche("verde",300);
		ArrayList <Coche> almacen = new ArrayList<>();
		almacen.add(mio);
		almacen.add(tuyo);
		if(almacen.contains(mio)) {
			System.out.println("ese coche si esta");
		}else {
			System.out.println("ese coche no estaba");
		}
		
		if(mio.equals(tuyo)) {
			System.out.println("funciona!! EUREKA");
		}
	}

}
