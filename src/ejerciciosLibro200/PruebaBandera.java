package ejerciciosLibro200;

public class PruebaBandera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BanderaEspa�a nueva=new BanderaEspa�a();
nueva.calculaPrecio();
nueva.enviar();
 
 //System.out.println( nueva.getEstado());
 
System.out.println(BanderaEspa�a.getTotalEnviadas()+ " Banderas enviadas");
BanderaEspa�a dos=new BanderaEspa�a();
dos.calculaPrecio();
dos.enviar();
System.out.println(BanderaEspa�a.getTotalEnviadas()+ " banderas enviadas");
BanderaEspa�a copiada= new BanderaEspa�a();

copiada.constructorCopia(dos);
System.out.println("alto copiado: "+ copiada.getAlto()+ " ancho copiado: "+ copiada.getAncho()+ " precio "+copiada.getPrecioTotal()+ copiada.getEscudo());
 /* dos.enviar();
 dos.enviar();*/
// System.out.println(dos.getEstado());
 //+nueva.getEstado());
	}

}
