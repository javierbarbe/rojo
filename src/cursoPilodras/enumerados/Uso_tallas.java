package cursoPilodras.enumerados;
import java.util.*;
public class Uso_tallas {

	enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
		
	enum Talla2 {
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		private Talla2(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		private String dameAbreviatura() {
			return abreviatura;
		}
		private String abreviatura;
	}
	
	public static void main(String[] args) {
//		boolean tallaok=false;
		Scanner e=new Scanner(System.in);
	Talla s=Talla.MINI;
	System.out.println(s);
	String entradadatos;
	System.out.println("esscribe una talla");

	
		entradadatos= e.next().toUpperCase();
	
		
//		System.out.println("lo siento, no has metido talla correecta");
		
	
	
//	String entradadatos= e.next().toUpperCase();
	Talla2 latalla= Enum.valueOf(Talla2.class, entradadatos);
	System.out.println("la talla es ="+ latalla);
	System.out.println("La abreviatura es "+ latalla.dameAbreviatura());
	}

}
