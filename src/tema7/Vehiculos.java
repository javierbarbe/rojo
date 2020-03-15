package tema7;

 public  class Vehiculos {
	/////ATRIBUTOS DE CLASE COMPARTIDOS (STATICOS)//////
	protected static int vehiculosCreados=0;
	public static double kmRecorridos=0;
	
	//CADA UNO TIENE SUS PROPIOS KM TOTALES RECORRIDOS
	protected  double kilometrosTotales;
	
	public void recorre( double km) {
		kmRecorridos+=km;
		kilometrosTotales+=km;
	}
	public double getKmtotales() {
		return Vehiculos.kmRecorridos;
	}
	public double getKmtotalesvehiculo() {
		return kilometrosTotales;
	}
	
}
