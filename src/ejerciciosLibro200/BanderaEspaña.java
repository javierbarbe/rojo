package ejerciciosLibro200;
import java.util.Scanner;
public class BanderaEspaña {
Scanner e=new Scanner(System.in);
private int estado=0;
private double alto, ancho, superficie, precioTotal;
private String envio="", escudo="", estado2="";
private static int totalPedidas,totalEnviadas;


	public BanderaEspaña() {}
	
	public void calculaPrecio() {
		
		
		System.out.println("Introduzca alto en cm");
		alto=e.nextDouble();
		System.out.println("introduce ancho en cm");
		ancho=e.nextDouble();
		superficie=alto*ancho;
		System.out.println("Desea envio a domicilio? s/n");
		envio=e.next();
		if (envio.equals("s")) {
			precioTotal+=3.25;
		}
		System.out.println("desea escudo bordado? s/n");
		escudo=e.next();
		if(escudo.equals("s")){
				precioTotal+=2.50;
		}
		precioTotal=(precioTotal+(superficie*0.01));
		
		System.out.println("el precio total es de " + precioTotal+" €");
		totalPedidas++;
		 System.out.println(getAncho()+" cm de ancho\n"+ getAlto()+ "cm de alto////"+ getSuperficie()+" cm2 de superf");
		 if (escudo.equals("s")){
			 System.out.println("Lleva escudo + 2,50€");	
			 }
		 else {
			 System.out.println("No lleva escudo");
			 }
		 if(envio.equals("s")) {
			 System.out.println("Envío a domicilio + 3,25€");
		 }
		 
		 System.out.println( getTotalPedidas()+ " pedidas");
		 System.out.println(precioTotal+" € precio final" );
		
		
	}
	
	
	public void enviar() {
		if (this.estado==0) {
		this.estado=1;
		System.out.println("enviando bandera");
		totalEnviadas++;
		}
		
		else {
			System.out.println("Esta bandera ya ha sido enviada");
		}
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getEscudo() {
		return escudo;
	}

	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

	public static int getTotalPedidas() {
		return totalPedidas;
	}

	public static void setTotalPedidas(int totalPedidas) {
		BanderaEspaña.totalPedidas = totalPedidas;
	}

	public static int getTotalEnviadas() {
		return totalEnviadas;
	}

	public static void setTotalEnviadas(int totalEnviadas) {
		BanderaEspaña.totalEnviadas = totalEnviadas;
	}

	public  String  getEstado() {
		if (estado==0) {
			String estado2= "Estado: en preparacion";
			System.out.println(estado2);
		}else {
			estado2="Estado: enviada";
		}
		return estado2;
		
	}

	public double getSuperficie() {
		return superficie;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public void constructorCopia(BanderaEspaña una) {
		this.alto=una.alto;
		this.ancho=una.ancho;
		this.precioTotal=una.precioTotal;
		this.escudo=una.escudo;
	}
	
}
