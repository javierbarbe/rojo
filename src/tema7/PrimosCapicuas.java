package tema7;

public class PrimosCapicuas extends Ej20a28 {
	public PrimosCapicuas() {
		
	}
	
	public int [] generaArray (int longitud) {
		
		int [] arr= new int [longitud];
		for (int i = 0;i< arr.length;i++) {
			arr[i]=(int)(Math.random()*(101-2)+2);
		}
		return arr;
	}
	public int []esprimo(int [] recibido){
		boolean primo = false;
		int contador = 0;

		for (int k = 0; k < recibido.length; k++) {
			int numero = recibido[k];
			contador = 0;
			for (int i = 2; i <= numero; i++) {
				if (numero % i == 0) {
					contador++;
				}
			}
			if (contador == 1) {
				
//				primo = true;
				String cadena=Integer.toString(numero);
				StringBuilder be= new StringBuilder();
				String revertido= new String();
			 be.append(cadena);
			 be.reverse();
			 revertido=be.toString();
//			 System.out.println(be);
//			 System.out.println(cadena);
				if(cadena.equals(revertido)) {
					System.out.print(recibido[k]+" es  primo y capicua");
					System.out.println();
				}else {
					System.out.println(recibido[k]+ " es primo y no es capicua");
				}
				
			}else {
				String cadena=Integer.toString(recibido[k]);
				StringBuilder be= new StringBuilder();
				be.append(cadena);
				be.reverse();
				String revertido=be.toString();
//				System.out.println(revertido);
//				System.out.println(cadena);
				if(cadena.equals(revertido)) {
					System.out.print(recibido[k]+" no es   primo y es capicua");
					System.out.println();
				}else {
				System.out.println(recibido[k]+" no es primo y no es capicua");
			}}
		}
		
		return recibido;
	}
	public boolean esPrimo(int [] recibido) {
		boolean primo = false;
		int contador = 0;

		for (int k = 0; k < recibido.length; k++) {
			int numero = recibido[k];
			contador = 0;
			for (int i = 2; i <= numero; i++) {
				if (numero % i == 0) {
					contador++;
				}
			}
			if (contador == 1) {
				System.out.println("es primo");
				primo = true;
			}
		}
			return  primo;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		PrimosCapicuas neo= new PrimosCapicuas();
		int [] creado= neo.generaArray(5);
		neo.imprimeArray(creado);
		creado[4]=33;
		System.out.println(neo.esprimo(creado));
		
	}

}
