package tema7;

public class Bicicleta extends Vehiculos {
	protected double kmAndados;
	protected int caballitos;
	public Bicicleta() {
		vehiculosCreados++;
	}
	
	public void hacerCaballito() {
		this.caballitos++;
		
	}

	protected double getKmAndados() {
		return super.kilometrosTotales;
	}

	protected void setKmAndados(double kmAndados) {
		kilometrosTotales = kmAndados;
	}

	protected int getCaballitos() {
		System.out.println("ha hecho con la bici este numero de caballitos:");
		return caballitos;
	}

}
