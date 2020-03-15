package tema7;

public class PruebaFigura {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Triangulo nw= new Triangulo(15,4);
		
		nw.getAltura();
		nw.setAltura(45);
		System.out.println(nw.getAltura());
		Rectangulo rec=new Rectangulo(12,5);
			System.out.println(rec.getAltura()+" esto es la altura");
			System.out.println(rec.getBase()+" esto es la base?");
			Triangulo cd= new Triangulo(nw);
			cd.setAltura(36);
			System.out.println(cd.getAltura()+" altura de la copia");
			System.out.println(nw.getAltura()+" altura del original");
		
			Figura [] figuras = new Figura[3];
			for (int i=0 ; i<figuras.length;i++) {
				int numeroRandom= (int)(Math.random()*4);
				switch ( numeroRandom){
				case 1: figuras[i]= new Rectangulo(5,3);
					break;
				case 2: figuras[i]=new Triangulo (3,6);
				break;
				case 0: figuras[i]=nw;
				break;
				case 3: figuras[i]= new Circulo(3);
					}
				}
			for ( Figura efe : figuras  ) {
				System.out.println(efe.dimeNombre());
				System.out.println(efe.getArea());
			}
//			System.out.println(figuras[1].dimeNombre());
			
	}

}
