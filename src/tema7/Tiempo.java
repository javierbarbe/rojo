package tema7;

public class Tiempo {
	private int horas, minutos, segundos;
	protected int horassumadas, minutossumados, segundossumados;
	protected int segundosrestantes = 0, minutosrestantes = 0;
	protected int minutoextra = 0, horaextra = 0;

	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void suma(Tiempo uno, Tiempo dos) {

		horassumadas = uno.horas + dos.horas;
		minutossumados = uno.minutos + dos.minutos;
		segundossumados = uno.segundos + dos.segundos;
		if (segundossumados > 59) {
			segundosrestantes += segundossumados % 60;
			minutoextra = segundossumados / 60;
		}
		minutossumados += minutoextra;
		if (minutossumados > 59) {
			minutosrestantes += minutossumados % 60;
			horaextra += minutossumados / 60;
		}
		horassumadas += horaextra;
		System.out.println(minutosrestantes + " minutos restantes");
		System.out.println(horassumadas + " horas sumadas");
		System.out.println(segundosrestantes + " segundos rstantes");
	}

	public void resta(Tiempo uno, Tiempo dos) {
		boolean salir=false;
		horassumadas = uno.horas - dos.horas;
		if (horassumadas < 0 || uno.horas < 0 || dos.horas < 0 || uno.minutos < 0 || dos.minutos < 0 || uno.segundos < 0
				|| dos.segundos < 0) {
			System.out.println("error, no puedes restar horas,segundos,minutos negativas o hacer una cuenta"
					+ "que de un resultado negativo respecto de las horas");
				salir=true;
		} else {
			if (salir==false) {
			while (dos.segundos > uno.segundos) {
				if (uno.minutos > 0) {
					uno.minutos = -1;
					uno.segundos += 60;
					if (uno.minutos == 0) {
						if (horassumadas > 0) {
							uno.horassumadas -= 1;
							uno.minutos += 60;
						} else {
							System.out.println("La resta de horas no puede ser negativa"); // los minutos
							// sobrepasan a las horas
							break;
						}
					}
				} else {
					System.out.println("error minutos bajo 0");
				}
			}
			while (dos.minutos > uno.minutos) {
				if (horassumadas > 0) {
					uno.horassumadas -= 1;
					uno.minutos += 60;
				} else {
					System.out.println("La resta de horas no puede ser negativa"); // los minutos
					// sobrepasan a las horas
					break;
				}
			}
			minutosrestantes = uno.minutos - dos.minutos;
			segundosrestantes = uno.segundos - dos.segundos;
		}
		}
		

	}

	@Override
	public String toString() {
		return " El intervalo es " + this.horassumadas + "h " + this.minutosrestantes + "m " + this.segundosrestantes + "s";
	}
}
