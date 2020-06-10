package threads;
// una clase tambien puede heredar de threads en lugar de implementar la interfaz Runnable
public class SincronizandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios2 hilo2 = new HilosVarios2(hilo1);
		HilosVarios2 hilo3 = new HilosVarios2(hilo1);
		// como hilo2 requiere que el hilo pasado por parametro
		// haya terminado antes de comenzar... dara igual el orden en el que 
		//esten los hilos.start(); en el programa principal
		// primero se ejecutara el hilo pasado por parametro y luego el correspondiente
		hilo3.start();
		hilo2.start();
		hilo1.start();
// ---------PRIMERA PARTE 
//		HilosVarios hilo2= new HilosVarios();
		// para sincronizar hilos usamos el metodo join();
//		try {
//			hilo1.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		hilo2.start();
//		System.out.println("Terminadas las tareas");
//		try {
//			hilo2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//----------------------------------------------------
		// el syso genera un hilo propio del metodo main... empezara cuando vayan terminando los 
		// hilos o bien a la vez si no has usado el metodo join() para sincronizarlos
		System.out.println("Terminadas las tareas");
	}

}

class HilosVarios extends Thread{
	public void run() {
		for (int i = 0; i<15; i++) {
			// hay un metodo getName que devuelve el nombre del Hilo
			System.out.println("Ejecutando hilo "+i+ " "+ getName());
			// al no estar sincronizados los hilos , se intercalan los hilos
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class HilosVarios2 extends Thread{
	private Thread hilo;
	public HilosVarios2(Thread hilo) {
		this.hilo=hilo;
	}
	public void run() {
		//para decirle que no comience hasta que el hilo previo no haya terminado
		//usamos sobre hilo, el metodo join();
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i<15; i++) {
			
			System.out.println("Ejecutando hilo "+i+ " "+ getName());
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}