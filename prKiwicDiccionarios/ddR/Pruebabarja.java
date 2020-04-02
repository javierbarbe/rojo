package ddR;

public class Pruebabarja {

	public static void main(String[] args) {

	Baraja b = new Baraja();
	b.darCartas(35);
	System.out.println(b.siguienteCarta());
	
	b.mezclar();
	
b.mostrarBaraja();
//b.cartasMonton();
b.darCartas(6);
		
		
	}
	

}
