package tema6;
import java.util.*;
public class Ej20Reyes {
	Scanner e=new Scanner(System.in);
	int cantidadReyes;
	String [] reyes;
	int contadore=0;
	//static int [] contador=new int [12];
	public Ej20Reyes() {

	}
	public int getCantidadReyes() {
		return cantidadReyes;
	}
	public void setCantidadReyes(int cantidadReyes) {
		this.cantidadReyes = cantidadReyes;
	}
	
	public String [] nombreReyes() {
		reyes =new String [getCantidadReyes()];
		for(int i=0;i<reyes.length;i++) {
			System.out.println("Introduce nombre rey");
			reyes[i]=e.nextLine();
		}return reyes;
	}
	
	public void asignaOrdinalidad(String []recibido) {
		for (int i=0;i<recibido.length;i++) {
			contadore=1;
			for (int j=0;j<recibido.length;j++) {
					if(recibido[i].equalsIgnoreCase(recibido[j])) {
						contadore++;
					}
			}
			System.out.println(recibido[i]+ " es el "+contadore);
		}
	}
}
