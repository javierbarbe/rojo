package ejerciciosLibro200;
import java.util.Scanner;
public class CalculaMinutos {
	String dia="";
	private int hora, minuto;
	private int diaNumerico;
Scanner e=new Scanner(System.in);
	public CalculaMinutos() {}
	
	public void calculando() {
		 
		System.out.println("introduce dia de la semana");
		dia=e.next();
		do
		{
		switch (dia) {
		
		case "lunes": 
			diaNumerico=1;
			break;
		case "martes":
			diaNumerico=2;
			break;
		case "miercoles":
			diaNumerico=3;
			break;
		case "jueves":
			diaNumerico=4;
			break;
		case "viernes":
			diaNumerico=5;
			break;
		default: 
			System.out.println("el dia no es correcto. Use minusculas(l-v)");
			diaNumerico=8;
			dia=e.next();
			break;
		}
		
	}while (diaNumerico>5);
		
		
		
	System.out.println("introduce hora ");	
	hora=e.nextInt();
	while (hora>24) {
		System.out.println("Por favor, introduzca una hora correcta");
		hora=e.nextInt();
	}
	System.out.println("minuto");
	minuto=e.nextInt();
	while(minuto>60) {
		System.out.println("Por favor, introduzca minuto correcto");
		minuto=e.nextInt();
	}
	
	int minutosTotales= (4*24*60)+(15*60);
	int minutosActuales=((diaNumerico-1)*24*60)+((hora*60)+minuto);
	System.out.println("te quedan para el fin de semana "+ (minutosTotales-minutosActuales)+ " minutos");
	
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	} 
	
	 
		
	
	

	
}
