package threadsDDr;

public class HilosNumerosLetras implements Runnable{
	/*
	 * 1. Crea una clase llamada HiloNumerosLetras que implemente runnable y tenga 
	 * de atributo un numero llamado tipo.
		Si el tipo es 1, mostrara los numeros del 1 al 30
		Si el tipo es 2, mostrara las letras de la ‘a’ a la ‘z’.
	 */
// metodo MAIN------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HilosNumerosLetras letras = new HilosNumerosLetras(2);
		HilosNumerosLetras nums= new HilosNumerosLetras(1);
		Thread hilo2= new Thread(nums);
		Thread hilo = new Thread(letras);
		hilo.start();
		
		hilo2.start();
	}
	//------------------------------fin metodo main
	// CONSTRUCTOR
	public HilosNumerosLetras (int tipo) {
		this.tipo=tipo;
	}
	@Override
	public void run() {
	while (true) {
		if (tipo==1) {
			for (int i=1; i<31; i++) {
			System.out.println(i);
			}
		}else if (tipo==2) {
//			for (int i=0; i<alfabeto.length(); i++) {
//				System.out.println(alfabeto.charAt(i));
//			}
			for (char c='a'; c<'z'; c++) {
				System.out.println(c);
			}
		}
	}
	}
	private String alfabeto="abcdefghijklmnñopqrstuvwxyz";
	private int tipo;
	// quiza habria que hacer un paquete de opciones... eso tenia nombre ENUMERADOS



	
}
