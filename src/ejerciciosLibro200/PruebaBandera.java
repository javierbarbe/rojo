package ejerciciosLibro200;

public class PruebaBandera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BanderaEspaña nueva=new BanderaEspaña();
nueva.calculaPrecio();
nueva.enviar();
 
 //System.out.println( nueva.getEstado());
 
System.out.println(BanderaEspaña.getTotalEnviadas()+ " Banderas enviadas");
BanderaEspaña dos=new BanderaEspaña();
dos.calculaPrecio();
dos.enviar();
System.out.println(BanderaEspaña.getTotalEnviadas()+ " banderas enviadas");
BanderaEspaña copiada= new BanderaEspaña();

copiada.constructorCopia(dos);
System.out.println("alto copiado: "+ copiada.getAlto()+ " ancho copiado: "+ copiada.getAncho()+ " precio "+copiada.getPrecioTotal()+ copiada.getEscudo());
 /* dos.enviar();
 dos.enviar();*/
// System.out.println(dos.getEstado());
 //+nueva.getEstado());
	}

}
