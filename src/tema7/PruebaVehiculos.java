package tema7;

public class PruebaVehiculos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Bicicleta mibici2= new Bicicleta();
		Bicicleta mibici=new Bicicleta();
		Cocheb co=new Cocheb();
		co.recorre(700);
		mibici.hacerCaballito();
		mibici.recorre(36);
		System.out.println(mibici.getKmAndados()+ " mi bici ha recorrido ");
		mibici.recorre(60);
		System.out.println(mibici.getKmAndados()+ " y despues ha recorrido 60");
		System.out.println(mibici.getCaballitos());
		System.out.println(mibici.getKmtotalesvehiculo());
		mibici2.recorre(22);
		System.out.println(Vehiculos.kmRecorridos+" estos son los km recorridos por todos los vehiculos ");
		System.out.println(Vehiculos.vehiculosCreados);
		System.out.println(mibici2.getKmtotales());
			
	}

}
