package ddR;

public abstract class Baraja2 {



		//ATRIBUTOS
		protected Carta[] cartas;
		protected int posSiguiente;
		protected int numCartas;
		protected int cartasPorPalo;

		//CARTAS
		private static final int NUM_CARTAS = 40;

		public Baraja2() {
			this.cartas = new Carta[NUM_CARTAS];
			this.posSiguiente = 0;
			crearBaraja();

		}

		public abstract void crearBaraja() ;
			
		
		
		/*private void crearBaraja() {
			String[] palos = Carta.PALOS;
			int k = 0;
			for (int i = 0; i < palos.length; i++) {

				for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++, k++) {
					if (j == 9) {
						k -= 2;
					}
					if (!(j == 7 || j == 8)) {
						cartas[k] = new Carta(palos[i], j + 1);
					}
				}

			}

		}*/
		
		public void mezclar() {
			int remanente=posSiguiente;
		
			for ( int i= remanente; i<cartas.length;i++) {
				int aleatorio= (int)(Math.random()*(cartas.length-remanente)+remanente);
				Carta c = cartas[i];
				cartas [i]= cartas[aleatorio];
				cartas[aleatorio]= c;
			}
		}

		public void barajar() {
			posSiguiente=0;
			int posAleatoria = 0;
			Carta c;
			for (int i = 0; i < cartas.length; i++) {

				posAleatoria = (int) (Math.random() * 40);
				c = cartas[i];
				cartas[i] = cartas[posAleatoria];

				cartas[posAleatoria] = c;
			}

		}

		public Carta siguienteCarta() { // retorna una Carta

			Carta c = null;

			if (posSiguiente == NUM_CARTAS) {
				System.out.println("Ya no hay mas cartas\nBaraja de nuevo ");
			} else {
				c = cartas[posSiguiente++];
			}

			return c;

		}

		public Carta[] darCartas(int cantidad) {
		
			if (NUM_CARTAS < cantidad) {
				System.out.println("La baraja solo tiene 40 cartas");
				return null;
			}
			
			else { 
				
//			if(cartas.length-posSiguiente<cantidad) {
				if (cartasDisponibles() < cantidad) {
					System.out.println("No hay suficientes cartas");
					System.out.println(cartas.length - posSiguiente + " son las que quedan");
					System.out.println(cantidad + " SOn las que has pedido en total");
					return null;
				}
				Carta [] mano= new Carta [cantidad];
				for ( int i=0; i<mano.length;i++) {
					mano[i]=siguienteCarta();
				}
				//posSiguiente=posSiguiente;
				return mano;
			}

			//return cartas;
		}

		public int cartasDisponibles() {
			return NUM_CARTAS - posSiguiente;
		}

		public void cartasMonton() {
			for ( int i=0; i<posSiguiente;i++) {
				System.out.println(cartas[i]);
			}
		}

		public void mostrarBaraja() {
			for (int i= posSiguiente ;i<NUM_CARTAS;i++ ) {
				System.out.println(cartas[i]);
			}
		}
	

}
