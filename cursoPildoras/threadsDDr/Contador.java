package threadsDDr;

public class Contador implements Runnable {
	/*
	 * 2. Crea una clase llamada Contador que contenga un atributo que sea un
	 * contador, otro que sea el nombre del hilo y otro que sea el limite del
	 * contador, es decir, donde debe acabar. Crea varios contadores y ejecútalos.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador uno = new Contador("Hilo 1", 200);
		Contador dos = new Contador("Hilo 2", 300);
		Contador tres = new Contador("Hilo 3", 500);
		Thread pr = new Thread(uno);
		Thread ds = new Thread(dos);
		Thread tr = new Thread(tres);

		pr.start();
		ds.start();
		tr.start();
		// esperar a que terminen los hilos
		try {
			pr.join();
			ds.join();
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fin de programa");
	}

	// CONSTRUCTOR-------------------------------------------------
	public Contador(String nombreHilo, int limiteContador) {
		this.limiteContador = limiteContador;
		contador = 0;
		this.nombreHilo = nombreHilo;
	}
	//-----------------------------------------------------------------
	@Override
	public void run() {
		while (contador <= limiteContador) {

			System.out.println("El hilo: " + nombreHilo + " va por " + contador);
			contador++;
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("EL HILO " + nombreHilo + " ha llegado a su limite: " + limiteContador);

	}

	private int contador, limiteContador;
	private String nombreHilo;
}
