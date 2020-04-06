package tema9ColeccionesDeitel;

import java.util.Comparator;

public class TiempoComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

} class ComparadorTiempo implements Comparator <Tiempo>{

	@Override
	public int compare(Tiempo o1, Tiempo o2) {
	int diferenciahora=o1.getHora()-o2.getHora();
		if(diferenciahora!=0) {
			return diferenciahora;
		}
		int diferenciaminuto=o1.getMinuto()-o2.getMinuto();
		if(diferenciaminuto!=0) {
			return diferenciaminuto;
		}
		int diferenciasegundo=o1.getSegundo()-o2.getSegundo();
		return diferenciasegundo;
	}
	
}
class Tiempo {
	public Tiempo(int hora, int minuto,int segundo) {
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}
	
	public String toString() {
		return this.hora +":" + this.minuto+":" +this.segundo;
	}
	private int hora,minuto,segundo;

	protected int getHora() {
		return hora;
	}

	protected void setHora(int hora) {
		this.hora = hora;
	}

	protected int getMinuto() {
		return minuto;
	}

	protected void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	protected int getSegundo() {
		return segundo;
	}

	protected void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
}