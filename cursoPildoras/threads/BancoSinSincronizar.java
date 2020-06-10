package threads;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("hola\n mama");
	}

}
class Banco {
	public Banco() {
		cuentas = new double [100];
		//creo un array con las cuentas
		for (int i = 0; i<cuentas.length;i++) {
			cuentas[i]=2000;
			//cargo en cada cuenta 2000 euros
		}
	}
	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {
		 
		// hay que controlar que la cantidad no rebase el salario de la cuenta origen
		if ( cantidad > cuentas[cuentaOrigen]) {
			System.out.println("No hay suficiente saldo");
			return; // esta instruccion que hace'???? (detener el flujo??)
		}
		// imprime el hilo de ejecucucion
		System.out.println(Thread.currentThread());
		// dinero que sale 
		cuentas[cuentaOrigen]-=cantidad;
		System.out.printf("%10.2f cantidad a transferir desde  %5d cuenta Origen a  %5d cuenta Destino", cantidad,cuentaOrigen, cuentaDestino);
		//dinero que entra en la cuenta destino
		cuentas[cuentaDestino]+=cantidad;
		System.out.printf("Saldo total %10.2f \n", getSaldoTotal());
	}
	public double getSaldoTotal() {
		double sumaCuentas=0;
		for (double a : cuentas) {
			sumaCuentas+=a;
		}
		return sumaCuentas;
	}
	
	private final double [] cuentas;
}

class EjecucionTransferencias implements Runnable{
// el metodo que va a ejecutar cada hilo "run()"
	@Override
	public void run() {
		
		while (true) {
			
		}
	}
	
	public EjecucionTransferencias(Banco b, int cuentaOrigen, double cantidadMaxr) {
		this.b=b;
		this.cuentaOrigen=cuentaOrigen;
		this.cantidadMaximaTransferir=cantidadMaxr;
	}
	
	private Banco b;
	private int cuentaOrigen;
	private double cantidadMaximaTransferir;
}