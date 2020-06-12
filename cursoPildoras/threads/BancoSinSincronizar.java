package threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

	public static void main(String[] args) {
//		int [] salidos= new int [101];
//		
//		for (int i = 0 ; i<salidos.length ; i++) {
//			
//			int aleatorio =(int) (Math.random()*100);
//			salidos [i]= aleatorio;
//			for ( int j=0; j<i; j++) {
//				if(salidos[j]==salidos[i] && i!=j) {
//					salidos[i]= (int) (Math.random()*100);
//					
//					j=0;
//				}
//			}
//			
//		
//	}
//		for (int i = 0; i< salidos.length;i++) {
//			if (i%10==0) {
//				System.out.println();
//			}
//			System.out.printf("%5s",salidos[i]+" ");
//		}
		
		Banco b = new Banco();
		for (int i=0; i<100; i++) {
			//necesario instanciar la clase con la interfaz runnable dentro del for
			EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);
			Thread hilo = new Thread(r);
			hilo.start();
		}
		}

}
class Banco {
	public Banco() {
		cuentas = new double [100];
		//creo un array con las cuentas
		for (int i = 0; i<cuentas.length;i++) {
			cuentas[i]=2000;
			//cargo en cada cuenta 2000 euros
		} // los objetos lock tienen el metodo new condition para crear objetos condition
		// es lo que uso aqui 
		saldoSuficiente= cierreBanco.newCondition();
	}
	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {
		 
		// este es el pedazo de codiho que requiere esperas no hacer una transferencia 
		// hasta haber terminado la anterior
		cierreBanco.lock();
		// para introducir el codigo, se mete dentro de un bloque try catch finally ( que hara 
		// que pase lo que pase, se desbloquee el hilo
		
		try {
			
			while (cuentas[cuentaOrigen]<cantidad) {
				// mientras esa condicio nsea verdad, ese hilo se pone a la espera
				saldoSuficiente.await();
			}
//------------------------------------------------------------------------------------------------
		// hay que controlar que la cantidad no rebase el salario de la cuenta origen
//		if ( cantidad > cuentas[cuentaOrigen]) {
//			System.out.println("No hay suficiente saldo");
//			System.out.printf("%10.2f cantidad a transferir desde  %d  a  %d ", cantidad,cuentaOrigen, cuentaDestino);
//			System.out.println();
//			System.out.println("hay un saldo en la cuenta origen de "+cuentas[cuentaOrigen]);
//			System.out.println("-------------------------------");
//			return; // esta instruccion que hace'???? (detener el flujo??)
//		}
//-----------------------------------------------------------------------------------------------------
		// imprime el hilo de ejecucucion
		System.out.println(Thread.currentThread());
		// dinero que sale 
		cuentas[cuentaOrigen]-=cantidad;
		System.out.printf("%10.2f cantidad a transferir desde  %d  a  %d ", cantidad,cuentaOrigen, cuentaDestino);
		//dinero que entra en la cuenta destino
		cuentas[cuentaDestino]+=cantidad;
		System.out.printf(" Saldo total: %10.2f \n", getSaldoTotal());
		// aqui indicamos a nuestro objeto condition , que avise a todos los hilos que esten a la espera de que ha hecho cosas
		saldoSuficiente.signalAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			cierreBanco.unlock();
		}
	}
	public double getSaldoTotal() {
		double sumaCuentas=0;
		for (double a : cuentas) {
			sumaCuentas+=a;
		}
		return sumaCuentas;
	}
	
	private final double [] cuentas;
	//usaremos una instancia de la interfaz Lock que permitirá bloquear codigo durante la ejecucion 
	// de un hilo
	private Lock cierreBanco = new ReentrantLock();
	// nos permitira usar sus metodos lock y unlock 
	// para crear condiciones en el lock uso un objeto condition
	private Condition saldoSuficiente ;
}

class EjecucionTransferencias implements Runnable{
// el metodo que va a ejecutar cada hilo "run()"
	@Override
	public void run() {
		
		while (true) {
			int cuentaDestinoAleatoria =(int)(Math.random()*100);
			// cantidad a transgerir
			double cantidad = cantidadMaximaTransferir*Math.random();
			
		
			
			//necesario dormir los hilos
			try {
				b.transferencia(cuentaOrigen, cuentaDestinoAleatoria, cantidad);
				Thread.sleep((long) (Math.random()*10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public EjecucionTransferencias(Banco b2, int cuentaOrigen, double cantidadMaxr) {
		this.b=b2;
		this.cuentaOrigen=cuentaOrigen;
		this.cantidadMaximaTransferir=cantidadMaxr;
	}
	
	private Banco b;
	private int cuentaOrigen;
	private double cantidadMaximaTransferir;
}