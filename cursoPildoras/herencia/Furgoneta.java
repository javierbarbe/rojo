package herencia;

public class Furgoneta extends Coche{

		private int plazas_extra,capacidad_carga;
		
		public Furgoneta (int plazas_extra, int capacidad_carga){
			
			super();
			this.plazas_extra=plazas_extra;
			this.capacidad_carga=capacidad_carga;
		
		}
//		public Furgoneta() {
//			
//		}
		
		public String dimeDatosFurgoneta() {
			return " la capacidad de carga es " + capacidad_carga + "\n Y las plazas son "+ plazas_extra;
		}
}
