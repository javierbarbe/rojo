package ejerciciosLibro200;

public class Colores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("  Artículo      Precio/caja    Nº cajas");
	    System.out.println("-----------------------------------------");
	    System.out.printf("%-10s %-55.2f  %12d\n",  "manzanas10", 4.5, 10);
	    System.out.printf("%-10s %10.2f  %6d\n",  "peras", 2.75, 120);
	    System.out.printf("%-10s %10.2f  %6d\n",  "\u266A aguacates", 10.0, 6);
	    System.out.println("\u366A");
	    int x=9, y=2;
	    double q=(double)x/(double)y;
	    System.out.println(q);

	    double baseImponible = 22.75;

	    System.out.printf("Base imponible %8.2f\n", baseImponible);
	    System.out.printf("IVA %19.2f\n", (baseImponible * 0.21));
	    System.out.printf("-----------------------\n");
	    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
	}

}
