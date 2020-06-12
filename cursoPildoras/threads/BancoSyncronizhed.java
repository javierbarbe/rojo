package threads;



public class BancoSyncronizhed {

	public static void main(String[] args) {

		Banco b = new Banco();
		for (int i = 0; i < 100; i++) {
			// necesario instanciar la clase con la interfaz runnable dentro del for
			EjecucionTransferencias2 r = new EjecucionTransferencias2(b, i, 2000);
			Thread hilo = new Thread(r);
			hilo.start();
		}
	}

}

class Banco2 {
	public Banco2() {
		cuentas = new double[100];
		// creo un array con las cuentas
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
			// cargo en cada cuenta 2000 euros
		} // los objetos lock tienen el metodo new condition para crear objetos condition
			// es lo que uso aqui

	}

	// al hacer que un metodo sea syncronized, no requiere try finally
	// explicitamente pero... solo permite una y solo una condicion
	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad)
			throws InterruptedException {

		while (cuentas[cuentaOrigen] < cantidad) {
			// indicamos que el hilo espere
			wait();
		}

		// imprime el hilo de ejecucucion
		System.out.println(Thread.currentThread());
		// dinero que sale
		cuentas[cuentaOrigen] -= cantidad;
		System.out.printf("%10.2f cantidad a transferir desde  %d  a  %d ", cantidad, cuentaOrigen, cuentaDestino);
		// dinero que entra en la cuenta destino
		cuentas[cuentaDestino] += cantidad;
		System.out.printf(" Saldo total: %10.2f \n", getSaldoTotal());
		// aqui indicamos a nuestro objeto condition , que avise a todos los hilos que
		// esten a la espera de que ha hecho cosas
		notifyAll();


	}

	public double getSaldoTotal() {
		double sumaCuentas = 0;
		for (double a : cuentas) {
			sumaCuentas += a;
		}
		return sumaCuentas;
	}

	private final double[] cuentas;

}

class EjecucionTransferencias2 implements Runnable {
// el metodo que va a ejecutar cada hilo "run()"
	@Override
	public void run() {

		while (true) {
			int cuentaDestinoAleatoria = (int) (Math.random() * 100);
			// cantidad a transgerir
			double cantidad = cantidadMaximaTransferir * Math.random();

			b.transferencia(cuentaOrigen, cuentaDestinoAleatoria, cantidad);

			// necesario dormir los hilos
			try {
				Thread.sleep((long) (Math.random() * 10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public EjecucionTransferencias2(Banco b, int cuentaOrigen, double cantidadMaxr) {
		this.b = b;
		this.cuentaOrigen = cuentaOrigen;
		this.cantidadMaximaTransferir = cantidadMaxr;
	}

	private Banco b;
	private int cuentaOrigen;
	private double cantidadMaximaTransferir;
}