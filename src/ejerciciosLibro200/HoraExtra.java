package ejerciciosLibro200;
import java.util.Scanner;
public class HoraExtra {
private int sueldoBase=480;
private double horas; 

	public HoraExtra() {}
	
	public void calculaHoras() {
		Scanner e=new Scanner(System.in);
		System.out.println("introduce horas trabajadas este mes");
		  this.horas=e.nextDouble();
		
		  if(this.horas>40) {
			 double horasExtra;
			 horasExtra=horas-40;
			 double sueldoExtra=horasExtra*16;
			double total= sueldoExtra+sueldoBase;
			System.out.println("tienes que cobrar el sueldo base "+sueldoBase+ " las horas extra "+ sueldoExtra);
			System.out.println("total "+ total);
			} else {
				System.out.println("tienes que cobrar "+sueldoBase+"€");
			}
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	
}
