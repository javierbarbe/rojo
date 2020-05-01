package tema9ActProouestasIvan;



public class Ej15ListaEnlazadaCreada {
	/*
	 * Implementa una cola utilizando una lista enlazada simple (será programada íntegramente por  el alumno, 
	 * sin usar librerías específicas de listas de Java). La clase debe llamarse ColaDinamica. 
	 * Para probarlo, incorporaremos objetos de la clase Character, cuyos valores serán las letras del abecedario.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ColaDinamica <Object> micola= new ColaDinamica<>();
			micola.aniadeAlFinal("hola");
			String saludo= "como estas";
			
			micola.aniadeAlFinal(saludo);
			micola.aniadeAlFinal("adios");
			micola.aniadePrincipio(new Persona("javier", "barbero",1992));
//			for (Object o: ColaDinamica.arrDefault) {
//				System.out.println(o);
//			}
			System.out.println("muestro la lista");
			micola.mostrarLista();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(micola.buscar(new Persona ("javier", "barbero",1992)));
			System.out.println(micola.buscar(saludo));
			micola.eliminarNodo(5);
			micola.mostrarLista();
			micola.eliminarNodo(1);
			micola.mostrarLista();

	}

}

class ColaDinamica<E> {
	static Integer tamanio;
	//static ArrayList <Object> milista = new ArrayList<>();
	static Object [] arrDefault;
	static Object [] aux;
	public ColaDinamica() {
	
	}
	public void aniadeAlFinal(Object o) {
		
		//milista.add(0, o );
		try {
			tamanio= arrDefault.length;
			if (tamanio>0 && tamanio!=null) {
				tamanio+=1;
			}
		}catch (Exception e) {
			tamanio=1;
		}aux= new Object[tamanio];
		if(tamanio<2) {
			arrDefault = new Object [tamanio];
		}
		System.arraycopy(arrDefault, 0, aux, 0, tamanio-1);
		arrDefault = new Object [tamanio];
		
		for( int i = 0; i <aux.length;i++) {
			arrDefault[i]=aux[i];
		}
		arrDefault[tamanio-1]=o;
		tamanio++;
		
		
	}
	
	public void aniadePrincipio(Object o) {
		try {
			tamanio= arrDefault.length;
			if (tamanio>0 && tamanio!=null) {
				tamanio+=1;
			}
		}catch (Exception e) {
			tamanio=1;
		}aux= new Object[tamanio];
		if(tamanio<2) {
			arrDefault = new Object [tamanio];
		}
		System.arraycopy(arrDefault, 0, aux, 0, tamanio-1);
		arrDefault = new Object [tamanio];
		
		for( int i = 0; i <aux.length-1;i++) {
			arrDefault[i+1]=aux[i];
		}
		arrDefault[0]=o;
		tamanio++;
		
		
	}
	
	public boolean buscar(Object o) {
		boolean encontrado=false;
		for (Object p : arrDefault) {
			if (p.equals(o)) {
				encontrado=true;
			
			}if (encontrado) {
				return true;
			}
		}return false;
	
	}
	public void mostrarLista() {
		for (Object o : arrDefault) {
			System.out.println(o);
		}
	}
	
	public void eliminarNodo(int posicion) {
		boolean pasado=false;
		int auxil;
		try {
			tamanio= arrDefault.length;
			
		}catch (Exception e) {
			System.out.println("no hay elementos en la lista");
		}
		aux= new Object[tamanio-1];
		
			arrDefault[posicion]=null;
		for (int h= 0; h<arrDefault.length;h++) {
	
			if (arrDefault[h]!=null) {
					
						if (pasado) {
							auxil=h;
							auxil--;
							aux[auxil]=arrDefault[h];
							pasado=false;
						}else {
						
							aux[h]=arrDefault[h];
						}
					
				}else {
					pasado=true;
				}
			
		}
		
			
			
		arrDefault = new Object [tamanio-1];
		
		for( int i = 0; i <aux.length;i++) {
			arrDefault[i]=aux[i];
		}
		
		
		
		
		
	}
}