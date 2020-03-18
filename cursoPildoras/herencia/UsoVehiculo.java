package herencia;

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
	}

}
